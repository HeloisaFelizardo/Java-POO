/*Write a program that reads names and ages from the user until an empty line is entered.
 *The name and age are separated by a comma. 

After reading all user input, the program prints the age of the oldest person. 
You can assume that the user enters at least one person, and that one of the users 
is older than the others.
*/
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int bigger = 0;
        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            String[] parts = input.split(",");

            int age = Integer.valueOf(parts[1]);
            if (age > bigger) {
                bigger = age;
            }
        }
        System.out.println("Age of the oldest: " + bigger);
        
        scanner.close();
    }
}
