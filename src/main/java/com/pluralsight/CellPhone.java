package com.pluralsight;

public class CellPhone{
     int serialNumber;
     String model;
     String phoneNumber;
     String owner;

    public Cellphone() {
        serialNumber = 0;
        model = "";
        phoneNumber = "";
        owner = "";
    }
    static void main(String[] args) {
    }

    public int getSerialNumber() {
        return serialNumber;
    }
    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}

