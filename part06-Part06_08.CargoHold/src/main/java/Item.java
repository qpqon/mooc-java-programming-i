/**
 * This code is free to use, modify, and distribute under the MIT License.
 * See LICENSE file for details.
 * 
 * Course: https://java-programming.mooc.fi/
 *
 * @author Daniel Menke
 * 
 */
public class Item {
    private String name;
    private int    weight;
    
    public Item(String name, int weight) {
        this.name   = name;
        this.weight = weight;
    }
 
    public String getName() {
        return name;
    }
 
    public int getWeight() {
        return weight;
    }
 
    @Override
    public String toString() {
        return this.name + " (" + this.weight + " kg)"; 
    }
    
    
}