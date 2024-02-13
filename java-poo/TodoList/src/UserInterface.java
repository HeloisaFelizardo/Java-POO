
import java.util.Scanner;

public class UserInterface {
    final private TodoList todoList;
    final private Scanner scanner;
    
    public UserInterface(TodoList todoList, Scanner scanner){
        this.todoList = todoList;
        this.scanner = scanner;
    }
    
    public void start() {
        OUTER:
        while (true) {
            System.out.println("Command:");
            String command = scanner.nextLine();
            switch (command) {
                case "stop":
                    System.out.println("Bye bye!");
                    break OUTER;
                case "add": {
                    System.out.println("To add: ");
                    String task = scanner.nextLine();                    
                    todoList.add(task);
                    break;
                }
                case "list": {
                	todoList.print();                   
                    break;
                }
                case "remove": {
                    System.out.println("Which one is removed? ");
                    int index = Integer.valueOf(scanner.nextLine());
                    todoList.remove(index);
                    break;
                }
                default:
                    System.out.println("Unknown command");
                    break;
            }
        }
    }
}
