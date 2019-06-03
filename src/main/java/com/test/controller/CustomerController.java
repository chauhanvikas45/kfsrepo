package com.test.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.test.dto.CustomerDto;
import com.test.entity.Customer;
import com.test.services.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService=customerService;
    }

    @CrossOrigin
    @RequestMapping(path = "/addCustomer", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)

    public ResponseEntity addCustomer(@RequestBody CustomerDto customerDto) {

        customerService.addNewCustomer(customerDto);

        return new ResponseEntity("Success".toString(), HttpStatus.CREATED);
    }


    @CrossOrigin
    @RequestMapping(path = "/getCustomerList", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity getCustomerList() throws JsonProcessingException {
        List<CustomerDto> customerList = customerService.getCustomerList();
        System.out.println(customerList);
        return new ResponseEntity(customerList, HttpStatus.OK);
    }


}
