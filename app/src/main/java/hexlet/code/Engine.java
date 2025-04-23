package hexlet.code;

public class Engine {
    private static final int ITERATIONS_COUNT = 3;
    public static int getIterationsCount() {
        return ITERATIONS_COUNT;
    }

    public  static void game(String exercise, String[] question, String[] trueAnswer) {
        System.out.println(exercise);

        for (int i = 0; i < ITERATIONS_COUNT; i++) {
            System.out.println("Question: " + question[i]);
            System.out.print("Your answer: ");
            var answer = App.getScanner().next();

            if (answer.equals(trueAnswer[i])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + trueAnswer[i] + "'.");
                System.out.println("Let's try again, " + Cli.getName() + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + Cli.getName() + "!");
    }
}
