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
    @Column(name = "productName", nullable = false)
    private String productName;
    @Column(name = "productDescription", nullable = false)
    private String productDescription;
    @Column(name = "productHSNCode", nullable = false)
    private int productHSNCode = 0;
    @Column(name = "productUON", nullable = false)
    private String productUON;
    @Column(name = "productQuantity", nullable = false)
    private int productQuantity = 0;
    @Column(name = "productRate", nullable = false)
    private Float productRate;
    @Column(name = "productImage", nullable = true)
    private String productImage;

    @Column(name = "cgst")
    private Float cgst = new Float(0);
    @Column(name = "sgst")
    private Float sgst = new Float(0);
    @Column(name = "igst")
    private Float igst = new Float(0);

    @Column(name = "deletionFlag")
    private boolean deletionFlag = false;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customerBranchId")
    private CustomerBranch customerBranchId;


/*    @ManyToOne
    @JoinColumn(name = "customerName")
    private Customer customerProduct;*/

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

    public CustomerBranch getCustomerBranchId() {
        return customerBranchId;
    }

    public void setCustomerBranchId(CustomerBranch customerBranchId) {
        this.customerBranchId = customerBranchId;
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

    public Float getCgst() {
        return cgst;
    }

    public void setCgst(float cgst) {
        this.cgst = cgst;
    }

    public Float getSgst() {
        return sgst;
    }

    public void setSgst(float sgst) {
        this.sgst = sgst;
    }

    public Float getIgst() {
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

    public Integer getProductHSNCode() {
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

    public Integer getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public Float getProductRate() {
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
