package com.test.mapper;

import com.test.dto.InvoiceDto;
import com.test.entity.Invoice;

public class InvoiceMapper {


    public static Invoice invoiceDtoToEntity(InvoiceDto invoiceDto){
        Invoice invoice = new Invoice();

        invoice.setCustomers(invoiceDto.getCustomer());
        invoice.setId(invoiceDto.getId());
        invoice.setInvoiceNumber(invoiceDto.getInvoiceNumber());
        invoice.setProductId(invoiceDto.getProduct());
        invoice.setTotalAmount(invoiceDto.getTotolAmount());

        return invoice;
    }
}
