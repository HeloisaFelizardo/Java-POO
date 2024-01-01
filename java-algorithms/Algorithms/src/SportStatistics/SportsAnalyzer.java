package SportStatistics;
import java.nio.file.Paths;
import java.util.Scanner;
class SportsAnalyzer {

    private int games;
    private int wins;
    private int losses;

    public SportsAnalyzer() {
        games = 0;
        wins = 0;
        losses = 0;
    }

    public void analyze(String file, String team) {
        try (Scanner listScanner = new Scanner(Paths.get(file))) {
            while (listScanner.hasNextLine()) {
                String line = listScanner.nextLine();
                String[] parts = line.split(",");

                String homeTeam = parts[0];
                String visitTeam = parts[1];
                int homeTeamPoints = Integer.parseInt(parts[2]);
                int visitTeamPoints = Integer.parseInt(parts[3]);

                if (homeTeam.equals(team) || visitTeam.equals(team)) {
                    games++;

                    if ((homeTeam.equals(team) && homeTeamPoints > visitTeamPoints) ||
                        (visitTeam.equals(team) && visitTeamPoints > homeTeamPoints)) {
                        wins++;
                    } else {
                        losses++;
                    }
                }
            }
            printResults();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private void printResults() {
        System.out.println("Games: " + games);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }
}