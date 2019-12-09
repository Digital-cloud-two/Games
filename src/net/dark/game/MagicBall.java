package net.dark.game;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    private static Scanner scannerUserInformation = new Scanner(System.in);

    void starting() {
        begin();
    }

    private static void begin() {
        showWelcomeText();
        showDoYouWannaPlay();
        while(true) {
            int checkedUserAnswer = checkUserAnswer(userAnswer());
            while (true) {
                if (checkedUserAnswer == 1) {
                    showAskQuestion();
                    userAskQuestion();
                    giveUserAnswer();
                    break;
                } else if (checkedUserAnswer == 2) {
                    showGoodByeText();
                    return;
                } else {
                    showTextWrong();
                    break;
                }
            }
            showDoYouWannaTryAgain();
            continue;
        }
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

    private static void  userAskQuestion() {
        String string = scannerUserInformation.next();
    }

    private static void giveUserAnswer() {
        Random random = new Random();
        int randomNumber = random.nextInt(6);
        String array[]={"Very doubtful","Outlook is good","Outlook is not very good",
                "Ask again later","Concentrate and ask again","Most likely","Do not count on it"};
        System.out.println(array[randomNumber]);
    }

    private static void showDoYouWannaTryAgain(){
        System.out.println("DO you wanna try again? \n ((Yes = Y) or (No = N))");
    }

    private static void showTextWrong(){
        System.out.println("Something is wrong!!!");
    }
}