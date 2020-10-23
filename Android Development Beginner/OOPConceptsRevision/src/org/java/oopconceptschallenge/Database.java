package org.java.oopconceptschallenge;

import java.util.ArrayList;

public class Database {

    public class Contact {

        private String firstName;
        private String lastName;
        private long phoneNumber;

        public Contact(String firstName, String lastName, long phoneNumber) {
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

        public long getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(long phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public void printContact() {
            System.out.println("First name: " + this.firstName);
            System.out.println("Last name: " + this.lastName);
            System.out.println("Phone number: " + this.phoneNumber);

        }
    }

    public class ContactList extends ArrayList<Contact>{

        Contact Juninho = new Contact("Junior", "Silveira", 95123654L);
        Contact Julinha = new Contact("Julia", "Santa", 95148554L);
        Contact Pedro = new Contact("Pedro", "Costa", 12345678L);
        Contact Silvia = new Contact("Silvia", "Santana", 62587463L);

        //Contacts being added in order to properly test the ContactList
        public ContactList() {
            ContactList.super.add(Juninho);
            ContactList.super.add(Julinha);
            ContactList.super.add(Pedro);
            ContactList.super.add(Silvia);
        }

        public void printContacts() {

            Contact Cont;

            for (int i = 0; i < ContactList.super.size() ; i++) {
                Cont = ContactList.super.get(i);
                Cont.printContact();
            }
        }

    }

    public static ArrayList<Message> messageList = new ArrayList<>();

    public static class Message {

        private String text;
        private long senderPhoneNumber;
        private boolean received;

        public Message(String text, long senderPhoneNumber, boolean received) {
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

        public long getSenderPhoneNumber() {
            return senderPhoneNumber;
        }

        public void setSenderPhoneNumber(long senderPhoneNumber) {
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
