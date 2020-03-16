package com.test.mapper;

import com.test.dto.CustomerBranchDto;
import com.test.dto.CustomerDto;
import com.test.entity.Customer;
import com.test.entity.CustomerBranch;

import java.util.ArrayList;
import java.util.List;


public class CustomerMapper {

    public static Customer mapCustomerDtoToEntity(final CustomerDto customerDto) {
        Customer customer = new Customer();
        customer.setId(customerDto.getId());
        customer.setCustomerName(customerDto.getCustomerName());
        customer.setCustomerGSTIN(customerDto.getCustomerGSTIN());
//        customer.setCustomerBranch(customerDto.getCustomerBranch());
        customerBranchesDtoToEntity(customerDto,customer);
        return customer;

    }

    public static CustomerDto mapCustomerEntityToDto(Customer customer) {
        CustomerDto customerDto = new CustomerDto();
        customerDto.setId(customer.getId());
        customerDto.setCustomerName(customer.getCustomerName());
        customerDto.setCustomerGSTIN(customer.getCustomerGSTIN());
//        customerDto.setCustomerBranch(customer.getCustomerBranch());
        customerBranchesEntityToDto(customer,customerDto);
        return customerDto;
    }

    public static CustomerBranchDto mapCustomerBranchEntityToDto(CustomerBranch customerBranch) {
        CustomerBranchDto customerBranchDto = new CustomerBranchDto();
        customerBranchDto.setCustomerId(customerBranch.getCustomerId());
        customerBranchDto.setCustomerPhone(customerBranch.getCustomerPhone());
        customerBranchDto.setCustomerEmail(customerBranch.getCustomerEmail());
        customerBranchDto.setCustomerAddress(customerBranch.getCustomerAddress());
        customerBranchDto.setBranchName(customerBranch.getBranchName());
        customerBranchDto.setCustomerCode(customerBranch.getCustomerCode());
        customerBranchDto.setCustomerState(customerBranch.getCustomerState());
        customerBranchDto.setId(customerBranch.getId());
        customerBranchDto.setDeletionFlag(customerBranch.isDeletionFlag());
        customerBranchDto.setProduct(customerBranch.getProduct());

        return customerBranchDto;
    }


    public static CustomerBranch mapCustomerBranchDtoToEntity(CustomerBranchDto customerBranchDto) {
        CustomerBranch customerBranch = new CustomerBranch();
        customerBranch.setCustomerId(customerBranchDto.getCustomerId());
        customerBranch.setCustomerPhone(customerBranchDto.getCustomerPhone());
        customerBranch.setCustomerEmail(customerBranchDto.getCustomerEmail());
        customerBranch.setCustomerAddress(customerBranchDto.getCustomerAddress());
        customerBranch.setBranchName(customerBranchDto.getBranchName());
        customerBranch.setCustomerCode(customerBranchDto.getCustomerCode());
        customerBranch.setCustomerState(customerBranchDto.getCustomerState());
        customerBranch.setId(customerBranchDto.getId());
        customerBranch.setDeletionFlag(customerBranchDto.isDeletionFlag());
        customerBranch.setProduct(customerBranchDto.getProduct());

        return customerBranch;

    }

    private static void customerBranchesDtoToEntity(CustomerDto customerDto, Customer customer) {
        List <CustomerBranch> branches=customerDto.getCustomerBranch();

        if (null!=branches && branches.size()!=0)
        {
            branches.stream().forEach(branch->{
                customer.addCustomerBranches(branch);
            });
        }
    }
    private static void customerBranchesEntityToDto( Customer customer,CustomerDto customerDto) {
        List <CustomerBranch> branches=customer.getCustomerBranches();
        customerDto.setCustomerBranch(new ArrayList<>());
        {
            branches.stream().forEach(branch->{
                customerDto.getCustomerBranch().add(branch);
            });
        }


    }
}
