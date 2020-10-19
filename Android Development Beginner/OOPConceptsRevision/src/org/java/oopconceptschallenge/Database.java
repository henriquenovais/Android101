package org.java.oopconceptschallenge;

import java.util.ArrayList;

public class Database {

    public static class ContactList {

        private static ArrayList<Contact> contacts = new ArrayList<>();

        public static void addContact(Contact contact) {
            ContactList.add(contact);
        }

        public static void displayContactList() {

            String firstName;
            String lastName;

        }
    }

    public static class Contact {

        private String firstName;
        private String lastName;
        private int phoneNumber;

        public Contact(String firstName, String lastName, int phoneNumber) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.phoneNumber = phoneNumber;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public int getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(int phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public void printContact() {
            System.out.println("First name: " + this.firstName);
            System.out.println("Last name: " + this.lastName);
            System.out.println("Phone number: " + this.phoneNumber);

        }
    }


}
