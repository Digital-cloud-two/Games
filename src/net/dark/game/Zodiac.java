package net.dark.game;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Zodiac extends Games {

    //private static Scanner scannerUserInformation = new Scanner(System.in);

    @Override
    public void starting() {
        begin();
    }

    private static void begin() {
        workWithJsonFile();
        showWelcomeText();
        while (true) {
            showTextWhatDoYouWannaKnow();
            int userSolution = takeAndCheckUserSolution();
            if (userSolution == 1) {
                showTextBirthday();
                while (true) {
                    if (1 == findSign(userEnterMonthDayBirthday())){
                        break;
                    }else {
                        continue;
                    }
                }
            } else if (userSolution == 2) {
                showTextChooseSign();
                userEnterNumberSign();
//                workWithJsonFile();
                getNumberOfInformation();
                continue;
            } else if (userSolution == 3) {
                System.out.println("The number three doesn't work!!!");
                continue;
            } else if (userSolution == 0) {
                return;
            }
//        // ver 1
//        showTextBirthday();
//        showTextDayBirthday();
//        userEnterDay();
//        showTextMonthBirthday();
//        userEnterMonth();
//        transformationFromIntIntoString();
//        checkDayNumber();

////         Question  ???????????

//        showTextDoYouWannaTryAgain();
//        System.out.println(checkUserAnswerYesNo(userEnterAnswerYesNo()));
//        // ver 2
//        showTextChooseSign();
//        userEnterNumberSign();
//        workWithJsonFile();
//        getNumberOfInformation();
//        //end 2
        }
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
        System.out.println("\nChoose the number what you wanna know:" +
                "\n                   1. FIND YOUR SIGN" +
                "\n                   2. INFORMATION ON ASTROLOGY" +
                "\n                   3. LOVE COMPATIBILITY" + " ***  Sorry but Now it doesn't work" +
                "\n                   0. Exit");
    }

    private static int takeAndCheckUserSolution() {
        int userSolutionWhatHeWants;
        while (true) {
            Scanner scannerUserInformationLocation = new Scanner(System.in);
            try {
                userSolutionWhatHeWants = scannerUserInformationLocation.nextInt();
            } catch (Exception e) {                                         // What kind of mistake is better to catch?
                System.out.println("Something is wrong!!!  Try again.");
                showTextWhatDoYouWannaKnow();
                continue;
            }

            if (userSolutionWhatHeWants >= 0 & userSolutionWhatHeWants <= 3) {

            } else {
                System.out.println("Chose is wrong! Try again.");
                showTextWhatDoYouWannaKnow();
                continue;
            }
            return userSolutionWhatHeWants;
        }
    }

    // ********   version 1   ******************************************************************

    private static void showTextBirthday() {
        System.out.println("We need to know when the birthday is: ");
    }

//    private static float userMonthDay;

    private static float userEnterMonthDayBirthday() {
        while (true) {
            System.out.println("Please enter the date of birthday in this form: \nMM,DD  ");
            Scanner scannerUserMonthDay = new Scanner(System.in);
            float userMonthDay;
            try {
                userMonthDay = scannerUserMonthDay.nextFloat();
            } catch (Exception e) {
                System.out.println("The date is wrong!!!  Try again");
                continue;
            }

            if (userMonthDay < 1.00 || userMonthDay > 12.32) {
                System.out.println("The date of Birthday is wrong!!! " + userMonthDay +
                        "\n Try again.");
                continue;
            }
            return userMonthDay;
        }
    }

    private static int findSign(float userMonthDay) {
        if (1.00 < userMonthDay & 1.20 > userMonthDay) {
            System.out.println(stringArrayListZodiacNames.get(11));
            return 1;
        } else if (12.21 < userMonthDay & 12.32 > userMonthDay) {
            System.out.println(stringArrayListZodiacNames.get(11));
            return 1;
        }else if (1.19 < userMonthDay & 1.32 > userMonthDay) {
            System.out.println(stringArrayListZodiacNames.get(0));
            return 1;
        } else if (2.00 < userMonthDay & 2.19 > userMonthDay) {
            System.out.println(stringArrayListZodiacNames.get(0));
            return 1;
        }else if (2.18 < userMonthDay & 2.32 > userMonthDay) {
            System.out.println(stringArrayListZodiacNames.get(1));
            return 1;
        } else if (3.00 < userMonthDay & 3.21 > userMonthDay) {
            System.out.println(stringArrayListZodiacNames.get(1));
            return 1;
        }else if (3.22 < userMonthDay & 3.32 > userMonthDay) {
            System.out.println(stringArrayListZodiacNames.get(2));
            return 1;
        } else if (4.00 < userMonthDay & 4.20 > userMonthDay) {
            System.out.println(stringArrayListZodiacNames.get(2));
            return 1;
        }else if (4.19 < userMonthDay & 4.32 > userMonthDay) {
            System.out.println(stringArrayListZodiacNames.get(3));
            return 1;
        } else if (5.00 < userMonthDay & 5.20 > userMonthDay) {
            System.out.println(stringArrayListZodiacNames.get(3));
            return 1;
        }else if (5.20 < userMonthDay & 5.32 > userMonthDay) {
            System.out.println(stringArrayListZodiacNames.get(4));
            return 1;
        } else if (6.00 < userMonthDay & 6.21 > userMonthDay) {
            System.out.println(stringArrayListZodiacNames.get(4));
            return 1;
        }else if (6.20 < userMonthDay & 6.32 > userMonthDay) {
            System.out.println(stringArrayListZodiacNames.get(5));
            return 1;
        } else if (7.00 < userMonthDay & 7.23 > userMonthDay) {
            System.out.println(stringArrayListZodiacNames.get(5));
            return 1;
        }else if (7.22 < userMonthDay & 7.32 > userMonthDay) {
            System.out.println(stringArrayListZodiacNames.get(6));
            return 1;
        } else if (8.00 < userMonthDay & 8.23 > userMonthDay) {
            System.out.println(stringArrayListZodiacNames.get(6));
            return 1;
        }else if (8.22 < userMonthDay & 8.32 > userMonthDay) {
            System.out.println(stringArrayListZodiacNames.get(7));
            return 1;
        } else if (9.00 < userMonthDay & 9.23 > userMonthDay) {
            System.out.println(stringArrayListZodiacNames.get(7));
            return 1;
        }else if (9.22 < userMonthDay & 9.32 > userMonthDay) {
            System.out.println(stringArrayListZodiacNames.get(8));
            return 1;
        } else if (10.00 < userMonthDay & 10.23 > userMonthDay) {
            System.out.println(stringArrayListZodiacNames.get(8));
            return 1;
        }else if (10.22 < userMonthDay & 10.32 > userMonthDay) {
            System.out.println(stringArrayListZodiacNames.get(9));
            return 1;
        } else if (11.00 < userMonthDay & 11.22 > userMonthDay) {
            System.out.println(stringArrayListZodiacNames.get(9));
            return 1;
        }else if (11.21 < userMonthDay & 11.32 > userMonthDay) {
            System.out.println(stringArrayListZodiacNames.get(10));
            return 1;
        } else if (12.00 < userMonthDay & 12.22 > userMonthDay) {
            System.out.println(stringArrayListZodiacNames.get(10));
            return 1;
        }else{
            return 0;
        }
    }

    private static void showTextDayBirthday() {
        System.out.println("Enter the day of birthday:");
    }

    private static int userDayBirthday;

    private static void userEnterDay() {
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

    private static int userMonthBirthday;

    private static void userEnterMonth() {
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

    private static void transformationFromIntIntoString() {
        Integer dayBirthday = userDayBirthday;
        String strDayBirthday = dayBirthday.toString();

        Integer monthBirthday = userMonthBirthday;
        String strMonthBirthday = monthBirthday.toString();
    }

    private static void checkDayNumber() {
        if (userDayBirthday < 10) {
            System.out.println(userDayBirthday + "  1");
        } else {
            System.out.println(userDayBirthday + "  2");
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

    private static int userEnterNumberSign;

    private static void userEnterNumberSign() {

        while (true) {
            Scanner scannerUserInformationNumberSing = new Scanner(System.in);
            try {
                userEnterNumberSign = scannerUserInformationNumberSing.nextInt();
            } catch (Exception e) {
                System.out.println("Something is wrong!!!  Try again.");
                showTextChooseSign();
                continue;
            }

            if (userEnterNumberSign < 1 || userEnterNumberSign > 12) {
                System.out.println("The number of zodiac sign is wrong!!!  Try again.");
                showTextChooseSign();
                continue;
            }
            //                    System.out.println(userEnterNumberSign);
            return;
        }
    }

    private static void workWithJsonFile() {
        JSONParser jsonParser = new JSONParser();

        try {
            FileReader fileReader = new FileReader("ZODIAC SIGNS.json");
            Object object = jsonParser.parse(fileReader);

            JSONArray jsonArray = (JSONArray) object;
            //           System.out.println(jsonArray);  // Show JSONArray

            //          jsonArray.forEach(emp -> parserZodiacSigns((JSONObject) emp));
            jsonArray.forEach(emp -> parserSignNames((JSONObject) emp)); //Creat an array of names
            jsonArray.forEach(emp -> parserSignsInformation((JSONObject) emp));


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void parserZodiacSigns(JSONObject zodiacJsonObject) {

        JSONObject jsonObject = (JSONObject) zodiacJsonObject.get("zodiac");

        String stringSign = (String) jsonObject.get("sign");
        System.out.println("\n" + stringSign);

        String stringDate = (String) jsonObject.get("date_range");
        System.out.println(stringDate);

        String stringInformation = (String) jsonObject.get("information");
        System.out.println(stringInformation);
    }

    private static ArrayList<String> stringArrayListZodiacNames = new ArrayList<String>();

    private static void parserSignNames(JSONObject zodiacJsonObject) {

        JSONObject jsonObject = (JSONObject) zodiacJsonObject.get("zodiac");
        String stringSign = (String) jsonObject.get("sign");
        stringArrayListZodiacNames.add(stringSign);
    }

    private static void testArray() {
        System.out.println(stringArrayListZodiacNames);

    }

    private static ArrayList<String> stringArrayListZodiacInformation = new ArrayList<String>();

    private static void parserSignsInformation(JSONObject zodiacJsonObject) {

        JSONObject jsonObject = (JSONObject) zodiacJsonObject.get("zodiac");
        String stringInformation = (String) jsonObject.get("information");
        stringArrayListZodiacInformation.add(stringInformation);

    }

    private static void testArrayInformation() {
        System.out.println("\n" + stringArrayListZodiacInformation);
    }

    private static void getNumberOfInformation() {
        System.out.println(stringArrayListZodiacInformation.get(userEnterNumberSign -1));
    }
    // ********  ver 2 The end   ******************************************************************

}

