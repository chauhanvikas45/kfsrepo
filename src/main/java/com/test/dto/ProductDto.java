package com.test.dto;

import com.test.entity.Customer;

public class ProductDto {
    private String productName;
    private String productDescription;
    private String productHSNCode;
    private String productUON;
    private String productQuantity;
    private String productRate;
    private String productGST;
    private String productImage;
    private String cgst;
    private String sgst;
    private String igst;
    private Customer customer;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customerName) {
        this.customer = customerName;
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

    public ProductDto(){

    }

    public ProductDto(Builder builder){
        this.productDescription=builder.productDescription;
        this.productHSNCode=builder.productHSNCode;
        this.productUON=builder.productUON;
        this.productQuantity=builder.productQuantity;
        this.productName=builder.productName;
        this.productRate=builder.productRate;
        this.productGST=builder.productGST;
        this.productImage=builder.productImage;
        this.cgst=builder.cgst;
        this.sgst=builder.sgst;
        this.igst=builder.igst;


    }


    public static class Builder{
        private String productName;
        private String productDescription;
        private String productHSNCode;
        private String productUON;
        private String productQuantity;
        private String productRate;
        private String productGST;
        private String productImage;
        private String cgst;
        private String sgst;
        private String igst;
        private String customerName;



        public Builder setCustomerName(String customerName) {
            this.customerName = customerName;
            return this;
        }

        public Builder setCgst(String cgst) {
            this.cgst = cgst;
            return this;
        }



        public Builder setSgst(String sgst) {
            this.sgst = sgst;
            return this;
        }



        public Builder setIgst(String igst) {
            this.igst = igst;
            return this;
        }


        public Builder setProductName(String productName) {
            this.productName = productName;
            return this;
        }

        public Builder setProductDescription(String productDescription) {
            this.productDescription = productDescription;
            return this;
        }

        public Builder setProductHSNCode(String productHSNCode) {
            this.productHSNCode = productHSNCode;
            return this;
        }

        public Builder setProductUON(String productUON) {
            this.productUON = productUON;
            return this;
        }

        public Builder setProductQuantity(String productQuantity) {
            this.productQuantity = productQuantity;
            return this;
        }

        public Builder setProductRate(String productRate) {
            this.productRate = productRate;
            return this;
        }

        public Builder setProductGST(String productGST) {
            this.productGST = productGST;
            return this;
        }

        public Builder setProductImage(String productImage) {
            this.productImage = productImage;
            return this;
        }

        public ProductDto build(){
            ProductDto productDto = new ProductDto(this);
            return productDto;
        }



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
                ", productGST='" + productGST + '\'' +
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

    public String getProductGST() {
        return productGST;
    }

    public void setProductGST(String productGST) {
        this.productGST = productGST;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }





}
