
import java.util.Scanner;

public class UserInterface {

    private final JokeManager jokeManager;
    private final Scanner scanner;

    public UserInterface(JokeManager jokeManager, Scanner scanner) {
        this.jokeManager = jokeManager;
        this.scanner = scanner;
    }

    public void start() {
        readOptions();
    }

    public void readOptions() {
        while (true) {
            System.out.println("Commands:");
            System.out.println(" 1 - add a joke");
            System.out.println(" 2 - draw a joke");
            System.out.println(" 3 - list jokes");
            System.out.println(" X - stop");

            String command = scanner.nextLine();

            if (command.equals("X")) {
                break;
            }

            switch (command) {
                case "1":
                    System.out.println("Write the joke to be added:");
                    String joke = scanner.nextLine();
                    jokeManager.addJoke(joke);
                    break;
                case "2":
                    System.out.println("Drawing a joke.");                   
                    System.out.println(jokeManager.drawJoke());                                       
                    break;
                case "3":
                    System.out.println("Printing the jokes.");
                    jokeManager.printJokes();
                    break;
                default:
                    break;
            }
        }
    }
}
