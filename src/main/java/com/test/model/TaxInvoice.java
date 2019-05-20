package com.test.model;

import java.util.Date;

public class TaxInvoice {

    private int invoice;

    private Date invoiceDate;

    private char reverseCharge;

    private String state;

    private int code;

    private String transportMode;

    private String vehicleNumber;

    private Date dateOfSupply;

    private String vendorCode;


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getInvoice() {
        return invoice;
    }

    public void setInvoice(int invoice) {
        this.invoice = invoice;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public char getReverseCharge() {
        return reverseCharge;
    }

    public void setReverseCharge(char reverseCharge) {
        reverseCharge = reverseCharge;
    }

    public String getState() {
        return state;
    }


    public String getTransportMode() {
        return transportMode;
    }

    public void setTransportMode(String transportMode) {
        this.transportMode = transportMode;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public Date getDateOfSupply() {
        return dateOfSupply;
    }

    public void setDateOfSupply(Date dateOfSupply) {
        this.dateOfSupply = dateOfSupply;
    }

    public String getVendorCode() {
        return vendorCode;
    }

    public void setVendorCode(String vendorCode) {
        this.vendorCode = vendorCode;
    }

    public void setState(String state) {
        state = state;
    }


    public String getInvoiceDataColumnnOne() {
        return
                "Invoice=" + invoice +
                        "\n InvoiceDate=" + invoiceDate +
                        "\n Reverse Charge=" + reverseCharge +
                        "\n State='" + state +" , Code :  "+code;
    }
    public String getInvoiceDataColumnnTwo() {
        return "TaxInvoice{" +
                "\n TransportMode='" + transportMode  +
                "\n VehicleNumber='" + vehicleNumber  +
                "\n DateOfSupply=" + dateOfSupply +
                "\n VendorCode='" + vendorCode ;
    }

}
