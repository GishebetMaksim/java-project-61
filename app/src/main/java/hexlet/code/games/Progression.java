package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Cli;

import java.util.Random;

public class Progression {
    public  static  void getProgression() {
        Random rnd = new Random();
        final int iterationsCount = 3;
        final int minBoundOf1stNumber = 50;
        final int minStep = 1; // Включительно
        final int maxStep = 11; // Не включительно
        final int minStepCount = 5; // Включительно
        final int maxStepCount = 11; // Не включительно



        System.out.println("What number is missing in the progression?");

        for (int j = 0; j < iterationsCount; j++) {
            System.out.print("Question: ");
            int firstNumber = rnd.nextInt(minBoundOf1stNumber);
            int trueAnswer = 0;
            int step = rnd.nextInt(maxStep - minStep) + minStep;
            int stepCount = rnd.nextInt(maxStepCount - minStepCount) + minStepCount;
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

            String answer = App.getScanner().next();
            try {
                Integer.parseInt(answer);
            } catch (NumberFormatException e) {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + trueAnswer + "'.");
                System.out.println("Let's try again, " + Cli.getName() + "!");
                return;
            }

            if (Integer.parseInt(answer) == trueAnswer) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + trueAnswer + "'.");
                System.out.println("Let's try again, " + Cli.getName() + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + Cli.getName() + "!");
    }
}
