package hexlet.code;

import  java.util.Scanner;

public class Cli {
    public static void greeting() {
        System.out.println("May I have your name?");

        Scanner scaner = new Scanner(System.in);

        if (scaner.hasNextLine()) {
            String name = scaner.nextLine();
            System.out.println("Hello, " + name);
        } else {
            System.out.println("It can't be a name.");
        }

        scaner.close();
    }
}
