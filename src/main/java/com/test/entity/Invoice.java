package com.test.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "invoice")
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String inovices;
    private String totalAmount;

    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdated;


    @ManyToOne
    @JoinColumn(name = "productId")
    private Product productId;


    @ManyToOne
    @JoinColumn(name = "customerId")
    private Customer customers;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProductId(Product productId) {
        this.productId = productId;
    }

    public Customer getCustomers() {
        return customers;
    }

    public void setCustomers(Customer customers) {
        this.customers = customers;
    }

    public String getInvoiceNumber() {
        return inovices;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.inovices = invoiceNumber;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }


}
