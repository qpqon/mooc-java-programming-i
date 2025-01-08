
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * This code is free to use, modify, and distribute under the MIT License.
 * See LICENSE file for details.
 * 
 * Course: https://java-programming.mooc.fi/
 *
 * @author Daniel Menke
 * 
 */
public class UserInterface {
    Scanner scanner;
    CookBook cookbook;
    
    public UserInterface(Scanner scanner, CookBook cookbook) {
        this.scanner    = scanner;
        this.cookbook   = cookbook;
    }
    
    public void start() {
        System.out.println();
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");   
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        
        while (true) {
            System.out.println();
            System.out.print("Enter command: ");
            
            String command = scanner.nextLine();
            if (command.equals("stop")) {
                break;
            }           
            this.executeCommand(command);
        }
    }
    
    public void extractRecipesFrom(String fileName) {
        
        try (Scanner fileReader = new Scanner(Paths.get(fileName))) {
            
            while (fileReader.hasNextLine()) {
                String recipeName  = fileReader.nextLine();
                int    cookingTime = Integer.parseInt(fileReader.nextLine());
                ArrayList<String> ingredients = new ArrayList<>();
                
                while (fileReader.hasNextLine()) {
                    String ingredient = fileReader.nextLine();
                    if (ingredient.isEmpty()) {
                        break;
                    }
                    ingredients.add(ingredient);
                }
                
                Recipe recipe = new Recipe(recipeName, cookingTime, ingredients);
                cookbook.addRecipe(recipe);
            }
        } catch (Exception e) {
            System.out.println("Oh-oh, cannot read file");
        }
    }
    
    public void executeCommand(String command) {
        
        if (command.equals("list")) {
            System.out.println();
            System.out.println("Recipes:");
            cookbook.printBook();
            
        } else if (command.equals("find name")) {
            System.out.print("Searched word: ");
            String word = scanner.nextLine();
            
            System.out.println();
            System.out.println("Recipes:");
            cookbook.searchName(word);
            
        } else if (command.equals("find cooking time")) {
            System.out.print("Max cooking time: ");
            int time = Integer.parseInt(scanner.nextLine());
            
            System.out.println();
            System.out.println("Recipes:");
            cookbook.maxTime(time);
            
        } else if (command.equals("find ingredient")) {
            System.out.print("Ingredient: ");
            String ingredient = scanner.nextLine();
            
            System.out.println();
            System.out.println("Recipes:");
            cookbook.searchIngredient(ingredient);
        }
        
    } 
}
