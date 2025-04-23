package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Progression {
    public  static  void getProgression() {
        Random rnd = new Random();
        final int minBoundOf1stNumber = 50;
        final int minStep = 1; // Включительно
        final int maxStep = 11; // Не включительно
        final int minStepCount = 5; // Включительно
        final int maxStepCount = 11; // Не включительно

        String exercise = "What number is missing in the progression?";
        var questions = new String[Engine.getIterationsCount()];
        var trueAnswers = new String[Engine.getIterationsCount()];

        for (int j = 0; j < Engine.getIterationsCount(); j++) {
            int firstNumber = rnd.nextInt(minBoundOf1stNumber);
            int trueAnswer = 0;
            int step = rnd.nextInt(maxStep - minStep) + minStep;
            int stepCount = rnd.nextInt(maxStepCount - minStepCount) + minStepCount;
            int missNumber = rnd.nextInt(stepCount);
            StringBuilder question = new StringBuilder();
            for (int i = 0; i < stepCount; i++) {
                if (i == missNumber) {
                    question.append(".. ");
                    trueAnswer = firstNumber;
                    firstNumber += step;
                    continue;
                }
                question.append(firstNumber).append(" ");
                firstNumber += step;
            }
            questions[j] = question.toString();
            trueAnswers[j] = String.valueOf(trueAnswer);
        }
        Engine.game(exercise, questions, trueAnswers);
    }
}
