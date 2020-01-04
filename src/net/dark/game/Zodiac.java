package net.dark.game;

import java.util.Scanner;

public class Zodiac extends Games {

    //private static Scanner scannerUserInformation = new Scanner(System.in);

    @Override
    public void starting() {
        begin();
    }

    private static void begin() {
//        showWelcomeText();
//        showTextWhatDoYouWannaKnow();
//        takeAndCheckUserSolution();
//        showTextBirthday();
//        showTextDayBirthday();
//        userEnterDay();
//        showTextMonthBirthday();
//        userEnterMonth();
        // Question  ???????????
        showTextDoYouWannaTryAgain();
        System.out.println( checkUserAnswerYesNo(userEnterAnswerYesNo()));

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
            Scanner scannerUserInformationLocation = new Scanner(System.in);
            try {
                userSolutionWhatHeWants = scannerUserInformationLocation.nextInt();
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

    // ********  version 1   ******************************************************************

    private static void showTextBirthday() {
        System.out.println("We need to know when is the birthday. ");
    }

    private static void showTextDayBirthday() {
        System.out.println("Enter the day of birthday:");
    }

    private static void userEnterDay() {
        int userDayBirthday;
        while (true) {
            Scanner scannerUserInformationLocation = new Scanner(System.in);
            try {
                userDayBirthday = scannerUserInformationLocation.nextInt();
            } catch (Exception e) {
                System.out.println("Something is wrong!!!  Try again.");
                continue;
            }

            if (userDayBirthday < 1 || userDayBirthday > 31) {
                System.out.println("The day of Birthday is wrong!!!  Try again.");
                continue;
            }
            return;
        }
    }

    private static void showTextMonthBirthday(){
        System.out.println("Enter the month of birthday:");
    }

    private static void userEnterMonth(){
        int userMonthBirthday;
        while (true) {
            Scanner scannerUserInformationLocation = new Scanner(System.in);
            try {
                userMonthBirthday = scannerUserInformationLocation.nextInt();
            } catch (Exception e) {
                System.out.println("Something is wrong!!!  Try again.");
                continue;
            }

            if (userMonthBirthday < 1 || userMonthBirthday > 12) {
                System.out.println("The month of Birthday is wrong!!!  Try again.");
                continue;
            }
            return;
        }
    }

    private static void showTextTheSign(){}

    //???????????   Question   ?????????????????????????????????????????????????????????????

    private static void showTextDoYouWannaTryAgain(){
        System.out.println("Do you wanna try again?  ((Yes = Y) or (No = N))");
    }

    private static String userEnterAnswerYesNo(){
        Scanner scannerUserInformation = new Scanner(System.in);
        String userAnswerYesNo = scannerUserInformation.next();
        return userAnswerYesNo;
    }

    private static int checkUserAnswerYesNo(String userAnswer){
        if (userAnswer == "Yes" || userAnswer =="Y" || userAnswer =="y"){
            return 1;
        }
        return 0;
    }

}
