package com.test.dto;

import com.test.entity.Customer;
import com.test.entity.Product;

import java.time.LocalDate;
import java.util.Date;

public class InvoiceDto {
    private Integer id;
    private String invoiceNumber;
    private String totalAmount;
    private Customer customer;
    private  Product product;
    private String totalTax;
    private String amountWithoutTax;
    private LocalDate currentDate;

    public LocalDate getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(LocalDate currentDate) {
        this.currentDate = currentDate;
    }

    public String getAmountWithoutTax() {
        return amountWithoutTax;
    }

    public void setAmountWithoutTax(String amountWithoutTax) {
        this.amountWithoutTax = amountWithoutTax;
    }

    public String getTotalTax() {
        return totalTax;
    }

    public void setTotalTax(String totalTax) {
        this.totalTax = totalTax;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
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
