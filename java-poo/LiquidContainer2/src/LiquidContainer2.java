
import java.util.Scanner;

public class LiquidContainer2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container firstContainer = new Container();
        Container secondContainer = new Container();

        while (true) {
            System.out.println("First: " + firstContainer.contains() + "/100");
            System.out.println("Second: " + secondContainer.contains() + "/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            switch (command) {
                case "add":
                    firstContainer.add(amount);
                    break;
                case "move":                    
                    if (firstContainer.contains() >= amount) {
                        firstContainer.remove(amount);
                        secondContainer.add(amount);
                    } else {
                        secondContainer.add(firstContainer.contains());
                        firstContainer.remove(firstContainer.contains());
                    }
                    break;
                case "remove":
                    secondContainer.remove(amount);
                    break;
                default:
                    break;
            }
        }
        scan.close();
    }
}
