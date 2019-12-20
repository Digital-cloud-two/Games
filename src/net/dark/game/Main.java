package net.dark.game;

public class Main {
    public static void main(String[] args) {
        //test 1
///////////////* E n c a p s u l a t i o n *//////////////////
        MagicBall.setStringArrayList("The answer is:   Very doubtful");
        MagicBall.setStringArrayList("The answer is:   Outlook is good");
        MagicBall.setStringArrayList("The answer is:   Outlook is not very good");
        MagicBall.setStringArrayList("The answer is:   Ask again later");
        MagicBall.setStringArrayList("The answer is:   Concentrate and ask again");
        MagicBall.setStringArrayList("The answer is:   Most likely");
        MagicBall.setStringArrayList("The answer is:   Do not count on it");
        // Finish  E n c a p s u l a t i o n

        ChooseTheGame chooseTheGame = new ChooseTheGame();
        chooseTheGame.start();
    }
}
