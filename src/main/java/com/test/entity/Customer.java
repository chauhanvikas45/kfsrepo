package com.test.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="customer")
public class Customer {
    @Id
    @GeneratedValue
    private int id;
    @Column(name="customerName" , nullable = false)
    private String customerName;
    @Column(name="customerAddress" , nullable = false)
    private String customerAddress;
    @Column(name="customerEmail" , nullable = false)
    private String customerEmail;
    @Column(name="customerGSTIN" , nullable = false)
    private String customerGSTIN;
    @Column(name="customerState" , nullable = false)
    private String customerState;
    @Column(name="customerCode" , nullable = false)
    private String customerCode;
    @Column(name="customerPhone" , nullable = false)
    private String customerPhone;

//    @OneToMany
//    @JoinColumn(name = "productId")

/*    @OneToMany(mappedBy="invoice")
    private Set<Invoice> invoices;*/

    @JsonIgnore
    @OneToMany(mappedBy = "customer")
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

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
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

    public String getCustomerGSTIN() {
        return customerGSTIN;
    }

    public void setCustomerGSTIN(String customerGSTIN) {
        this.customerGSTIN = customerGSTIN;
    }

    public String getCustomerState() {
        return customerState;
    }

    public void setCustomerState(String customerState) {
        this.customerState = customerState;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }
}
