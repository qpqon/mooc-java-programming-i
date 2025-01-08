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
    private Scanner scanner;
    private AvesCompendium compendium;
    
    public UserInterface(Scanner scanner) {
        this.scanner    = scanner;
        this.compendium = new AvesCompendium();
    }
    
    public void start() {
        
        while (true) {
            System.out.print("? ");
            String command = scanner.nextLine();
            if (command.equals("Quit")) {
                break;
            }
            
            switch (command) {
                case "Add":
                    System.out.print("Name: ");
                    String engName = scanner.nextLine();
                    System.out.print("Name in Latin: ");
                    String latName = scanner.nextLine();
                    
                    this.compendium.addBird(new Bird(engName, latName));
                    break;
                    
                case "Observation":
                    System.out.print("Bird? ");
                    String animal = scanner.nextLine();
                    
                    this.compendium.observed(animal);
                    break;
                    
                case "All":
                    this.compendium.printBirds();
                    break;
                    
                case "One":
                    System.out.println("Bird? ");
                    String name = scanner.nextLine();
                    
                    this.compendium.printBird(name);
            }
        }
    }
}