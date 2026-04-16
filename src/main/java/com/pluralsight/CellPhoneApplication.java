package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {

    static void main() {
        Scanner scanner = new Scanner(System.in);
        CellPhone phone = new CellPhone();

        System.out.println("What is the serial number? ");
        int serial = scanner.nextInt();
        phone.setSerialNumber(serial);
        scanner.nextLine();

        System.out.println("What model is the phone? ");
        String model = scanner.nextLine();
        phone.setModel(model);

        System.out.println("Who is the carrier? ");
        String phoneCarrier = scanner.nextLine();
        phone.setCarrier(phoneCarrier);

        System.out.println("What is the phone number? ");
        String phoneNumber = scanner.nextLine();
        phone.setPhoneNumber(phoneNumber);

        System.out.println("Who is the owner of the phone? ");
        String owner = scanner.nextLine();
        phone.setOwner(owner);

        System.out.printf(phone.getPhoneNumber());
        System.out.printf(phone.getModel());
        System.out.printf(phone.getCarrier());
        System.out.printf(phone.getPhoneNumber());
        System.out.printf(phone.getOwner());

        System.out.println(phone.phoneNumber + phone.serialNumber + phone.carrier + phone.model + phone.owner);
    }
}
