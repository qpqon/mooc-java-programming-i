
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        
        try (Scanner readFile = new Scanner(Paths.get(file))) {
            
            while (readFile.hasNextLine()) {
                
                String fileContent = readFile.nextLine();
                
                String[] fileParts = fileContent.split(",");
                String   name      = fileParts[0];
                int      age       = Integer.parseInt(fileParts[1]);
                
                System.out.println(name + ", age: " + age + " years");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
