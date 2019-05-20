package com.test.repository;

import com.test.dto.CustomerDto;
import com.test.entity.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends CrudRepository<Customer,String> {

        List<Customer> getCustomerByCustomerName(String customerName);
        }
