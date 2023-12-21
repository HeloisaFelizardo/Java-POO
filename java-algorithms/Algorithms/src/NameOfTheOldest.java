/*Write a program that reads names and ages from the user until an empty line is entered. 
 *The name and age are separed by a comma. 
 *After reading all user input, the program prints the name of the oldest person. 
 *You can assume that the user enters at least one person, and the that one of the users 
 *is older than the others.
 *
 *Sample output
 *sebastian,2
 *lucas,2
 *lily,1
 *hanna,5
 *gabriel,10
 *
 *Name of the oldest: gabriel
*/

import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String oldest = "";
        int biggestAge = 0;
        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            String[] parts = input.split(",");

            String name = parts[0];
            int age = Integer.valueOf(parts[1]);

            if (age > biggestAge) {
                biggestAge = age;
                oldest = name;
            }
        }
        System.out.println("Name of the oldest: " + oldest);
        
        scanner.close();
    }
}
