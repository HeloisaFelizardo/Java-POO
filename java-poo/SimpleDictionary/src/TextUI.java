
import java.util.Scanner;

public class TextUI {

    final private Scanner scanner;
    final private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {
        OUTER:
        while (true) {
            System.out.println("Command:");
            String command = scanner.nextLine();
            switch (command) {
                case "end":
                    System.out.println("Bye bye!");
                    break OUTER;
                case "add": {
                    System.out.println("Word:");
                    String word = scanner.nextLine();
                    System.out.println("Translation: ");
                    String translate = scanner.nextLine();
                    dictionary.add(word, translate);
                    break;
                }
                case "search": {
                    System.out.println("To be translated: ");
                    String word = scanner.nextLine();
                    if (dictionary.contains(word)) {
                        System.out.println("Translation: " + dictionary.translate(word));
                    } else {
                        System.out.println("Word " + word + " was not found");
                    }
                    break;
                }
                default:
                    System.out.println("Unknown command");
                    break;
            }
        }
    }
}
