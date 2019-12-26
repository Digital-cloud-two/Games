package net.dark.game;

import java.util.Scanner;

public class ChooseTheGame {
    private static Scanner scannerUserSolution = new Scanner(System.in);
    private static Games game = null;

    void start() {
        begin();
    }

    private static void begin() {
        showWelcomeText();
        while (true) {
            showChooseTheGame();
            int userSolution = checkUserSoulution(userSolution());
            while (true) {
                if (userSolution == 1) {
                    game = new MagicBall();
                    methodShowPolymorphism(game);
                    break;
                } else if (userSolution == 2) {
                    game = new Zodiac();
                    methodShowPolymorphism(game);
                    break;

                } else if (userSolution == 0) {
                    showGoodByeText();
                    return; // Exit
                } else {
                    showTextWrong();
                    break;
                }
            }
            while (true) {
                doYouWannaSolveAgain();
                int checedUserAnswer = checkUserAnswer(userAnswer());
                if (checedUserAnswer == 1) {
                    break;
                } else if (checedUserAnswer == 2) {
                    showGoodByeText();
                    return;
                } else {
                    showTextWrong();
                    continue;
                }
            }
            continue;
        }
    }

    private static void methodShowPolymorphism(Games game) {
        game.starting();
    }

    private static void showWelcomeText() {
        System.out.println("Hi there!!!");
    }

    private static void showGoodByeText() {
        System.out.println("Good bye !!! \n--The End--");
    }

    private static void showChooseTheGame() {
        System.out.println("Choose the game:  1.Magic ball\n" +
                "                  2.Zodiac\n" +
                "                  0.Exit\nYour solution is:");
    }

    private static String userSolution() {
        String stringUserSolution = scannerUserSolution.next();
        return stringUserSolution;
    }

    private static int checkUserSoulution(String stringUserSollution) {
        switch (stringUserSollution) {
            case "0":
                return 0;
            case "e":
                return 0;
            case "Exit":
                return 0;
            case "exit":
                return 0;
            case "1":
                return 1;
            case "2":
                return 2;
            case "Magic ball":
                return 1;
            case "Zodiac":
                return 2;
            case "z":
                return 2;
            case "magic ball":
                return 1;
            case "m":
                return 1;
            case "zodiac":
                return 2;
            default:
                return 3;
        }
    }

    private static void doYouWannaSolveAgain() {
        System.out.println("Do you want to solve what kind of game you'll play? ((Yes = Y) or (No = N))");
    }

    private static String userAnswer() {
        String stringUserAnswerYesNo = scannerUserSolution.next();
        return stringUserAnswerYesNo;
    }

    private static int checkUserAnswer(String stringUserAnswerYesNo) {
        switch (stringUserAnswerYesNo) {
            case "Y":
                return 1;
            case "y":
                return 1;
            case "N":
                return 2;
            case "n":
                return 2;
            default:
                return 3;
        }
    }

    private static void showTextWrong() {
        System.out.println("Something is wrong!!!");
    }
}