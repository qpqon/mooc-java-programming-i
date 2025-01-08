
import java.util.ArrayList;

/**
 * This code is free to use, modify, and distribute under the MIT License.
 * See LICENSE file for details.
 * 
 * Course: https://java-programming.mooc.fi/
 *
 * @author Daniel Menke
 * 
 */
public class TodoList {
    private ArrayList<String> todoList;
    
    public TodoList(){
        todoList = new ArrayList<>();
    }
    
    public void add(String task) {
        todoList.add(task);
    }
    
    public void print() {
        for (int i = 0; i < this.todoList.size(); i++) {
            System.out.println((i + 1) + ": " + this.todoList.get(i));
        }
    }
    
    public void remove(int number) {
        if (!(this.todoList.isEmpty()))
        this.todoList.remove(number - 1);
    }
}
