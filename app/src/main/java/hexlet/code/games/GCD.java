package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Cli;

import java.util.Random;

public class GCD {
    public  static void getGCD() {
        System.out.println("Find the greatest common divisor of given numbers.");

        Random rand = new Random();

        final int iterationsCount = 3;
        final int maxBound = 100;
        final int minBound = 1;

        for (int i = 0; i < iterationsCount; i++) {
            int a = rand.nextInt(maxBound) + minBound;
            int b = rand.nextInt(maxBound) + minBound;
            int gcd = 1;

            System.out.println("Question: " + a + " " + b);
            System.out.print("Your answer: ");

            int max = Math.max(a, b);
            int min = Math.min(a, b);
            int remains = 1;

            while (remains > 0) {
                remains = max % min;
                if (remains == 0) {
                    //System.out.println(min);
                    gcd = min;
                    break;
                }
                max = min;
                min = remains;
            }

            String answer = App.getScanner().next();

            try {
                Integer.parseInt(answer);
            } catch (NumberFormatException e) {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + gcd + "'.");
                System.out.println("Let's try again, " + Cli.name + "!");
                return;
            }

            if (Integer.parseInt(answer) == gcd) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + gcd + "'.");
                System.out.println("Let's try again, " + Cli.name + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + Cli.name + "!");
    }
}
