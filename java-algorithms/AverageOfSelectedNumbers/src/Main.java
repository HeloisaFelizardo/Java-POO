import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);      

        System.out.println("Input numbers, type \"end\" to stop.");
        ArrayList<Integer> input = new ArrayList<>();

        while (true) {
            String read = scanner.nextLine();

            if (read.equals("end")) {
                break;
            }

            try {
                input.add(Integer.valueOf(read));
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }

        System.out.println("");

        String choice;
        while (true) {
            System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
            choice = scanner.nextLine();
            if (choice.equals("n") || choice.equals("p")) {
                break;
            } else {
                System.out.println("Invalid choice. Please enter 'n' for negative numbers or 'p' for positive numbers.");
            }
        }

        if (choice.equals("n")) {
            double averageNegative = input.stream().filter(l -> l < 0).mapToInt(i -> i).average().orElse(0.0);
            System.out.println("Average of the negative numbers: " + averageNegative);
        } else {
            double averagePositive = input.stream().filter(l -> l > 0).mapToInt(i -> i).average().orElse(0.0);
            System.out.println("Average of the positive numbers: " + averagePositive);
        }

        scanner.close();
    }
}
