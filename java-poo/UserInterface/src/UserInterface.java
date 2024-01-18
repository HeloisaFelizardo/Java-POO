import java.util.Scanner;

public class UserInterface {
    private WordSet wordSet;
    private Scanner scanner;

    public UserInterface(WordSet wordSet, Scanner scanner) {
        this.wordSet = wordSet;
        this.scanner = scanner;
    }

    public void start() {

        while (true) {
            System.out.print("Enter a word: ");
            String word = scanner.nextLine();

            if (wordSet.contains(word)) {
                break;
            }

            wordSet.add(word);
        }

        System.out.println("You gave the same word twice!");
        System.out.println(this.wordSet.palindromes() + " of the words were palindromes.");
    }
}