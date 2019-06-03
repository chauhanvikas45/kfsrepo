package com.test.services;

import com.test.dto.CustomerDto;
import com.test.entity.Customer;

import java.util.List;

public interface CustomerService {

    void addNewCustomer(CustomerDto customerDto);
    List<CustomerDto> getCustomerList();
}
