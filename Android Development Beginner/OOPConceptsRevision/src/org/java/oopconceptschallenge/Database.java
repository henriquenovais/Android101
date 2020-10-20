package org.java.oopconceptschallenge;

import java.util.ArrayList;

public class Database {

    public static ArrayList<Contact> ContactList = new ArrayList<>();

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

    public static ArrayList<Message> messageList = new ArrayList<>();

    public static class Message {

        private String text;
        private int senderPhoneNumber;
        private boolean received;

        public Message(String text, int senderPhoneNumber, boolean received) {
            this.text = text;
            this.senderPhoneNumber = senderPhoneNumber;
            this.received = received;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public int getSenderPhoneNumber() {
            return senderPhoneNumber;
        }

        public void setSenderPhoneNumber(int senderPhoneNumber) {
            this.senderPhoneNumber = senderPhoneNumber;
        }

        public boolean isReceived() {
            return received;
        }

        public void setReceived(boolean received) {
            this.received = received;
        }

    }


}
