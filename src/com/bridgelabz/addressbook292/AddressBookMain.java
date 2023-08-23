package com.bridgelabz.addressbook292;

import java.util.List;
import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome To Address Book System Program.");
        AddressBookSystem addressBookSystem = new AddressBookSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter 0 to Exit.");
            System.out.println("Enter 1 to Add Address Book");
            System.out.println("Enter 2 to Display Address Book");
            System.out.println("Enter 3 to Open Address Book");
            System.out.println("Enter 4 to Add Contacts Details");
            System.out.println("Enter 5 to Display All Contacts Details");
            System.out.println("Enter 6 to Edit existing Contacts");
            System.out.println("Enter 7 to Delete. ");
            System.out.println("Enter 8 to Quit: ");
            System.out.println("Enter 9 to Search contact by City: ");

            int select = scanner.nextInt();
            scanner.nextLine();

            switch (select) {
                case 0:
                    System.out.println("Exiting Address Book");
                    System.exit(0);
                case 1:
                    addressBookSystem.addAddressBook();
                    break;
                case 2:
                    addressBookSystem.displayAddressBooks();
                    break;
                case 3:
                    addressBookSystem.openAddressBook();
                    break;
                case 4:
                    addressBookSystem.addContacts();
                    break;
                case 5:
                    addressBookSystem.displayContacts();
                    break;
                case 6:
                    System.out.println("Enter first name of the contact to edit:");
                    String firstName = scanner.nextLine();
                    System.out.println("Enter last name of the contact to edit: ");
                    String lastName = scanner.nextLine();
                    addressBookSystem.editContacts(firstName, lastName);
                    break;
                case 7:
                    System.out.println("Enter first name to delete:");
                    String first_Name = scanner.nextLine();
                    System.out.println("Enter last name to delete");
                    String last_Name = scanner.nextLine();
                    addressBookSystem.deleteContact(first_Name,last_Name);
                    break;
                case 8:
                    System.exit(0);
                case 9:
                    System.out.println("Enter city name to search:");
                    String cityToSearch = scanner.nextLine();

                    List<Contacts> contactsInCity = addressBookSystem.searchByCity(cityToSearch);

                    if (contactsInCity.isEmpty()) {
                        System.out.println("No contacts found in the given city.");
                    } else {
                        System.out.println("Contacts in " + cityToSearch + ":");
                        for (Contacts contact : contactsInCity) {
                            System.out.println("Name: " + contact.getFirstName() + " " + contact.getLastName());
                            // Print other contact details as needed
                        }
                    }
                    break;

                default:
                    System.out.println(" Contact details not found. ");
            }
        }
    }
}
