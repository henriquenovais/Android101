package org.java.oopconceptschallenge;

import java.util.ArrayList;
import java.util.Scanner;

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
            System.out.println("");
        }
    }

    public class ContactList extends ArrayList<Contact>{

        private Contact Juninho = new Contact("Junior", "Silveira", 95123654L);
        private Contact Julinha = new Contact("Julia", "Santa", 95148554L);
        private Contact Pedro = new Contact("Pedro", "Costa", 12345678L);
        private Contact Silvia = new Contact("Silvia", "Santana", 62587463L);

        private Scanner Sc = new Scanner(System.in);

        //Contacts being added in order to properly test the ContactList
        public ContactList() {
            ContactList.super.add(Juninho);
            ContactList.super.add(Julinha);
            ContactList.super.add(Pedro);
            ContactList.super.add(Silvia);
        }

        public void printContacts() {
            int x;
            Contact Cont;

            for (int i = 0; i < ContactList.super.size() ; i++) {
                Cont = ContactList.super.get(i);
                x = i + 1;
                System.out.println("Contact " + x);
                Cont.printContact();
            }
        }

        public void addContact() {
            String firstName;
            String lastName;
            long phoneNumber;

            System.out.println("Enter the new contact first name: ");
            firstName = Sc.nextLine();
            System.out.println("Enter the last name of the contact: ");
            lastName = Sc.nextLine();
            System.out.println("Enter the new contact's phone: ");
            phoneNumber = Sc.nextLong();

            Contact New = new Contact(firstName, lastName, phoneNumber);

            this.add(New);

            System.out.println("Contact added.");
            New.printContact();
        }

        public int searchByFirstName(String firstName) {
            int sz;
            Contact Res;
            sz = this.size();
            boolean flag = false;
            int index = -1;

            for (int i = 0; i < sz; i++) {
                if (firstName.equals(this.get(i).firstName)) {
                        flag = true;
                        index = i;
                        break;
                    }
            }

            if (flag == true) {
                return index;
            } else {
                return -1;
            }
        }

        public void deleteContact(String firstName) {
            int index = searchByFirstName(firstName);
            if (index == -1) {
                System.out.println("Contact not found.");
            } else {
                ContactList.super.get(index).printContact();
                System.out.println("Contact named " + firstName + " was removed.");
                ContactList.super.remove(index);
            }
        }

    }

    public class Message {

        private String text;
        private long senderPhoneNumber;
        private long receiverPhoneNumber;

        public Message(String text, long senderPhoneNumber, long receiverPhoneNumber) {
            this.text = text;
            this.senderPhoneNumber = senderPhoneNumber;
            this.receiverPhoneNumber = receiverPhoneNumber;
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

        public long getReceiverPhoneNumber() {
            return receiverPhoneNumber;
        }

        public void setReceiverPhoneNumber(long receiverPhoneNumber) {
            this.receiverPhoneNumber = receiverPhoneNumber;
        }
    }

    public class MessageBox extends ArrayList<Message> {

        private long userPhoneNumber = 99999999L;
        private Scanner Sc = new Scanner(System.in);

        private Message msg1 = new Message("Hi, how are you doing?", 123486789L, userPhoneNumber);
        private Message msg2 = new Message("Hey, whats up", 7535125L, userPhoneNumber);
        private Message msg3 = new Message("Click here to get a coupon!", 123589546L, userPhoneNumber);
        private Message msg4 = new Message("Hey dude,whats up",62587463L, userPhoneNumber);
        private Message msg5 = new Message("We good man",userPhoneNumber, 62587463L);

        public MessageBox() {
            MessageBox.super.add(msg1);
            MessageBox.super.add(msg2);
            MessageBox.super.add(msg3);
            MessageBox.super.add(msg4);
            MessageBox.super.add(msg5);
        }

        public long getUserPhoneNumber() {
            return userPhoneNumber;
        }

        public void setUserPhoneNumber(long userPhoneNumber) {
            this.userPhoneNumber = userPhoneNumber;
        }

        public void showAllMessages() {
            System.out.println("Message list:");
            for (int i = 0; i < MessageBox.super.size(); i++) {
                if(MessageBox.super.get(i).senderPhoneNumber != this.userPhoneNumber){
                    System.out.println("Message from: " + MessageBox.super.get(i).senderPhoneNumber);
                    System.out.println("Message to: You");
                    System.out.println("Text: " + MessageBox.super.get(i).text);
                    System.out.println("");
                } else {
                    System.out.println("Message from: You");
                    System.out.println("Message to: " + MessageBox.super.get(i).receiverPhoneNumber);
                    System.out.println("Text: " + MessageBox.super.get(i).text);
                    System.out.println("");
                }
            }
        }

        public void sendMessage(ContactList Contacts) {
            System.out.println("Type the name of the first name of the contact you want to send a message to:");
            String contName = Sc.next();
            Sc.nextLine();
            int index = Contacts.searchByFirstName(contName);
            if (index != -1) {
                System.out.println("Type the text you want to send: ");
                String text = Sc.nextLine();
                Message msg = new Message(text, this.getUserPhoneNumber(), Contacts.get(index).phoneNumber);
                MessageBox.super.add(msg);
                System.out.println("Message sent!");
            } else {
                System.out.println("Invalid contact.");
            }
        }
    }

}
