package hexlet.code;

public class Cli {
    public  static  String name = "Bill";
    public static void greeting() {
        System.out.print("May I have your name? ");
        name = App.getScanner().next();
        System.out.println("Hello, " + name + "!");
    }
}
