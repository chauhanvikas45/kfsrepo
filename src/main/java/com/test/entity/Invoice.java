package com.test.entity;

import com.test.utils.StringPrefixedSequenceIdGenerator;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "invoice")
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

   // @CreationTimestamp

    /*@GenericGenerator(
            name = "inovices",
            strategy = "com.test.utils.StringPrefixedSequenceIdGenerator",
            parameters = {
                    @Parameter(name = StringPrefixedSequenceIdGenerator.INCREMENT_PARAM, value = "50"),
                    @Parameter(name = StringPrefixedSequenceIdGenerator.VALUE_PREFIX_PARAMETER, value = "B_"),
                    @Parameter(name = StringPrefixedSequenceIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%05d") })*/
    @GeneratedValue(strategy = GenerationType.IDENTITY/*, generator = "inovices"*/)
    private String inovices;
    private String totalAmount;

    @CreationTimestamp
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
