package com.test.dto;

import com.test.entity.Customer;

import javax.persistence.Column;

public class CustomerBranchDto {

    public CustomerBranchDto() {
    }

    private int id;
    private String customerAddress;
    private String customerEmail;
    private String customerPhone;
    private int customerState;
    private String customerCode;
    private String branchName;
    private Customer customer;
    private boolean deletionFlag;

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

    public int getCustomerState() {
        return customerState;
    }

    public void setCustomerState(int customerState) {
        this.customerState = customerState;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
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
                ", customer=" + customer +
                ", deletionFlag=" + deletionFlag +
                '}';
    }
}
