package com.bridgelabz.addressbook292;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookSystem extends Contacts {

    Contacts contacts = new Contacts();
    Scanner scanner = new Scanner(System.in);
    List<Contacts> Contactslist = new ArrayList<>();

    public void addContacts() {
        boolean addingContacts = true;
        //scanner.nextLine();
        while (addingContacts) {

            Contacts contacts = new Contacts();
            System.out.println("Enter First Name : ");
            String firstName = scanner.nextLine();
            contacts.setFirstName(firstName);

            System.out.println("Enter Last Name : ");
            String lastName = scanner.nextLine();
            contacts.setLastName(lastName);

            System.out.println("Enter Address : ");
            String address = scanner.nextLine();
            contacts.setAddress(address);

            System.out.println("Enter City : ");
            String city = scanner.nextLine();
            contacts.setCity(city);

            System.out.println("Enter State : ");
            String state = scanner.nextLine();
            contacts.setState(state);

            System.out.println("Enter Email : ");
            String email = scanner.nextLine();
            contacts.setEmail(email);

            System.out.println("Enter ZIP : ");
            int zip = scanner.nextInt();
            scanner.nextLine();
            contacts.setZip(zip);

            System.out.println("Enter Phone Number : ");
            long phoneNumber = scanner.nextLong();
            scanner.nextLine();
            contacts.setPhoneNumber(phoneNumber);

            Contactslist.add(contacts);
            System.out.println("Person Information has been created successfully");

            System.out.println("Do you want to add another person? (Y/N)");
            String select = scanner.nextLine();
            if (select.equalsIgnoreCase("N")) {
                addingContacts = false;
            }
        }
    }

        public void displayContacts () {
            if (Contactslist.isEmpty()) {
                System.out.println("AddressBook is empty.");
            }
            System.out.println("Displaying Contacts of Address Book");
            for (Contacts contacts : Contactslist)
            {
                System.out.println(contacts.getFirstName());
                System.out.println(contacts.getLastName());
                System.out.println(contacts.getAddress());
                System.out.println(contacts.getCity());
                System.out.println(contacts.getState());
                System.out.println(contacts.getEmail());
                System.out.println(contacts.getZip());
                System.out.println(contacts.getPhoneNumber());
            }

        }


    public void editContacts(String firstName, String lastname) {
        for (Contacts contacts : Contactslist) {
            if (contacts.getFirstName().equals(firstName) || contacts.getLastName().equals(lastname)) {
                System.out.println("Enter new First Name:");
                String firstNameString = scanner.nextLine();
                contacts.setFirstName(firstName);

                System.out.println("Enter new Last Name:");
                String lastNameString = scanner.nextLine();
                contacts.setLastName(lastname);

                System.out.println("Enter new Address:");
                String address = scanner.nextLine();
                contacts.setAddress(address);

                System.out.println("Enter new City:");
                String city = scanner.nextLine();
                contacts.setCity(city);

                System.out.println("Enter new State:");
                String state = scanner.nextLine();
                contacts.setState(state);

                System.out.println("Enter new Email:");
                String email = scanner.nextLine();
                contacts.setEmail(email);

                System.out.println("Enter new ZIP:");
                int zip = scanner.nextInt();
                contacts.setZip(zip);

                System.out.println("Enter new Phone Number:");
                long phoneNumber = scanner.nextLong();
                contacts.setPhoneNumber(phoneNumber);

                System.out.println("Contact updated successfully");

            }
        }
        System.out.println("Contact not found");
    }
    public void deleteContact(String firstName, String lastName) {
        Contacts contactToRemove = null;
        for (Contacts contacts : Contactslist) {
            if (contacts.getFirstName().equals(firstName) && contacts.getLastName().equals(lastName)) {
                contactToRemove = contacts;

            }
        }

        if (contactToRemove != null) {
            Contactslist.remove(contactToRemove);
            System.out.println("Contact deleted successfully.");
        } else {
            System.out.println("Contact not found.");
        }
    }
}




