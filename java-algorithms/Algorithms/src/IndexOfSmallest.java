/*Write a program that reads numbers from the user. 
 * When number 9999 is entered, the reading process stops. 
 * After this the program will print the smallest number 
 * in the list, and also the indices where that number is 
 * found. Notice: the smallest number can appear multiple 
 * times in the list.*/

import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999) {
                break;
            }
            list.add(input);
        }
        System.out.println("");

        int smallest = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            int number = list.get(i);
            if (smallest > number) {
                smallest = number;
            }
        }
        System.out.println("Smallest number: " + smallest);    
               
        for (int i = 0; i < list.size(); i++) {
             if(list.get(i) == smallest){
               System.out.println("Found at index: " + i);
            }            
        }
        scanner.close();
    }
}
