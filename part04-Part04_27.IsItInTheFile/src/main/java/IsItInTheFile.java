
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        
        Boolean nameFound = false;
        
        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
            
            while (fileScanner.hasNextLine()) {
                String name = fileScanner.nextLine();
                
                if (name.equals(searchedFor)) {
                    nameFound = true;
                }
            }
        } catch (Exception e) {
            System.out.println("Reading the file nonexistent.txt failed." + e.getMessage());
        }
        
        if (nameFound) {
            System.out.println("Found!");
        } else {
            System.out.println("Not found.");
        }
    }
}
