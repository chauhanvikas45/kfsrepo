package com.test.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.test.dto.CustomerBranchDto;
import com.test.dto.CustomerDto;
import com.test.dto.ResponseDto;
import com.test.entity.Customer;
import com.test.entity.CustomerBranch;
import com.test.services.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class CustomerController {

    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService=customerService;
    }

    @CrossOrigin
    @RequestMapping(path = "/customer", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)

    public ResponseEntity addCustomer(@RequestBody CustomerDto customerDto) {
        try {
            customerService.addNewCustomer(customerDto);
            return new ResponseEntity(new ResponseDto(HttpStatus.CREATED.value(),"Success",null).toString(), HttpStatus.OK);
        }
        catch(Exception e)
        {
            return new ResponseEntity(new ResponseDto(HttpStatus.CONFLICT.value(),e.getMessage(),null).toString(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @CrossOrigin
    @RequestMapping(path = "/customers", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity getCustomerList() throws JsonProcessingException {
        List<CustomerDto> customerList = customerService.getCustomerList();
        System.out.println(customerList);
        return new ResponseEntity(customerList, HttpStatus.OK);
    }

    @CrossOrigin
    @RequestMapping(path = "/customerBranches/{customerName}", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity getCustomerBranchList(@PathVariable String customerName){
        try {
            List<CustomerBranchDto> customerBranchList = customerService.getCustomerBranchListForCustomer(customerName);
            return new ResponseEntity(customerBranchList, HttpStatus.OK);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return new ResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }


}
