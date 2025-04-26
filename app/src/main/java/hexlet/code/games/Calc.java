package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class Calc {
    private final static String EXERCISE = "What is the result of the expression?";
    private final static int MAX_BOUND = 100;
    private final static int ACTION_NUMBER = 3;

    enum Action {
        plus,
        minus,
        multiply
    }

    public static void gameCalc() {
        //Random rand = new Random();

        String[][] questionAnswer = new String[Engine.getIterationsCount()][2];

        int firstNumber;
        int secondNumber;

        for (int i = 0; i < Engine.getIterationsCount(); i++) {
            firstNumber = Utils.randomNumberInRange(0, MAX_BOUND);
            secondNumber = Utils.randomNumberInRange(0, MAX_BOUND);
            Action action = Action.values()[Utils.randomNumberInRange(0, ACTION_NUMBER)];

            String strAction = "";

            switch (action) {
                case Action.plus:
                    strAction = "+";
                    break;
                case Action.minus:
                    strAction = "-";
                    break;
                case  Action.multiply:
                    strAction = "*";
                    final int minValue = 3;  // Для умножения числа меньше, чем для сложения и вычитания
                    final int maxValue = 11;
                    firstNumber = Utils.randomNumberInRange(minValue, maxValue);
                    secondNumber = Utils.randomNumberInRange(minValue, maxValue);
                    break;
                default:
                    break;
            }

            questionAnswer[i][0] = firstNumber + " " + strAction + " " + secondNumber;
            questionAnswer[i][1] = String.valueOf(calc(firstNumber, secondNumber, action));
        }
        Engine.game(EXERCISE, questionAnswer);
    }

    static int calc(int num1, int num2, Action action) {
        int result = 0;

        switch (action) {
            case Action.plus:
                result = num1 + num2;
                break;
            case Action.minus:
                result = num1 - num2;
                break;
            case  Action.multiply:
                result = num1 * num2;
                break;
            default:
                break;
        }
        return  result;
    }
}
