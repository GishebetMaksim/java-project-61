package hexlet.code.games;

import hexlet.code.brain_games;
import hexlet.code.Cli;

import  java.util.Random;

public class Calc {
    public static void gameCalc() {
        Random rand = new Random();

        System.out.println("What is the result of the expression?");

        int firstNumber;
        int secondNumber;
        enum Action {
            plus,
            minus,
            multiply
        }

        for (int i = 0; i < 3; i++) {
            firstNumber = rand.nextInt(100);
            secondNumber = rand.nextInt(100);
            Action action = Action.values()[rand.nextInt(3)];
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
                    int minValue = 3;
                    int maxValue = 10;
                    firstNumber = rand.nextInt(maxValue - minValue + 1) + minValue;
                    secondNumber = rand.nextInt(maxValue - minValue + 1) + minValue;
                    result = firstNumber * secondNumber;
                    break;
                default:
                    break;
            }
            System.out.println("Question: " + firstNumber + " " + strAction + " " + secondNumber);
            //System.out.println(" = " + result);
            System.out.print("Your answer: ");
            int answer = brain_games.scanner.nextInt();

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
