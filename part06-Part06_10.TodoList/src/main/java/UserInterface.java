
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
    private TodoList todoList;
    private Scanner  scanner;
    
    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner  = scanner;
    }
    
    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            
            if (command.equals("stop")) {
                break;
                
            } else if (command.equals("add")) {
                System.out.print("To add: ");
                String add = scanner.nextLine();
                todoList.add(add);
                
            } else if (command.equals("list")) {
                todoList.print();
                
            } else if (command.equals("remove")) {
                System.out.print("Which one is removed? ");
                int removee = Integer.parseInt(scanner.nextLine());
                todoList.remove(removee);
            }
        }
    }
}
