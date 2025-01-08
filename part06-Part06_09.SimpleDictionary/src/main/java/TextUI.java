
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
public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dic;
    
    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dic = dictionary;
    }
    
    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = this.scanner.nextLine();
            
            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
                
            } else if (command.equals("add")) {
                System.out.print("Word: ");
                String word = this.scanner.nextLine();
                
                System.out.print("Translation: ");
                String translation = this.scanner.nextLine();
                
                this.dic.add(word, translation);
                
            } else if (command.equals("search")) {
                System.out.print("To be translated: ");
                String word = this.scanner.nextLine();
                
                String translation = this.dic.translate(word);
                
                if (translation == null) {
                    System.out.println("Word " + word + " was not found");
                    
                } else {
                    System.out.println("Translation: " + translation);
                }
                
            } else {
                System.out.println("Unknown command");

            }
        }
    }
}
