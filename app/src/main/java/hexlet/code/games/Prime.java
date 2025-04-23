package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    public static void simpleNumber() {
        String exercise = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        var questions = new String[Engine.getIterationsCount()];
        var trueAnswers = new String[Engine.getIterationsCount()];
        final int max = 200;
        final int min = 2;

        for (int j = 0; j < Engine.getIterationsCount(); j++) {
            int question = (int) ((Math.random() * ((max - min) + 1)) + min);
            questions[j] = String.valueOf(question);

            boolean isSimple = true;

            for (int i = 2; i <= question / 2; i++) {
                if (question % i == 0) {
                    isSimple = false;
                    break;
                }
            }

            trueAnswers[j] = isSimple ? "yes" : "no";
        }
        Engine.game(exercise, questions, trueAnswers);
    }
}
