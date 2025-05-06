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

        final int exit = 0;
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

            switch (number) {
                case greet:
                    String name;
                    System.out.println("Welcome to the Brain Games!");
                    System.out.print("May I have your name? ");
                    name = App.getScanner().next();
                    System.out.println("Hello, " + name + "!");
                    break;
                case even:
                    Even.gameEven();
                    break;
                case calc:
                    Calc.gameCalc();
                    break;
                case gCD:
                    GCD.getGCD();
                    break;
                case progression:
                    Progression.getProgression();
                    break;
                case prime:
                    Prime.simpleNumber();
                    break;
                case exit:
                    break;
                default:
                    System.out.println("Incorrect number selected");
                    break;
            }
        }
    }
}
