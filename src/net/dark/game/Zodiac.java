package net.dark.game;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
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
//        showTextDoYouWannaTryAgain();
//        System.out.println(checkUserAnswerYesNo(userEnterAnswerYesNo()));
        // ver 2
        showTextChooseSign();
        userEnterNumberSign();
        showTextOnAstrology(1);

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
            Scanner scannerUserInformationDay = new Scanner(System.in);
            try {
                userDayBirthday = scannerUserInformationDay.nextInt();
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

    private static void showTextMonthBirthday() {
        System.out.println("Enter the month of birthday:");
    }

    private static void userEnterMonth() {
        int userMonthBirthday;
        while (true) {
            Scanner scannerUserInformationBirthday = new Scanner(System.in);
            try {
                userMonthBirthday = scannerUserInformationBirthday.nextInt();
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

    private static void showTextTheSign() {
    }

    //???????????   Question   ?????????????????????????????????????????????????????????????

    private static void showTextDoYouWannaTryAgain() {
        System.out.println("Do you wanna try again?  ((Yes = Y) or (No = N))");
    }

    private static String userEnterAnswerYesNo() {
        Scanner scannerUserInformation = new Scanner(System.in);
        String userAnswerYesNo = scannerUserInformation.next();
        return userAnswerYesNo;
    }

    private static String checkUserAnswerYesNo(String userAnswer) {

        if (userAnswer.equals("YES") || userAnswer.equals("Yes") || userAnswer.equals("Y") || userAnswer.equals("y")) {
            return "YES";
        } else if (userAnswer.equals("NO") || (userAnswer.equals("No") || userAnswer.equals("N") || userAnswer.equals("n"))) {
            return "NO";
        }
        return "WRONG";
    }
    //?????????  The end question  ????????????????????????????????????????????????????????????

    // ********  version 2   ******************************************************************

    private static void showTextChooseSign() {
        System.out.println("Choose the number of zodiac sign:" +
                "\n| 1.Aquarius | 2.Pisces | 3.Aries | 4.Taurus | 5.Gemini | 6.Cancer" +
                " | 7.Leo | 8.Virgo | 9.Libra | 10.Scorpio | 11.Sagittarius | 12.Capricorn |");
    }

    private static void userEnterNumberSign() {
        int userEnterNumberSign;
        while (true) {
            Scanner scannerUserInformationNumberSing = new Scanner(System.in);
            try {
                userEnterNumberSign = scannerUserInformationNumberSing.nextInt();
            } catch (Exception e) {
                System.out.println("Something is wrong!!!  Try again.");
                continue;
            }

            if (userEnterNumberSign < 1 || userEnterNumberSign > 12) {
                System.out.println("The number of zodiac sign is wrong!!!  Try again.");
                continue;
            }
            return;
        }
    }

    private static void showTextOnAstrology(int numberSign) {
        JSONParser jsonParser = new JSONParser();


        try {
            FileReader fileReader = new FileReader("ZODIAC SIGNS.json");
            Object object = jsonParser.parse(fileReader);
            JSONObject jsonObject =(JSONObject) object;

            System.out.println(jsonObject.get("aquarius"));

//            for(Iterator iterator = jsonObject.keySet().iterator(); iterator.hasNext();){
//                String key = (String) iterator.next();
//                System.out.println(jsonObject.get(key));
//            }

            JSONArray jsonArray = (JSONArray) object;
            System.out.println(jsonArray);
//            parserZodiacSins((JSONObject) object);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void parserZodiacSins(JSONObject zodiacJsonObject){}
}




















