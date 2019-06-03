package com.test.mapper;

import com.test.dto.CustomerDto;
import com.test.entity.Customer;


public class CustomerMapper {

    public static Customer mapCustomerDtoToEntity(final CustomerDto customerDto){
        Customer customer = new Customer();
        customer.setId(customerDto.getId());
        customer.setCustomerName(customerDto.getCustomerName());
        customer.setCustomerGSTIN(customerDto.getCustomerGSTIN());
        return customer;

    }

    public static CustomerDto mapCustomerEntityToDto(Customer customer){
        CustomerDto customerDto = new CustomerDto();
        customerDto.setId(customer.getId());
        customerDto.setCustomerName(customer.getCustomerName());
        customerDto.setCustomerGSTIN(customer.getCustomerGSTIN());
        return customerDto;
    }

}
