package org.java.oopconceptschallenge;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Database.Contact Henrique = new Database.Contact("Henrique", "Oliveira", 99999999);
        Database.ContactList.add(Henrique);
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
                    manageContactsMenu();
                    break;
                case 2:
                    messagesMenu();
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

    public static void manageContactsMenu() {

        Scanner Sc = new Scanner(System.in);
        int menu = 0;
        boolean loopMenu = true;

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
                messagesMenu();
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

    public static void messagesMenu(){

    }

    public static void showAllContacts() {
    }
}
