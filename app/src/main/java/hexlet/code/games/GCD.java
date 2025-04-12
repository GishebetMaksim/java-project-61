package hexlet.code.games;

import hexlet.code.brain_games;
import hexlet.code.Cli;

import java.util.Random;

public class GCD {
    public  static void getGCD() {
        System.out.println("Find the greatest common divisor of given numbers.");

        Random rand = new Random();

        for (int i = 0; i < 3; i++) {
            int a = rand.nextInt(100) + 1;
            int b = rand.nextInt(100) + 1;
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

            String answer = brain_games.scanner.next();

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
