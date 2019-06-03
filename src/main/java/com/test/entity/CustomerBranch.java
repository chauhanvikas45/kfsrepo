package com.test.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="customerBranch")
public class CustomerBranch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="customerAddress" , nullable = false)
    private String customerAddress;
    @Column(name="customerEmail" , nullable = false)
    private String customerEmail;
    @Column(name="customerPhone" , nullable = false)
    private String customerPhone;
    @Column(name="customerState" , nullable = false)
    private int customerState;
    @Column(name="customerCode" , nullable = false)
    private String customerCode;
    @Column(name="branchName" , nullable = false)
    private String branchName;
    /*@Column(name="customer" , nullable = false)
    private Customer customer;*/



    @OneToMany(mappedBy = "customerBranch")
    private Set<Product> product;

    @ManyToOne
    @JoinColumn(name = "customerForBranch")
    private Customer customerForBranch;


    @Column(name="deletionStatus")
    private boolean deletionFlag =false;

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
        return customerForBranch;
    }

    public void setCustomer(Customer customer) {
        this.customerForBranch = customer;
    }



}
