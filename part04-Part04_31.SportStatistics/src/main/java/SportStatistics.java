
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
        
        try(Scanner fileObject = new Scanner(Paths.get(dataFile))){
            while(fileObject.hasNextLine()){
                String row = fileObject.nextLine();
                String[] splittedData = row.split(",");
                if(splittedData[0].equals(team) || splittedData[1].equals(team)){
                    gamesParticipated++;
                    
                    int teamScore = 0;
                    int oppScore = 0;
                    
                    if(splittedData[0].equals(team)){
                        // Team plays Home
                        teamScore = Integer.valueOf(splittedData[2]);
                        oppScore = Integer.valueOf(splittedData[3]);
                        
                        
                    }
                    
                    if(splittedData[1].equals(team)){
                        teamScore = Integer.valueOf(splittedData[3]);
                        oppScore = Integer.valueOf(splittedData[2]);
                    }
                    
                    if(teamScore > oppScore){
                            gamesWon++;
                        } else {
                            gamesLost++;
                        }
                } 
            }
            
            System.out.println("Games: " + gamesParticipated);
            System.out.println("Wins: " + gamesWon);
            System.out.println("Losses: " + gamesLost);
        } catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }

    }

}
