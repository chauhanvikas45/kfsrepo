package com.test.services;

import com.test.dto.CustomerDto;
import com.test.dto.InvoiceDto;
import com.test.dto.ProductDto;
import com.test.entity.Invoice;
import com.test.mapper.CustomerMapper;
import com.test.mapper.InvoiceMapper;
import com.test.mapper.ProductMapper;
import com.test.repository.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Service
public class InvoiceServiceImpl implements InvoiceService {

    @Autowired
    InvoiceRepository invoiceRepository;


    @Override
    public List<Invoice> getInvoiceDetails(String invoiceNumber) {
        List<Invoice> invoiceList = new ArrayList<>();
        invoiceRepository.findAll().forEach(invoice -> {
            invoiceList.add(invoice);
        });
        return invoiceList;
    }

    @Override
    public void generateInvoice(ProductDto productDto) {
        InvoiceDto invoiceDto = new InvoiceDto();
        invoiceDto.setCustomer(productDto.getCustomer());
        invoiceDto.setProduct(ProductMapper.mapDtoToEntity(productDto));
        invoiceDto.setTotolAmount(calculateInvoiceAmount(productDto));
        //invoiceDto.setInvoiceNumber("generated");

        Invoice invoice = InvoiceMapper.invoiceDtoToEntity(invoiceDto);

        invoiceRepository.save(invoice);

    }

    @Override
    public List<Invoice> getInvoiceListForCustomer(CustomerDto customerDto) {
        List<Invoice> invoiceList = new ArrayList<>();

        invoiceRepository.getInvoiceListByCustomers(CustomerMapper.mapCustomerDtoToEntity(customerDto)).forEach(invoice -> {
            invoiceList.add(invoice);
        });
        return invoiceList;
    }

    private String calculateInvoiceAmount(ProductDto productDto) {

        int totalAmount = 0;

        totalAmount = totalAmount + Integer.parseInt(productDto.getProductQuantity()) * Integer.parseInt(productDto.getProductRate());

        if (null != productDto.getCgst()) {
            totalAmount = (totalAmount) * 9;
        }
        if (null != productDto.getSgst()) {
            totalAmount = (totalAmount) * 9;
        }
        if (null != productDto.getIgst()) {
            totalAmount = (totalAmount) * 18;
        }

        return String.valueOf(totalAmount);
    }


    public String getInvoice(Model model) {
        model.addAttribute("message", "hello vikas!!!!!!!!");
        return "index";
    }

    private static boolean isNull(String param) {
        if (null == param && param.isEmpty())
            return true;

        return false;
    }


}
