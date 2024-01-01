import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File? ");
        String file = scanner.nextLine();
        
        ArrayList<Integer> list = new ArrayList<>();
        try(Scanner listScanner = new Scanner(Paths.get(file))){
            while(listScanner.hasNextLine()){
                list.add(Integer.valueOf(listScanner.nextLine()));
            }
        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.println("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
        int count = 0;
        for(int i = lowerBound; i <= upperBound; i++){
            if(list.contains(i)){
                count++;
            }
        }
        System.out.println("Numbers: " + count);
        scanner.close();
    }

}
