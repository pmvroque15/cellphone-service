package com.pluralsight;

public class CellPhone {
    String serialNumber = "0";
    String model = "";
    String phoneNumber = "";
    String owner = "";
    static void main(String[] args) {
    }

    public String getSerialNumber() {
        return serialNumber;
    }
    void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return model;
    }
    void setModel(String model) {
        this.model = model;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOwner() {
        return serialNumber;
    }

    void setOwner(String owner) {
        this.owner = owner;
    }
}

