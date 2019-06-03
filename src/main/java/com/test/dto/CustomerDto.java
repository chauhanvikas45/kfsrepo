package com.test.dto;

public class CustomerDto {



    private int id;
    private String customerName;
    private String customerGSTIN;

    public CustomerDto(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGSTIN() {
        return customerGSTIN;
    }

    public void setCustomerGSTIN(String customerGSTIN) {
        this.customerGSTIN = customerGSTIN;
    }


    @Override
    public String toString() {
        return "CustomerDto{" +
                "customerName='" + customerName + '\'' +
                ", customerGSTIN='" + customerGSTIN + '\'' +
                '}';
    }
    public CustomerDto(Builder builder){
        this.customerGSTIN = builder.customerGSTIN;
        this.customerName = builder.customerName;
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
