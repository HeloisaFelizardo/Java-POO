/*Write a program that reads names and birth years from the user until an empty line is entered. 
 * The name and birth year are separated by a comma.
 * After that the program prints the longest name and the average of the birth years. 
 * If multiple names are equally longest, you can print any of them. You can assume that 
 * the user enters at least one person.
 * 
 * Sample output
 * sebastian,2017
 * lucas,2017
 * lily,2017
 * hanna,2014
 * gabriel,2009
 * 
 * Longest name: sebastian
 * Average of the birth years: 2014.8
 */

import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;       
        String longestName = "";
        
        while(true){
            String input = scanner.nextLine();
            
            if(input.equals("")){
                break;
            }
            
            String[] parts = input.split(",");
            int age = Integer.valueOf(parts[1]);
            sum = sum + age;
            count++;
            
            String name = parts[0];            

            if (name.length() > longestName.length()){
                longestName = name;                
            }
        }
        
        double average = (double) sum / count;
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + average );
        
        scanner.close();
    }
}
