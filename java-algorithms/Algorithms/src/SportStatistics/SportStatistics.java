package SportStatistics;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File: ");
        String file = scanner.nextLine();

        System.out.println("Team: ");
        String input = scanner.nextLine();

        SportsAnalyzer sportsAnalyzer = new SportsAnalyzer();
        sportsAnalyzer.analyze(file, input);
        
        scanner.close();
    }
}