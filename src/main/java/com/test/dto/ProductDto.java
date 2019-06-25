package com.test.dto;

import com.test.entity.Customer;
import com.test.entity.CustomerBranch;

import java.util.Set;

public class ProductDto {
    private String productName;
    private String productDescription;
    private int productHSNCode =0;
    private String productUON;
    private Integer productQuantity = 0;
    private Float productRate= new Float(0);
    //private String productGST;
    private String productImage;
    private Float cgst= new Float(0);
    private Float sgst= new Float(0);
    private Float igst= new Float(0);
    private CustomerBranch customerBranch;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CustomerBranch getCustomerBranch() {
        return customerBranch;
    }

    public void setCustomerBranch(CustomerBranch customerBranch) {
        this.customerBranch = customerBranch;
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

    public ProductDto(){

    }






    @Override
    public String toString() {
        return "ProductDto{" +
                "productName='" + productName + '\'' +
                ", productDescription='" + productDescription + '\'' +
                ", productHSNCode=" + productHSNCode +
                ", productUON='" + productUON + '\'' +
                ", productQuantity=" + productQuantity +
                ", productRate='" + productRate + '\'' +
   //             ", productGST='" + productGST + '\'' +
                ", productImage=" + productImage +
                '}';
    }

    public String getProductName() {
        return productName;
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

    /*public String getProductGST() {
        return productGST;
    }

    public void setProductGST(String productGST) {
        this.productGST = productGST;
    }*/

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }





}
