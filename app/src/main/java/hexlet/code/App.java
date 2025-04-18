package hexlet.code;

import  java.util.Scanner;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

public class App {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static Scanner getScanner() {
        return SCANNER;
    }

    public static void main(String[] args) {

        final int greet = 1;
        final int even = 2;
        final int calc = 3;
        final int gCD = 4;
        final int progression = 5;
        final int prime = 6;

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");

        System.out.print("Your choice: ");

        if (SCANNER.hasNextInt()) {
            int number = SCANNER.nextInt();
            System.out.println();

            if (number == greet) {
                System.out.println("Welcome to the Brain Games!");
                Cli.greeting();
            } else if (number == even) {
                System.out.println("Welcome to the Brain Games!");
                Cli.greeting();
                Even.gameEven();
            } else if (number == calc) {
                System.out.println("Welcome to the Brain Games!");
                Cli.greeting();
                Calc.gameCalc();
            } else if (number == gCD) {
                System.out.println("Welcome to the Brain Games!");
                Cli.greeting();
                GCD.getGCD();
            } else if (number == progression) {
                System.out.println("Welcome to the Brain Games!");
                Cli.greeting();
                Progression.getProgression();
            } else if (number == prime) {
                System.out.println("Welcome to the Brain Games!");
                Cli.greeting();
                Prime.simpleNumber();
            }
        }
    }
}
