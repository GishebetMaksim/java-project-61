package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Cli;

import  java.util.Random;

public class Calc {
    public static void gameCalc() {
        Random rand = new Random();

        System.out.println("What is the result of the expression?");
        final var iterationsCount = 3;
        final var maxBound = 100;
        int firstNumber;
        int secondNumber;
        final int actionNumber = 3;
        enum Action {
            plus,
            minus,
            multiply
        }

        for (int i = 0; i < iterationsCount; i++) {
            firstNumber = rand.nextInt(maxBound);
            secondNumber = rand.nextInt(maxBound);
            Action action = Action.values()[rand.nextInt(actionNumber)];
            int result = 0;

            String strAction = "";

            switch (action) {
                case Action.plus:
                    strAction = "+";
                    result = firstNumber + secondNumber;
                    break;
                case Action.minus:
                    strAction = "-";
                    result = firstNumber - secondNumber;
                    break;
                case  Action.multiply:
                    strAction = "*";
                    final int minValue = 3;
                    final int maxValue = 10;
                    firstNumber = rand.nextInt(maxValue - minValue + 1) + minValue;
                    secondNumber = rand.nextInt(maxValue - minValue + 1) + minValue;
                    result = firstNumber * secondNumber;
                    break;
                default:
                    break;
            }
            System.out.println("Question: " + firstNumber + " " + strAction + " " + secondNumber);
            System.out.print("Your answer: ");
            int answer = App.getScanner().nextInt();

            if (answer == result) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + result + "'");
                System.out.println("Let's try again, " + Cli.name + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + Cli.name + "!");
    }
}
