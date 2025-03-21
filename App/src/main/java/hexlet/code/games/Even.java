package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.App;

import  java.util.Random;

public class Even {
    public static void gameEven() {
        //Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int randInt;
        String answer;

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        for(int i = 0; i < 3; i++) {
            randInt = rand.nextInt(100);
            System.out.println("Question: " + randInt);
            System.out.print("Your answer: ");
            answer = App.scanner.next();
            if ((randInt % 2 == 0 && answer.equals("yes")) || (randInt % 2 != 0 && answer.equals("no"))) {
                System.out.println("Correct!");
            } else {
                String trueAnswer = answer.equals("yes") ? "no" : "yes";
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + trueAnswer + "'.");
                System.out.println("Let's try again, " + Cli.name + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + Cli.name + "!");
    }
}
