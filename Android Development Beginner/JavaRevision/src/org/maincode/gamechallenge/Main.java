package org.maincode.gamechallenge;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static String gamePlay() {
        Scanner sc2 = new Scanner(System.in);
        String result = "" +
                "";
        int playerGuess;
        int gameOver = 0;
        boolean gameplayLoop = true;
        Random rand = new Random();
        while(gameplayLoop) {
            System.out.println("Guess a number between 0 and 10: ");
            playerGuess = sc2.nextInt();
            if (playerGuess == rand.nextInt(10)) {
                System.out.println("Congratulations!! You won!!");
                gameplayLoop = false;
                result = "WIN!!! ";
            } else {
                System.out.println("Wrong guess! :/");
                gameOver++;
            }
            if (gameOver == 5) {
                System.out.println("Game over!");
                gameplayLoop = false;
                result = "LOSS :/";
            }
        }
        return result;
    }
    public static void main(String[] args) {
        /*
        GAME CHALLENGE
        Ask the user to guess a random number
        If the user fails five times in a row display a game over screen
        * */

        Scanner sc = new Scanner(System.in);

        boolean menu = true;
        String startGame;
        String result;

        while(menu){

            System.out.println("Welcome to the guessing game!");
            System.out.println("You have to guess a number between 1 and 10.");
            System.out.println("You have five tries until game over! Use your chances wisely!");
            System.out.println("Do you want to start guessing? [YES/NO]");

            startGame = sc.nextLine();
            startGame = startGame.toUpperCase();
            switch (startGame){
                case "YES":
                    result = gamePlay();
                    System.out.println("You " + result );
                    break;
                case "NO":
                    System.out.println("Game will exit.");
                    menu = false;
                    break;
                default:
                    System.out.println("Invalid input. Please type 'YES' or 'NO'.");
                    break;
            }
        }

    }
}
