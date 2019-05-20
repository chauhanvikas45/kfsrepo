package com.test.dto;

public class CustomerDto {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;
    private String customerName;
    private String customerAddress;
    private String customerEmail;
    private String customerGSTIN;
    private String customerState;
    private String customerCode;
    private String customerPhone;


    public CustomerDto(){

    }


    @Override
    public String toString() {
        return "CustomerDto{" +
                "customerName='" + customerName + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                ", customerGSTIN='" + customerGSTIN + '\'' +
                ", customerState='" + customerState + '\'' +
                ", customerCode=" + customerCode +
                ", customerPhone=" + customerPhone +
                '}';
    }
    public CustomerDto(Builder builder){
        this.customerCode = builder.customerCode;
        this.customerAddress = builder.customerAddress;
        this.customerEmail = builder.customerEmail;
        this.customerGSTIN = builder.customerGSTIN;
        this.customerName = builder.customerName;
        this.customerPhone = builder.customerPhone;
        this.customerState = builder.customerState;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
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

    public static class Builder{

         String customerName;
         String customerAddress;
         String customerPhone;
        String customerEmail;
        String customerGSTIN;
        String customerState;
        String customerCode;

        public Builder setCustomerName(String customerName) {
            this.customerName = customerName;
            return this;
        }

        public Builder setCustomerAddress(String customerAddress) {
            this.customerAddress = customerAddress;
            return this;
        }


        public Builder setCustomerEmail(String customerEmail) {
            this.customerEmail = customerEmail;
            return this;
        }

        public Builder setCustomerGSTIN(String customerGSTIN) {
            this.customerGSTIN = customerGSTIN;
            return this;
        }

        public Builder setCustomerState(String customerState) {
            this.customerState = customerState;
            return this;
        }

        public Builder setCustomerCode(String customerCode) {
            this.customerCode = customerCode;
            return this;
        }

        public Builder setCustomerPhone(String customerPhone) {
            this.customerPhone = customerPhone;
            return this;
        }


         public CustomerDto build(){
             CustomerDto customer = new CustomerDto(this);
             return customer;
         }


    }
}
