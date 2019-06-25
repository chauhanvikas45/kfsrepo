package com.test.mapper;

import com.test.dto.CustomerBranchDto;
import com.test.entity.CustomerBranch;

public class CustomerBranchMapper {

    public static CustomerBranch mapCustomerBranchDtoToEntity(CustomerBranchDto customerBranchDto){
        CustomerBranch customerBranch = new CustomerBranch();
        customerBranch.setBranchName(customerBranchDto.getBranchName());
        customerBranch.setCustomerAddress(customerBranchDto.getCustomerAddress());
        customerBranch.setCustomerCode(customerBranchDto.getCustomerCode());
        customerBranch.setCustomerEmail(customerBranchDto.getCustomerEmail());
        customerBranch.setCustomerPhone(customerBranchDto.getCustomerPhone());
        customerBranch.setCustomerState(customerBranchDto.getCustomerState());
//        customerBranch.setCustomerId(customerBranchDto.getCustomer());
        return customerBranch;
    }

    public static CustomerBranchDto mapCustomerBranchEntityToDto(CustomerBranch customerBranch){
        CustomerBranchDto customerBranchDto = new CustomerBranchDto();
        customerBranchDto.setBranchName(customerBranch.getBranchName());
        customerBranchDto.setCustomerAddress(customerBranch.getCustomerAddress());
        customerBranchDto.setCustomerCode(customerBranch.getCustomerCode());
        customerBranchDto.setCustomerEmail(customerBranch.getCustomerEmail());
        customerBranchDto.setCustomerPhone(customerBranch.getCustomerPhone());
        customerBranchDto.setCustomerState(customerBranch.getCustomerState());
//        customerBranchDto.setCustomer(customerBranch.getCustomerId());
        return customerBranchDto;
    }


}
