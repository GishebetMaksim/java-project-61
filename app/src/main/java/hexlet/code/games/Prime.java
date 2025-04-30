package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    private static final String EXERCISE = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int MAX = 200;
    private static final int MIN = 2;

    public static void simpleNumber() {
        String[][] questionAnswer = new String[Engine.getIterationsCount()][2];

        for (int j = 0; j < Engine.getIterationsCount(); j++) {
            int question = Utils.randomNumberInRange(MIN, MAX);
            questionAnswer[j][0] = String.valueOf(question);
            questionAnswer[j][1] = isSimple(question) ? "yes" : "no";
        }
        Engine.game(EXERCISE, questionAnswer);
    }

    static boolean isSimple(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
