package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    private static final String EXERCISE = "What number is missing in the progression?";
    private static final int MIN_BOUND_OF_1ST_NUMBER = 50;
    private static final int MIN_STEP = 1; // Включительно
    private static final int MAX_STEP = 11; // Не включительно
    private static final int MIN_STEP_COUNT = 5; // Включительно
    private static final int MAX_STEP_COUNT = 11; // Не включительно

    public  static  void getProgression() {
        String[][] questionAnswer = new String[Engine.getIterationsCount()][2];

        for (int j = 0; j < Engine.getIterationsCount(); j++) {
            int firstNumber = Utils.randomNumberInRange(0, MIN_BOUND_OF_1ST_NUMBER);
            int trueAnswer = 0;
            int step = Utils.randomNumberInRange(MIN_STEP, MAX_STEP);
            int stepCount = Utils.randomNumberInRange(MIN_STEP_COUNT, MAX_STEP_COUNT);
            int missNumber = Utils.randomNumberInRange(0, stepCount);
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
            questionAnswer[j][0] = question.toString();
            questionAnswer[j][1] = String.valueOf(trueAnswer);
        }
        Engine.game(EXERCISE, questionAnswer);
    }
}
