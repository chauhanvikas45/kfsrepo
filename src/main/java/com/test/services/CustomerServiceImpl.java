package com.test.services;

import com.test.dto.CustomerDto;
import com.test.entity.Customer;
import com.test.mapper.CustomerMapper;
import com.test.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public void addNewCustomer(CustomerDto customerDto) {

        //Customer customer = new Customer();
          customerRepository.save(CustomerMapper.mapCustomerDtoToEntity(customerDto));
    }

    @Override
    public List<Customer> getCustomerList() {
        List<Customer> customerList = new ArrayList<>();
        customerRepository.findAll().forEach(customer -> {
            customerList.add(customer);
        });


        return customerList;
    }
}
