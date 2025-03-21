package hexlet.code;

import  java.util.Random;
import java.util.Scanner;

public class Even {
    public static void gameEven() {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int randInt;
        String answer;
        //int corrAnswCounter = 0;

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        for(int i = 0; i < 3; i++) {
            randInt = rand.nextInt(100);
            System.out.println("Question: " + randInt);
            System.out.print("Your answer: ");
            answer = scanner.nextLine();
            if ((randInt % 2 == 0 && answer.equals("yes")) || (randInt % 2 != 0 && answer.equals("no"))) {
                System.out.println("Correct!");
                //corrAnswCounter ++;
            } else {
                String trueAnswer = answer.equals("yes") ? "no" : "yes";
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was " + trueAnswer + ".");
                System.out.println("Let's try again, " + Cli.name + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + Cli.name + "!");
    }
}
