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
    private int productHSNCode;
    @Column(name="productUON" , nullable = false)
    private String productUON;
    @Column(name="productQuantity" , nullable = false)
    private int productQuantity;
    @Column(name="productRate" , nullable = false)
    private Float productRate;
    @Column(name="productImage" , nullable = true)
    private String productImage;

    @Column(name = "cgst")
    private Float cgst;
    @Column(name = "sgst")
    private Float sgst;
    @Column(name = "igst")
    private Float igst;

    @Column(name = "deletionFlag")
    private boolean deletionFlag=false;


    @ManyToOne
    @JoinColumn(name = "customerBranch")
    private CustomerBranch customerBranch;

    public Customer getCustomerProduct() {
        return customerProduct;
    }

    public void setCustomerProduct(Customer customerProduct) {
        this.customerProduct = customerProduct;
    }

    @ManyToOne
    @JoinColumn(name = "customerProduct")
    private Customer customerProduct;

    public void setProductRate(Float productRate) {
        this.productRate = productRate;
    }

    public void setCgst(Float cgst) {
        this.cgst = cgst;
    }

    public void setSgst(Float sgst) {
        this.sgst = sgst;
    }

    public void setIgst(Float igst) {
        this.igst = igst;
    }

    public CustomerBranch getCustomerBranch() {
        return customerBranch;
    }

    public void setCustomerBranch(CustomerBranch customerBranch) {
        this.customerBranch = customerBranch;
    }

    public boolean isDeletionFlag() {
        return deletionFlag;
    }

    public void setDeletionFlag(boolean deletionFlag) {
        this.deletionFlag = deletionFlag;
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

    public float getCgst() {
        return cgst;
    }

    public void setCgst(float cgst) {
        this.cgst = cgst;
    }

    public float getSgst() {
        return sgst;
    }

    public void setSgst(float sgst) {
        this.sgst = sgst;
    }

    public float getIgst() {
        return igst;
    }

    public void setIgst(float igst) {
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

    public int getProductHSNCode() {
        return productHSNCode;
    }

    public void setProductHSNCode(int productHSNCode) {
        this.productHSNCode = productHSNCode;
    }

    public String getProductUON() {
        return productUON;
    }

    public void setProductUON(String productUON) {
        this.productUON = productUON;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public float getProductRate() {
        return productRate;
    }

    public void setProductRate(float productRate) {
        this.productRate = productRate;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }
}
