/**
 * This code is free to use, modify, and distribute under the MIT License.
 * See LICENSE file for details.
 * 
 * Course: https://java-programming.mooc.fi/
 *
 * @author Daniel Menke
 * 
 */
public class Exercise {
    private String name;
    private boolean completed;
    
    public Exercise(String name) {
        this.name = name;
        this.completed = false;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
    
    public boolean isCompleted() {
        return completed;
    }
}
