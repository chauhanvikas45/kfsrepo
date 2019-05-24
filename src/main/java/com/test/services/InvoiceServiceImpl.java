package com.test.services;

import com.test.dto.CustomerDto;
import com.test.dto.InvoiceDto;
import com.test.dto.ProductDto;
import com.test.entity.Invoice;
import com.test.mapper.CustomerMapper;
import com.test.mapper.InvoiceMapper;
import com.test.mapper.ProductMapper;
import com.test.repository.InvoiceRepository;
import com.test.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class InvoiceServiceImpl implements InvoiceService {

    @Autowired
    InvoiceRepository invoiceRepository;
    @Autowired
    ProductRepository productRepository;


    @Override
    public List<Invoice> getInvoiceDetails(String invoiceNumber) {
        List<Invoice> invoiceList = new ArrayList<>();
        invoiceRepository.findAll().forEach(invoice -> {
            invoiceList.add(invoice);
        });
        return invoiceList;
    }

    @Override
    public String generateInvoice(ProductDto productDto, Model model) {

        InvoiceDto invoiceDto = new InvoiceDto();
        invoiceDto.setCustomer(productDto.getCustomer());
        //Product product = productRepository.findById(product.getId();
        //if(productDto.getProductQuantity() > )
        invoiceDto.setProduct(ProductMapper.mapDtoToEntity(productDto));
        invoiceDto.setTotalAmount(calculateInvoiceAmount(productDto, invoiceDto));

        Invoice invoice = InvoiceMapper.invoiceDtoToEntity(invoiceDto);

        invoiceRepository.save(invoice);
        invoiceDto.setCurrentDate(LocalDate.now());
        return getInvoice(model, invoiceDto);
    }


    @Override
    public List<Invoice> getInvoiceListForCustomer(CustomerDto customerDto) {
        List<Invoice> invoiceList = new ArrayList<>();

        invoiceRepository.getInvoiceListByCustomers(CustomerMapper.mapCustomerDtoToEntity(customerDto)).forEach(invoice -> {
            invoiceList.add(invoice);
        });

        return invoiceList;
    }

    private String calculateInvoiceAmount(ProductDto productDto, InvoiceDto invoiceDto) {

        int totalAmount = 0;
        int cgst=0;
        int sgst=0;
        int igst=0;

        totalAmount = totalAmount + Integer.parseInt(productDto.getProductQuantity()) * Integer.parseInt(productDto.getProductRate());
        if (null != invoiceDto.getProduct().getCgst() &&invoiceDto.getProduct().getCgst().equals("true")){
            cgst =getCgstTax(totalAmount);
            invoiceDto.getProduct().setCgst(String.valueOf(cgst));
        }

        if (null != invoiceDto.getProduct().getSgst() && invoiceDto.getProduct().getSgst().equals("true")){
            sgst=getSgstTax(totalAmount);
            invoiceDto.getProduct().setSgst(String.valueOf(sgst));
        }

        if (null != invoiceDto.getProduct().getIgst() && invoiceDto.getProduct().getIgst().equals("true")){
            igst =getIgstTax(totalAmount);
            invoiceDto.getProduct().setIgst(String.valueOf(igst));
        }


        invoiceDto.setAmountWithoutTax(String.valueOf(totalAmount));
        invoiceDto.setTotalTax(String.valueOf(sgst+igst+cgst));
        totalAmount = totalAmount + sgst+igst+cgst;

        //System.out.println("tax " + getCgstTax(totalAmount) + " " + getIgstTax(totalAmount) + " " + getSgstTax(totalAmount));

        return String.valueOf(totalAmount);
    }

    private int getSgstTax(int totalAmount) {
        int i = (totalAmount * 9) / 100;
        return i;

    }

    private int getCgstTax(int totalAmount) {
        int i = (totalAmount * 9) / 100;
        return i;

    }

    private int getIgstTax(int totalAmount) {
        int i = (totalAmount * 18) / 100;
        return i;

    }

    private int getTotaltax(int totalAmount) {
        return getCgstTax(totalAmount) + getIgstTax(totalAmount) + getSgstTax(totalAmount);
    }

    private String getInvoice(Model model, InvoiceDto invoiceDto) {
        model.addAttribute("invoice", invoiceDto);
        return "index";
    }

    private static boolean isNull(String param) {
        if (null == param && param.isEmpty())
            return true;

        return false;
    }


}
