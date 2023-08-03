package com.bridgelabz.addressbook292;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome To Address Book System Program.");
        AddressBookSystem addressBookSystem = new AddressBookSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter 0 to Exit.");
            System.out.println("Enter 1 to Add Contacts Details");
            System.out.println("Enter 2 to Display All Contacts Details");
            System.out.println("Enter 3 to Edit existing Contacts");
            int select = scanner.nextInt();
            scanner.nextLine();

            switch (select) {
                case 0:
                    System.out.println("Exiting Address Book");
                    System.exit(0);
                case 1:
                    addressBookSystem.addContacts();
                    break;
                case 2:
                    addressBookSystem.displayContacts();
                    break;
                case 3:
                    System.out.println("Enter the first name of the contact to edit:");
                    String firstName = scanner.nextLine();
                    System.out.println("Enter last name ");
                    String lastName = scanner.nextLine();
                    addressBookSystem.editContacts(firstName, lastName);
                    break;
                default:
                    System.out.println(" Contact details not found. ");
            }
        }
    }
}
