package com.test.services;

import com.test.dto.CustomerDto;
import com.test.dto.InvoiceDto;
import com.test.dto.ProductDto;
import com.test.entity.Customer;
import com.test.entity.Invoice;
import com.test.entity.Product;
import com.test.mapper.CustomerMapper;
import com.test.mapper.InvoiceMapper;
import com.test.mapper.ProductMapper;
import com.test.repository.InvoiceRepository;
import com.test.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InvoiceServiceImpl implements InvoiceService{

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
    public void generateInvoice(InvoiceDto invoiceDto) {
        CustomerDto customerDto = new CustomerDto();
        customerDto.setId(1);
        customerDto.setCustomerName("asdas");
        customerDto.setCustomerAddress("sdadas");
        customerDto.setCustomerCode("sadas");
        customerDto.setCustomerEmail("afdsdv");
        customerDto.setCustomerGSTIN("sdf");
        customerDto.setCustomerPhone("e2e22e");
        customerDto.setCustomerState("fhaga");

        invoiceDto.setCustomer(CustomerMapper.mapCustomerDtoToEntity(customerDto));

        ProductDto productDto = new ProductDto();
        productDto.setCgst("3");
        productDto.setProductRate("2");
        productDto.setProductQuantity("4");
        productDto.setProductUON("ADS");
        productDto.setProductHSNCode("AD");
        productDto.setProductDescription("fdfsdfsdf");
        productDto.setProductName("fsdfsdfs");
        productDto.setId(2);
        productDto.setIgst("3");
        productDto.setSgst("0");
        Customer customer = CustomerMapper.mapCustomerDtoToEntity(customerDto);
        productDto.setCustomer(customer);

        //Product produc = new Product();
        //ProductMapper.mapDtoToEntity(productDto);
        invoiceDto.setId(1);
        invoiceDto.setInvoiceNumber("12312");
        invoiceDto.setTotolAmount("23123");
        Product product = ProductMapper.mapDtoToEntity(productDto);
        invoiceDto.setProduct(product);

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


    public static void main(String[] args) {
        InvoiceServiceImpl invoiceService = new InvoiceServiceImpl();
        invoiceService.generateInvoice(new InvoiceDto());
    }
}
