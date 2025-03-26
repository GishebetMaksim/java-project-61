package hexlet.code;

import  java.util.Scanner;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

public class App {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");

        System.out.print("Your choice: ");

        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            System.out.println();

//            if (number == 0) {
//                scanner.close();
            /*} else*/ if (number == 1) {
                System.out.println("Welcome to the Brain Games!");
                Cli.greeting();
            } else if (number == 2) {
                System.out.println("Welcome to the Brain Games!");
                Cli.greeting();
                Even.gameEven();
            } else if (number == 3) {
                System.out.println("Welcome to the Brain Games!");
                Cli.greeting();
                Calc.gameCalc();
            } else if (number == 4) {
                System.out.println("Welcome to the Brain Games!");
                Cli.greeting();
                GCD.getGCD();
            } else if (number == 5) {
                System.out.println("Welcome to the Brain Games!");
                Cli.greeting();
                Progression.getProgression();
            } else if (number == 6) {
                System.out.println("Welcome to the Brain Games!");
                Cli.greeting();
                Prime.simpleNumber();
            }
        }
    }
}
