package org.java.oopconceptschallenge;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);
        int menu = 0;
        boolean loopMenu = true;

        while(loopMenu) {

            System.out.println("Welcome to the contact list and messaging app !");
            System.out.println("1. Manage Contacts");
            System.out.println("2. Messages");
            System.out.println("3. Quit application");
            System.out.print("What is your input? ");

            menu = Sc.nextInt();

            switch (menu) {
                case 1:
                    menuManageContacts();
                    break;
                case 2:
                    menuMessages();
                    break;
                case 3:
                    System.out.println("Exiting application");
                    loopMenu = false;
                    break;
                default:
                    System.out.println("Invalid input. Please choose a valid number.");
                    break;
            }
        }
    }

    public static void menuManageContacts() {

        Scanner Sc = new Scanner(System.in);
        int menu = 0;
        boolean loopMenu = true;
        while(loopMenu){

        System.out.println("Welcome to the contact list and messaging app !");
        System.out.println("1. Show all contacts");
        System.out.println("2. Add a new contact");
        System.out.println("3. Search for a contact");
        System.out.println("4. Delete a contact");
        System.out.println("5. Go back to the previous menu");
        System.out.print("What is your input? ");
        menu = Sc.nextInt();

        switch (menu) {
            case 1:
                showAllContacts();
                break;
            case 2:
                menuAddContact();
                break;
            case 3:
                menuSearchForContact();
                break;
            case 4:
                menuDeleteContact();
                break;
            case 5:
                System.out.println("Returning to previous menu");
                loopMenu = false;
                break;
            default:
                System.out.println("Invalid input. Please choose a valid number.");
                break;
            }
        }
    }

    public static void menuMessages() {

        Scanner Sc = new Scanner(System.in);
        int menu = 0;
        boolean loopMenu = true;

        while(loopMenu){

            System.out.println("Welcome to the contact list and messaging app !");
            System.out.println("1. Show all messages");
            System.out.println("2. Send a new message");
            System.out.println("3. Go back to the previous menu");
            System.out.print("What is your input? ");
            menu = Sc.nextInt();

            switch (menu) {
                case 1:
                    showAllMessages();
                    break;
                case 2:
                    sendMessage();
                    break;
                case 3:
                    System.out.println("Returning to previous menu");
                    loopMenu = false;
                    break;
                default:
                    System.out.println("Invalid input. Please choose a valid number.");
                    break;
            }
        }
    }

    public static void showAllContacts() {
    }

    public static void menuAddContact() {
    }

    public static void menuSearchForContact() {
    }

    public static void menuDeleteContact() {
    }

    public static void showAllMessages() {
    }

    public static void sendMessage() {
    }

}
