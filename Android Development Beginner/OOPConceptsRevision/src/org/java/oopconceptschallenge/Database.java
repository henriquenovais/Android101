package org.java.oopconceptschallenge;

import java.util.ArrayList;

public class Database {

    public static class Contact {

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

    public static class ContactList extends ArrayList<Contact>{

        Contact Juninho = new Contact("Junior", "Silveira", 02589510L);
        Contact Julinha = new Contact("Julia", "Santa", 03697415L);
        Contact Pedro = new Contact("Pedro", "Costa", 78942356L);
        Contact Silvia = new Contact("Silvia", "Santana", 15874203L);

        //Contacts being added in order to properly test the ContactList
        public ContactList() {
            ContactList.add(Juninho);
            ContactList.add(Julinha);
            ContactList.add(Pedro);
            ContactList.add(Silvia);
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
