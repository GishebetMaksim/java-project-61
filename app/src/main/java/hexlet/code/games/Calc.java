package hexlet.code.games;

import hexlet.code.Engine;

import  java.util.Random;

public class Calc {
    public static void gameCalc() {
        Random rand = new Random();

        String exercise = "What is the result of the expression?";
        var questions = new String[Engine.getIterationsCount()];
        var trueAnswers = new String[Engine.getIterationsCount()];

        final var maxBound = 100;
        int firstNumber;
        int secondNumber;
        final int actionNumber = 3;
        enum Action {
            plus,
            minus,
            multiply
        }

        for (int i = 0; i < Engine.getIterationsCount(); i++) {
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

            questions[i] = firstNumber + " " + strAction + " " + secondNumber;
            trueAnswers[i] = String.valueOf(result);
        }
        Engine.game(exercise, questions, trueAnswers);
    }
}
