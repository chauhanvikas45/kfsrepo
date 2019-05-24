package com.test.services;

import com.test.dto.CustomerDto;
import com.test.dto.InvoiceDto;
import com.test.dto.ProductDto;
import com.test.entity.Invoice;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

public interface InvoiceService {
    List<Invoice> getInvoiceDetails(String invoiceNumber);

    String generateInvoice(ProductDto productDto,Model model);

    List<Invoice> getInvoiceListForCustomer(CustomerDto customerDto);

    //String getInvoice(Model model,InvoiceDto invoiceDto) ;

}
