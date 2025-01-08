
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
    private Calculator calculator;
    
    public UserInterface(Scanner scanner, Calculator calculator) {
        this.scanner    = scanner;
        this.calculator = calculator;
    }
    
    public void start() {
        System.out.println("Enter point totals, -1 stops:");
        
        while (true) {
            int points = Integer.parseInt(scanner.nextLine());
            if (points == -1) {
                break;
            } else if (points > 100 || points < 0) {
                continue;
            } 
            
            calculator.add(points);
        }
    }
}
