package com.test.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @Column(name = "customerName", nullable = false)
    private String customerName;

    @Column(name = "customerGSTIN", nullable = false)
    private String customerGSTIN;


    @Column(name = "deletionStatus")
    private boolean deletionFlag = false;

    @OneToMany( mappedBy = "customerId",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JsonIgnore
    private List<CustomerBranch> customerBranches = new ArrayList();

    public boolean isDeletionFlag() {
        return deletionFlag;
    }

    public void setDeletionFlag(boolean deletionFlag) {
        this.deletionFlag = deletionFlag;
    }

    public String getCustomerGSTIN() {
        return customerGSTIN;
    }

    public void setCustomerGSTIN(String customerGSTIN) {
        this.customerGSTIN = customerGSTIN;
    }

    public List<CustomerBranch> getCustomerBranches() {
        return customerBranches;
    }

//    public void setCustomerBranches(List<CustomerBranch> customerBranch) {
//        this.customerBranches = customerBranch;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void addCustomerBranches(CustomerBranch customerBranch) {
        customerBranches.add(customerBranch);
        customerBranch.setCustomerId(this);
    }

    public void removeCustomerBranches(CustomerBranch customerBranch) {
        customerBranches.remove(customerBranch);
        customerBranch.setCustomerId(this);
    }
}
