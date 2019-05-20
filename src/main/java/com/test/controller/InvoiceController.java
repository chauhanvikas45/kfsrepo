package com.test.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.test.dto.CustomerDto;
import com.test.dto.InvoiceDto;
import com.test.entity.Invoice;
import com.test.services.InvoiceService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InvoiceController {

    private InvoiceService invoiceService;

    public InvoiceController(InvoiceService invoiceService) {
        this.invoiceService= invoiceService;
    }

    @CrossOrigin
    @RequestMapping(path = "/getInvoice/{invoiceNumber}", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity getInvoiceDetails(@PathVariable String invoiceNumber) throws JsonProcessingException {
        List<Invoice> invoiceList = invoiceService.getInvoiceDetails(invoiceNumber);
        return new ResponseEntity(invoiceList.get(0), HttpStatus.OK);
    }

    @CrossOrigin
    @RequestMapping(path = "/getInvoiceList/{customerId}", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity getInvoiceListForCustomer(@PathVariable Integer customerId) throws JsonProcessingException {
        CustomerDto customerDto = new CustomerDto();
        customerDto.setId(customerId);
        List<Invoice> invoiceList = invoiceService.getInvoiceListForCustomer(customerDto);
        return new ResponseEntity(invoiceList, HttpStatus.OK);
    }


    @CrossOrigin
    @RequestMapping(path = "/generateInvoice", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity generateInvoiceForProduct(InvoiceDto invoiceDto) throws JsonProcessingException {
        invoiceService.generateInvoice(invoiceDto);
        return new ResponseEntity("Success", HttpStatus.OK);
    }



}
