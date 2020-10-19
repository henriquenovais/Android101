package org.java.oopconceptschallenge;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Database.Contact Henrique = new Database.Contact("Henrique", "Oliveira", 99999999);
        Database.ContactList.addContact(Henrique);

    }
}
