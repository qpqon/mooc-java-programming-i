/**
 * This code is free to use, modify, and distribute under the MIT License.
 * See LICENSE file for details.
 * 
 * Course: https://java-programming.mooc.fi/
 *
 * @author Daniel Menke
 */
public class Multiplier {
    private int number;
            
    public Multiplier(int number) {
        this.number = number;
    }
    
    public int multiply(int number) {
        return this.number * number;
    }
}
