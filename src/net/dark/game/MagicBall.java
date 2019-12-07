package net.dark.game;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    private static Scanner scannerUserInformation = new Scanner(System.in);

    void starting() {
        begin();
    }

    private static void begin() {
        
    }

    private static void showWelcomeText() {
        System.out.println("You're welcome!!!");
    }

    private static void showGoodByeText() {
        System.out.println("Good bye!!!");
    }

    private static void showDoYouWannaPlay() {
        System.out.println("Do you wanna play the game? \n ((Yes = Y) or (No = N))");
    }

    private static String userAnswer() {
        String userAnswerYesNo = scannerUserInformation.next();
        return userAnswerYesNo;
    }

    private static int checkUserAnswer(String userAnswerYesNo) {
        switch (userAnswerYesNo) {
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

    private static void showAskQuestion() {
        System.out.println("Ask a question:");
    }

    private static void userAskQuestion() {
        String string = scannerUserInformation.toString();
    }

    private static void giveUserAnswer() {
        Random random = new Random();
        int randomNumber = random.nextInt(6);
        switch (randomNumber) {
            case 0:
                System.out.println("Very doubtful");
                break;
            case 1:
                System.out.println("Outlook is good");
                break;
            case 2:
                System.out.println("Outlook is not very good");
                break;
            case 3:
                System.out.println("Ask again later");
                break;
            case 4:
                System.out.println("Concentrate and ask again");
                break;
            case 5:
                System.out.println("Most likely");
                break;
            case 6:
                System.out.println("Do not count on it");
                break;
        }
    }

    private static void showDoYouWannaTryAgain(){
        System.out.println("DO you wanna try again? \n ((Yes = Y) or (No = N))");
    }
}