package com.test.dto;

import com.test.entity.Customer;
import com.test.entity.Product;

public class InvoiceDto {
    private Integer id;
    private String invoiceNumber;
    private String totolAmount;
    private Customer customer;
    private  Product product;

    public String getTotolAmount() {
        return totolAmount;
    }

    public void setTotolAmount(String totolAmount) {
        this.totolAmount = totolAmount;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }


}
