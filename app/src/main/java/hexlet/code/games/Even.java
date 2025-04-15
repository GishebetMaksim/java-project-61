package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.App;

import  java.util.Random;

public class Even {
    public static void gameEven() {
        Random rand = new Random();
        int randInt;
        String answer;
        final int iterationsCount = 3;
        final int maxBound = 100;

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        for (int i = 0; i < iterationsCount; i++) {
            randInt = rand.nextInt(maxBound);
            System.out.println("Question: " + randInt);
            System.out.print("Your answer: ");
            answer = App.getScanner().next();
            if ((randInt % 2 == 0 && answer.equals("yes")) || (randInt % 2 != 0 && answer.equals("no"))) {
                System.out.println("Correct!");
            } else {
                String trueAnswer = answer.equals("yes") ? "no" : "yes";
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + trueAnswer + "'.");
                System.out.println("Let's try again, " + Cli.getName() + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + Cli.getName() + "!");
    }
}
