package com.test.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.dto.InvoiceDto;
import com.test.entity.Invoice;
import com.test.services.CustomerService;
import com.test.services.InvoiceService;
import com.test.services.ProductService;
import com.test.dto.CustomerDto;
import com.test.dto.ProductDto;
import com.test.entity.Customer;
import com.test.entity.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
/*@RequestMapping(path = "/",
        method = {RequestMethod.GET, RequestMethod.POST})*/
public class KfsController {

/*
    private CustomerService customerService;
    private ProductService productService;
    private InvoiceService invoiceService;
*/

 /*   public KfsController(CustomerService customerService, ProductService productService, InvoiceService invoiceService) {
        this.customerService = customerService;
        this.productService = productService;
        this.invoiceService=invoiceService;
    }*/


    @RequestMapping(value = "/hello",
            produces = "application/json",
            method = RequestMethod.GET)
    public String hello() {
        return "Helloooo ";
    }


}
