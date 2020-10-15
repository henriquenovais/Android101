package org.maincode;

public class syntaxtesting {
    public static void main(String[] args) {
        String a = new String("This is a string.");
        String b = new String("This is a string.");
        if (a.equals(b)) {
            System.out.println("Result is TRUE when we use a.equals(b) !");
        } else {
            System.out.println("Result should not be FALSE when we use a.equals(b) !");
        }

        if (a == b) {
            System.out.println("Result will not be TRUE, memory location is different.");
        } else {
            System.out.println("Result will be FALSE when we use a == b, these are variables with different memory location.");
        }
    }
}
