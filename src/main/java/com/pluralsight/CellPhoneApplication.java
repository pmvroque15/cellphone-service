package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CellPhone phone1 = new CellPhone();
        CellPhone phone2 = new CellPhone("123-345-5678","Pat");
        }

    public static void fillPhone(CellPhone phone, Scanner scanner) {
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
    }
        display(phone1);
        display(phone2);
        phone1.dial(phone2.getPhoneNumber());
        phone2.dial(phone1.getPhoneNumber());

}

    static void display(CellPhone phone) {

        System.out.printf("\nPhone Number: %s\nSerial Number: %s\nCarrier: %s\nModel: %s\nOwner: %s\n",phone.getPhoneNumber(), phone.getSerialNumber(),   phone.getCarrier(), phone.getModel(),phone.getOwner());

    }
}
