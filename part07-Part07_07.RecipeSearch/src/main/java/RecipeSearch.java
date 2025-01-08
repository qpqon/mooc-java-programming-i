
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner   = new Scanner(System.in);
        CookBook cookbook = new CookBook();
        UserInterface ui  = new UserInterface(scanner, cookbook);
    
        System.out.print("File to read: ");
        String fileName = scanner.nextLine();
        ui.extractRecipesFrom(fileName);
        
        ui.start();
    }    
}
