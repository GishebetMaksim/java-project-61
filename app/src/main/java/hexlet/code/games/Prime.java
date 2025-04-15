package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Cli;

public class Prime {
    public static void simpleNumber() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        int max = 200;
        int min = 2;
        int iterationsCount = 3;

        for (int j = 0; j < iterationsCount; j++) {
            int question = (int) ((Math.random() * ((max - min) + 1)) + min);

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String answer = App.getScanner().next();

            boolean isSimple = true;

            for (int i = 2; i <= question / 2; i++) {
                if (question % i == 0) {
                    isSimple = false;
                    break;
                }
            }

            if ((answer.equals("yes") && isSimple) || (answer.equals("no") && !isSimple)) {
                System.out.println("Correct!");
            } else {
                String trueAnswer = isSimple ? "yes" : "no";
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + trueAnswer + "'.");
                System.out.println("Let's try again, " + Cli.name + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + Cli.name + "!");
    }
}
