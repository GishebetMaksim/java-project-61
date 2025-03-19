package hexlet.code;

import  java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Your choice: ");

        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            System.out.println();

            if (number == 0) {
                scanner.close();
            } else if (number == 1) {
                System.out.println("Welcome to the Brain Games!");
                Cli.greeting();
            } else if (number == 2) {
                Cli.greeting();
                Even.gameEven();
            }
        }
    }
}
