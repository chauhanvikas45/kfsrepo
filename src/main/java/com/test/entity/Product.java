package com.test.entity;

import org.springframework.boot.autoconfigure.web.ResourceProperties;

import javax.persistence.*;
import java.util.Set;


@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="productName" , nullable = false)
    private String productName;
    @Column(name="productDescription" , nullable = false)
    private String productDescription;
    @Column(name="productHSNCode" , nullable = false)
    private String productHSNCode;
    @Column(name="productUON" , nullable = false)
    private String productUON;
    @Column(name="productQuantity" , nullable = false)
    private String productQuantity;
    @Column(name="productRate" , nullable = false)
    private String productRate;
    @Column(name="productImage" , nullable = true)
    private String productImage;

    private String cgst;
    private String sgst;
    private String igst;
    @ManyToOne
    @JoinColumn(name = "customer")
    private Customer customer;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

  /*  public Set<Invoice> getInvoices() {
        return invoices;
    }

    public void setInvoices(Set<Invoice> invoices) {
        this.invoices = invoices;
    }*/



/*    @OneToMany(mappedBy = "invoice")
    private Set<Invoice> invoices;*/




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public String getCgst() {
        return cgst;
    }

    public void setCgst(String cgst) {
        this.cgst = cgst;
    }

    public String getSgst() {
        return sgst;
    }

    public void setSgst(String sgst) {
        this.sgst = sgst;
    }

    public String getIgst() {
        return igst;
    }

    public void setIgst(String igst) {
        this.igst = igst;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductHSNCode() {
        return productHSNCode;
    }

    public void setProductHSNCode(String productHSNCode) {
        this.productHSNCode = productHSNCode;
    }

    public String getProductUON() {
        return productUON;
    }

    public void setProductUON(String productUON) {
        this.productUON = productUON;
    }

    public String getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(String productQuantity) {
        this.productQuantity = productQuantity;
    }

    public String getProductRate() {
        return productRate;
    }

    public void setProductRate(String productRate) {
        this.productRate = productRate;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }
}
