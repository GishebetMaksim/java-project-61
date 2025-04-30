package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static final String EXERCISE = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final int MAX_BOUND = 100;

    public static void gameEven() {
        String[][] questionAnswer = new String[Engine.getIterationsCount()][2];

        for (int i = 0; i < Engine.getIterationsCount(); i++) {
            var randInt = Utils.randomNumberInRange(0, MAX_BOUND);
            questionAnswer[i][0] = String.valueOf(randInt);
            questionAnswer[i][1] = isEven(randInt) ? "yes" : "no";
        }
        Engine.game(EXERCISE, questionAnswer);
    }

    static boolean isEven(int num) {
        return  num % 2 == 0;
    }
}
