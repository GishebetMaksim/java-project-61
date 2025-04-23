package hexlet.code.games;

import hexlet.code.Engine;

import  java.util.Random;

public class Even {
    public static void gameEven() {
        Random rand = new Random();
        int randInt;
        final int iterationsCount = 3;
        final int maxBound = 100;

        String exercise = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        var questions = new String[Engine.getIterationsCount()];
        var trueAnswers = new String[Engine.getIterationsCount()];

        for (int i = 0; i < Engine.getIterationsCount(); i++) {
            randInt = rand.nextInt(maxBound);
            questions[i] = String.valueOf(randInt);
            trueAnswers[i] = randInt % 2 == 0 ? "yes" : "no";
        }
        Engine.game(exercise, questions, trueAnswers);
    }
}
