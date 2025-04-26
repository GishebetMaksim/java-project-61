package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Random;

public class GCD {
    private final static String EXERCISE = "Find the greatest common divisor of given numbers.";
    private final static int MAX_BOUND = 100;
    private final static int MIN_BOUND  = 1;

    public  static void getGCD() {
        String[][] questionAnswer = new String[Engine.getIterationsCount()][2];

        for (int i = 0; i < Engine.getIterationsCount(); i++) {
            int a = Utils.randomNumberInRange(MIN_BOUND, MAX_BOUND);
            int b = Utils.randomNumberInRange(MIN_BOUND, MAX_BOUND);

            questionAnswer[i][0] = a + " " + b;
            questionAnswer[i][1] = String.valueOf(gcd(a, b));
        }
        Engine.game(EXERCISE, questionAnswer);
    }

    static int gcd(int num1, int num2) {
        int max = Math.max(num1, num2);
        int min = Math.min(num1, num2);
        int remains = 1;
        int gcd = 1;
        while (remains > 0) {
            remains = max % min;
            if (remains == 0) {
                gcd = min;
                break;
            }
            max = min;
            min = remains;
        }
        return gcd;
    }
}
