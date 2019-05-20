package com.test.services;

import com.test.dto.CustomerDto;
import com.test.dto.InvoiceDto;
import com.test.entity.Invoice;

import java.util.List;

public interface InvoiceService {
    List<Invoice> getInvoiceDetails(String invoiceNumber);

    void generateInvoice(InvoiceDto invoiceDto);

    List<Invoice> getInvoiceListForCustomer(CustomerDto customerDto);
}
