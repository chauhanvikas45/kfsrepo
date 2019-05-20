package com.test.mapper;

import com.test.dto.CustomerDto;
import com.test.entity.Customer;


public class CustomerMapper {

    public static Customer mapCustomerDtoToEntity(final CustomerDto customerDto){
        Customer customer = new Customer();
        customer.setId(customerDto.getId());
        customer.setCustomerName(customerDto.getCustomerName());
        customer.setCustomerAddress(customerDto.getCustomerAddress());
        customer.setCustomerCode(customerDto.getCustomerCode());
        customer.setCustomerEmail(customerDto.getCustomerEmail());
        customer.setCustomerGSTIN(customerDto.getCustomerGSTIN());
        customer.setCustomerPhone(customerDto.getCustomerPhone());
        customer.setCustomerState(customerDto.getCustomerState());
        return customer;

    }

    public static CustomerDto mapCustomerEntityToDto(Customer customer){
        CustomerDto customerDto = new CustomerDto();
        customerDto.setId(customer.getId());
        customerDto.setCustomerName(customer.getCustomerName());
        customerDto.setCustomerAddress(customer.getCustomerAddress());
        customerDto.setCustomerCode(customer.getCustomerCode());
        customerDto.setCustomerEmail(customer.getCustomerEmail());
        customerDto.setCustomerGSTIN(customer.getCustomerGSTIN());
        customerDto.setCustomerPhone(customer.getCustomerPhone());
        customerDto.setCustomerState(customer.getCustomerState());
        return customerDto;
    }

}
