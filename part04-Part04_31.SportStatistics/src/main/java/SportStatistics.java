
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File:");
        String file = scan.nextLine();
        
        System.out.println("Team:");
        String team = scan.nextLine();
        
        int games = 0;
        int won   = 0;
        int lost  = 0;
        
        try (Scanner readFile = new Scanner(Paths.get(file))) {
            
            while (readFile.hasNextLine()) {
                
                String   fileContent = readFile.nextLine();
                String[] fileParts   = fileContent.split(",");
                String   teamHome    = fileParts[0];
                String   teamVisit   = fileParts[1];
                int      pointsHome  = Integer.parseInt(fileParts[2]);
                int      pointsVisit = Integer.parseInt(fileParts[3]);
                
                if (teamHome.equals(team)) {
                    games++;
                    if (pointsHome > pointsVisit) {
                        won++;
                    } else {
                        lost++;
                    }
                } else if (teamVisit.equals(team)) {
                    games++;
                    if (pointsVisit > pointsHome) {
                        won++;
                    } else {
                        lost++;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
        
        System.out.println("Games: " + games);
        System.out.println("Wins: " + won);
        System.out.println("Losses: " + lost);
    }

}
