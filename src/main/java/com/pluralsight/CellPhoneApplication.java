package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CellPhone phone = new CellPhone();

        //Making prompts and use setters from Cellphone class to set data on each variable in object phone
        System.out.println("What is the serial number? ");
        int serial = Integer.parseInt(scanner.nextLine());
        phone.setSerialNumber(serial);

        System.out.println("What model is the phone? ");
        String model = scanner.nextLine();
        phone.setModel(model);

        System.out.println("Who is the carrier? ");
        String carrier = scanner.nextLine();
        phone.setCarrier(carrier);

        System.out.println("What is the phone number? ");
        String phoneNumber = scanner.nextLine();
        phone.setPhoneNumber(phoneNumber);

        System.out.println("Who is the owner of the phone? ");
        String owner = scanner.nextLine();
        phone.setOwner(owner);

        //Display output and using getters to get the data from setting for each variable in the object phone
        System.out.printf("\nPhone Number: %s\nSerial Number: %s\nCarrier: %s\nModel: %s\nOwner: %s\n",
                phone.getPhoneNumber(),
                phone.getSerialNumber(),
                phone.getCarrier(),
                phone.getModel(),
                phone.getOwner());
    }

}
