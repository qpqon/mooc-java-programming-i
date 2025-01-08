/**
 * This code is free to use, modify, and distribute under the MIT License.
 * See LICENSE file for details.
 * 
 * Course: https://java-programming.mooc.fi/
 *
 * @author Daniel Menke
 * 
 */
public class Bird {
    private String engName;
    private String latName;
    private int observations;
    
    public Bird(String engName, String latName) {
        this.engName = engName;
        this.latName = latName;
        this.observations = 0;
    }
    
    public String getName() {
        return this.engName;
    }
    
    public void addObservation() {
        this.observations++;
    }
    
    @Override
    public String toString() {
        return this.engName + " (" + this.latName + "): " + this.observations + " observations";
    }
}