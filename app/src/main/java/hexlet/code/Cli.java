package hexlet.code;

public class Cli {
    public  static  String name = "Bill";
    public static void greeting() {
        System.out.print("May I have your name? ");
        //Scanner scanner = new Scanner(System.in);
        name = App.scanner.next();
        System.out.println("Hello, " + name + "!");

        //scanner.close();
    }
}
