package com.test.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "customerBranch")
public class CustomerBranch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "customerAddress", nullable = false)
    private String customerAddress;
    @Column(name = "customerEmail", nullable = false)
    private String customerEmail;
    @Column(name = "customerPhone", nullable = false)
    private String customerPhone;
    @Column(name = "customerState", nullable = false)
    private String customerState;
    @Column(name = "customerCode", nullable = false)
    private Integer customerCode = 0;
    @Column(name = "branchName", nullable = false)
    private String branchName;


    //@OneToMany(mappedBy = "customerBranch")
    @OneToMany(mappedBy = "customerBranchId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Product> product;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customerId")
    private Customer customerId;

    public Customer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Customer customer) {
        this.customerId = customer;
    }

    @Column(name = "deletionStatus")
    private boolean deletionFlag = false;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Set<Product> getProduct() {
        return product;
    }

    public void setProduct(Set<Product> product) {
        this.product = product;
    }

    public boolean isDeletionFlag() {
        return deletionFlag;
    }

    public void setDeletionFlag(boolean deletionFlag) {
        this.deletionFlag = deletionFlag;
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


    @Override
    public String toString() {
        return "CustomerBranch{" +
                "id=" + id +
                ", customerAddress='" + customerAddress + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                ", customerPhone='" + customerPhone + '\'' +
                ", customerState='" + customerState + '\'' +
                ", customerCode=" + customerCode +
                ", branchName='" + branchName + '\'' +
                ", product=" + product +
                ", deletionFlag=" + deletionFlag +
                '}';
    }
}
