package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class Calc {
    private static final String EXERCISE = "What is the result of the expression?";
    private static final int MAX_BOUND = 100;
    private static final String[] ACTIONS = {"+", "-", "*"};

    public static void gameCalc() {
        String[][] questionAnswer = new String[Engine.getIterationsCount()][2];

        int firstNumber;
        int secondNumber;

        for (int i = 0; i < Engine.getIterationsCount(); i++) {
            firstNumber = Utils.randomNumberInRange(0, MAX_BOUND);
            secondNumber = Utils.randomNumberInRange(0, MAX_BOUND);

            String action = ACTIONS[Utils.randomNumberInRange(0, ACTIONS.length)];

            if (action.equals("*")) {
                final int minValue = 3;  // Для умножения числа меньше, чем для сложения и вычитания
                    final int maxValue = 11;
                    firstNumber = Utils.randomNumberInRange(minValue, maxValue);
                    secondNumber = Utils.randomNumberInRange(minValue, maxValue);
            }

            questionAnswer[i][0] = firstNumber + " " + action + " " + secondNumber;
            questionAnswer[i][1] = String.valueOf(calc(firstNumber, secondNumber, action));
        }
        Engine.game(EXERCISE, questionAnswer);
    }

    static int calc(int num1, int num2, String action) {
        int result = 0;

        switch (action) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            default:
                break;
        }
        return  result;
    }
}
