
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
        int numberWithinBounds = 0;
        
        try (Scanner readFile = new Scanner(Paths.get(file))) {
            
            while (readFile.hasNextLine()) {
                
                int numInFile = Integer.valueOf(readFile.nextLine());
                
                if (numInFile >= lowerBound && numInFile <= upperBound) {
                    numberWithinBounds++;
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println("Numbers: " + numberWithinBounds);
    }

}
