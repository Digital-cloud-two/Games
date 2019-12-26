package net.dark.game;

public class Zodiac extends Games {

    @Override
    public void starting() {
        begin();
    }

    private static void begin() {
        showWelcomeText();
    }

    private static void showWelcomeText() {
        System.out.println("******************* ZODIAC *****************************" +
                "\nYou're welcome!!!");
    }

    private static void showNextTimeText() {
        System.out.println("Next time!!!");
    }

    private static void showTextWrong() {
        System.out.println("Something is wrong!!!");
    }

    private static void whatDoYouWannaKnow(){

    }
}
