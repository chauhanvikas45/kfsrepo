package com.test.services;

import com.test.dto.CustomerBranchDto;
import com.test.dto.CustomerDto;
import com.test.dto.ResponseDto;
import com.test.entity.Customer;
import com.test.mapper.CustomerMapper;
import com.test.repository.CustomerBranchRepository;
import com.test.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CustomerBranchRepository customerBranchRepository;


    @Override
    @Transactional
    public void addNewCustomer(CustomerDto customerDto) throws Exception {

        Customer customer=CustomerMapper.mapCustomerDtoToEntity(customerDto);
        if(customerRepository.getCustomerByCustomerName(customer.getCustomerName()).size()!=0) {

         throw new Exception("Customer Already Exists With Name : "+customer.getCustomerName());
        }
        else
        {
            customerRepository.save(customer);
        }
          //List<Customer> customer = customerRepository.getCustomerByCustomerName("gg");

          //customer.stream().forEach(System.out::println);
    }

    @Override
    public List<CustomerDto> getCustomerList() {
        List<CustomerDto> customerList = new ArrayList<>();
        customerRepository.findAll().forEach(customer -> {
            customerList.add(CustomerMapper.mapCustomerEntityToDto(customer));
        });
        return customerList;
    }

    @Override
    public List<CustomerBranchDto> getCustomerBranchListForCustomer(String customerName) throws RuntimeException{
        List<Customer> customerList = new ArrayList<>();
        List<CustomerBranchDto> customerBranchDtoList = new ArrayList<>();
        customerList=customerRepository.getCustomerByCustomerName(customerName);
        if (customerList.size()!=0)
        customerList.get(0).getCustomerBranches().stream().forEach( customerBranch->
                customerBranchDtoList.add(CustomerMapper.mapCustomerBranchEntityToDto(customerBranch))
        );
        else
        {
           throw new RuntimeException("Customer Not Found");
        }
        System.out.println(customerBranchDtoList);
        return customerBranchDtoList;
    }
}
