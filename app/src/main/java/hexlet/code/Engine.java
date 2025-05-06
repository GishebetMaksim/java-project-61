package hexlet.code;

public class Engine {
    private static final int ITERATIONS_COUNT = 3;
    public static int getIterationsCount() {
        return ITERATIONS_COUNT;
    }

    public  static void game(String exercise, String[][] questionAnswer) {
        String name;
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        name = App.getScanner().next();
        System.out.println("Hello, " + name + "!");

        System.out.println(exercise);

        for (int i = 0; i < ITERATIONS_COUNT; i++) {
            System.out.println("Question: " + questionAnswer[i][0]);
            System.out.print("Your answer: ");
            var answer = App.getScanner().next();

            if (answer.equals(questionAnswer[i][1])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                        + questionAnswer[i][1] + "'.");
                System.out.println("Let's try again, " + name + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
}
