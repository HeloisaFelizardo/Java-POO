
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        SimpleDictionary book = new SimpleDictionary();
        book.add("one", "yksi");
        book.add("two", "kaksi");

        System.out.println(book.translate("one"));
        System.out.println(book.translate("two"));
        System.out.println(book.translate("three")); */

        /*Part 2: 
        Scanner scanner = new Scanner(System.in);
        SimpleDictionary dictionary = new SimpleDictionary();

        TextUI ui = new TextUI(scanner, dictionary);
        ui.start();
         */
        
        Scanner scanner = new Scanner(System.in);
        SimpleDictionary dictionary = new SimpleDictionary();

        TextUI textUI = new TextUI(scanner, dictionary);
        textUI.start();        
    }
}
