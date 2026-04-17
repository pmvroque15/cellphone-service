package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CellPhone phone1 = new CellPhone();
        CellPhone phone2 = new CellPhone("123-345-5678","Pat");

        //Making prompts and use setters from Cellphone class to set data on each variable in object phone
        System.out.println("What is the serial number? ");
        int serial = Integer.parseInt(scanner.nextLine());
        phone1.setSerialNumber(serial);

        System.out.println("What model is the phone? ");
        String model = scanner.nextLine();
        phone1.setModel(model);

        System.out.println("Who is the carrier? ");
        String carrier = scanner.nextLine();
        phone1.setCarrier(carrier);

        System.out.println("What is the phone number? ");
        String phoneNumber = scanner.nextLine();
        phone1.setPhoneNumber(phoneNumber);

        System.out.println("Who is the owner of the phone? ");
        String owner = scanner.nextLine();
        phone1.setOwner(owner);

        //Display output and using getters to get the data from setting for each variable in the object phone
//        System.out.printf("\nPhone Number: %s\nSerial Number: %s\nCarrier: %s\nModel: %s\nOwner: %s\n",
//                phone1.getPhoneNumber(),
//                phone1.getSerialNumber(),
//                phone1.getCarrier(),
//                phone1.getModel(),
//                phone1.getOwner());

        display(phone1);
        display(phone2);
        phone1.dial(phone2.getPhoneNumber());
        phone2.dial(phone1.getPhoneNumber());
    }

    static void display(CellPhone phone) {
        phone.getPhoneNumber();
        phone.getOwner();
    }
}
