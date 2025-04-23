package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class GCD {
    public  static void getGCD() {
        String exercise = "Find the greatest common divisor of given numbers.";
        var questions = new String[Engine.getIterationsCount()];
        var trueAnswers = new String[Engine.getIterationsCount()];

        Random rand = new Random();

        final int maxBound = 100;
        final int minBound = 1;

        for (int i = 0; i < Engine.getIterationsCount(); i++) {
            int a = rand.nextInt(maxBound) + minBound;
            int b = rand.nextInt(maxBound) + minBound;
            int gcd = 1;

            questions[i] = a + " " + b;

            int max = Math.max(a, b);
            int min = Math.min(a, b);
            int remains = 1;

            while (remains > 0) {
                remains = max % min;
                if (remains == 0) {
                    gcd = min;
                    break;
                }
                max = min;
                min = remains;
            }

            trueAnswers[i] = String.valueOf(gcd);
        }
        Engine.game(exercise, questions, trueAnswers);
    }
}
