package com.test.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="customerName" , nullable = false)
    private String customerName;

    @Column(name="customerGSTIN" , nullable = false)
    private String customerGSTIN;

    @Column(name="deletionStatus")
    private boolean deletionFlag =false;

    @OneToMany(mappedBy = "customerProduct")
    private Set<Product> product;

    @OneToMany(mappedBy = "customerForBranch")
    private Set<CustomerBranch> customerBranch;


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

    public Set<CustomerBranch> getCustomerBranch() {
        return customerBranch;
    }

    public void setCustomerBranch(Set<CustomerBranch> customerBranch) {
        this.customerBranch = customerBranch;
    }

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

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }


}
