package hexlet.code;

import java.util.Random;

public class Utils {
    private static final Random RAND = new Random();
    public static int randomNumberInRange(int min, int max) {
        return RAND.nextInt(max - min) + min;
    }
}
