package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Cli;

import java.util.Random;

public class Progression {
    public  static  void getProgression() {
        Random rnd = new Random();
        System.out.println("What number is missing in the progression?");
        System.out.print("Question: ");

        for (int j = 0; j < 3; j++) {
            int firstNumber = rnd.nextInt(50);
            int trueAnswer = 0;
            int step = rnd.nextInt(10) + 1;
            int stepCount = rnd.nextInt(6) + 5;
            int missNumber = rnd.nextInt(stepCount);
            for (int i = 0; i < stepCount; i++) {
                if (i == missNumber) {
                    System.out.print(".. ");
                    trueAnswer = firstNumber;
                    firstNumber += step;
                    continue;
                }
                System.out.print(firstNumber + " ");
                firstNumber += step;
            }
            System.out.println();
            System.out.print("Your answer: ");

            String answer = App.scanner.next();
            try {
                Integer.parseInt(answer);
            } catch (NumberFormatException e) {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + trueAnswer + "'.");
                System.out.println("Let's try again, " + Cli.name + "!");
                return;
            }

            if (Integer.parseInt(answer) == trueAnswer) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + trueAnswer + "'.");
                System.out.println("Let's try again, " + Cli.name + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + Cli.name + "!");
    }
}
