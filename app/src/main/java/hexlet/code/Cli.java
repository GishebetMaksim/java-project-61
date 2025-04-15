package hexlet.code;

public class Cli {
    private  static  String name = "Bill";
    public static void greeting() {
        System.out.print("May I have your name? ");
        name = App.getScanner().next();
        System.out.println("Hello, " + name + "!");
    }

    public  static String getName() {
        return name;
    }
}
