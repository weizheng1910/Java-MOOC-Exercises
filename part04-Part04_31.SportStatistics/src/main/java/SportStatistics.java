
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File: ");
        String dataFile = scan.nextLine();
        System.out.println("Team: ");
        String team = scan.nextLine();

        int gamesParticipated = 0;
        int gamesWon = 0;
        int gamesLost = 0;

        try ( Scanner fileObject = new Scanner(Paths.get(dataFile))) {
            while (fileObject.hasNextLine()) {
                String row = fileObject.nextLine();
                String[] splittedData = row.split(",");

                String home = splittedData[0];
                String away = splittedData[1];
                String homeScore = splittedData[2];
                String awayScore = splittedData[3];

                if (home.equals(team) || away.equals(team)) {
                    gamesParticipated++;

                    int teamScore = 0;
                    int oppScore = 0;

                    if (home.equals(team)) {
                        // Team plays Home
                        teamScore = Integer.valueOf(homeScore);
                        oppScore = Integer.valueOf(awayScore);

                    }

                    if (away.equals(team)) {
                        // Team plays Away
                        teamScore = Integer.valueOf(awayScore);
                        oppScore = Integer.valueOf(homeScore);
                    }

                    if (teamScore > oppScore) {
                        //Team won
                        gamesWon++;
                    } else {
                        gamesLost++;
                    }
                }
            }

            System.out.println("Games: " + gamesParticipated);
            System.out.println("Wins: " + gamesWon);
            System.out.println("Losses: " + gamesLost);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}
