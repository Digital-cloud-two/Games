package net.dark.game;

import java.util.Scanner;

public class Zodiac extends Games {

    private static Scanner scannerUserInformation = new Scanner(System.in);

    @Override
    public void starting() {
        begin();
    }

    private static void begin() {

    }

    private static void showWelcomeText() {
        System.out.println("******************* ZODIAC *****************************" +
                "\nYou're welcome!!!");
    }

    private static void showTextNextTime() {
        System.out.println("Next time!!!");
    }

    private static void showTextWrong() {
        System.out.println("Something is wrong!!!");
    }

    private static void showTextWhatDoYouWannaKnow() {
        System.out.println("Choose the number what you wanna know:" +
                "\n                   1. FIND YOUR SIGN" +
                "\n                   2. INFORMATION ON ASTROLOGY" +
                "\n                   3. LOVE COMPATIBILITY" +
                "\n                   4. Exit");
    }

    private static void takeAndCheckUserSolution() {
        int userSolutionWhatHeWants;
        while (true) {
            Scanner scannerUserInformation = new Scanner(System.in);
            try {
                userSolutionWhatHeWants = scannerUserInformation.nextInt();
            } catch (Exception e) {                                         // What kind of mistake is better to catch?
                System.out.println("Something is wrong!!!  Try again.");
                continue;
            }

            if (userSolutionWhatHeWants >= 1 & userSolutionWhatHeWants <= 4) {

            } else {
                System.out.println("Chose is wrong! Try again.");
                continue;
            }
            return;
        }
    }


}
