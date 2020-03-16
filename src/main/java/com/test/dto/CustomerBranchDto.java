package com.test.dto;

import com.test.entity.Customer;
import com.test.entity.Product;

import java.util.Set;

public class CustomerBranchDto {

    public CustomerBranchDto() {
    }

    private int id;
    private String customerAddress;
    private String customerEmail;
    private String customerPhone;
    private String customerState;
    private int customerCode = 0;
    private String branchName;
    private Customer customerId;
    private boolean deletionFlag;
    private Set<Product> product;

    public Set<Product> getProduct() {
        return product;
    }

    public void setProduct(Set<Product> product) {
        this.product = product;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerState() {
        return customerState;
    }

    public void setCustomerState(String customerState) {
        this.customerState = customerState;
    }

    public int getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(int customerCode) {
        this.customerCode = customerCode;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public Customer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Customer customer) {
        this.customerId = customer;
    }

    public boolean isDeletionFlag() {
        return deletionFlag;
    }

    public void setDeletionFlag(boolean deletionFlag) {
        this.deletionFlag = deletionFlag;
    }

    @Override
    public String toString() {
        return "CustomerBranchDto{" +
                "id=" + id +
                ", customerAddress='" + customerAddress + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                ", customerPhone='" + customerPhone + '\'' +
                ", customerState=" + customerState +
                ", customerCode='" + customerCode + '\'' +
                ", branchName='" + branchName + '\'' +
                ", customer=" + customerId +
                ", deletionFlag=" + deletionFlag +
                '}';
    }
}
