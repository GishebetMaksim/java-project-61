package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import  java.util.Random;

public class Even {
    private final static String EXERCISE = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private final static int MAX_BOUND = 100;

    public static void gameEven() {
        String[][] questionAnswer = new String[Engine.getIterationsCount()][2];

        for (int i = 0; i < Engine.getIterationsCount(); i++) {
            var randInt = Utils.randomNumberInRange(0, MAX_BOUND);;
            questionAnswer[i][0] = String.valueOf(randInt);
            questionAnswer[i][1] = isEven(randInt) ? "yes" : "no";
        }
        Engine.game(EXERCISE, questionAnswer);
    }

    static boolean isEven(int num) {
        return  num % 2 == 0;
    }
}
