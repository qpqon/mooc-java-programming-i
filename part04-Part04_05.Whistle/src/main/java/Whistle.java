/*
 * MIT License
 * 
 * Author: Daniel Menke
 * 
 * This code is free to use, modify, and distribute under the MIT License.
 * See LICENSE file for details.
 * 
 * Course: https://java-programming.mooc.fi/
 */
public class Whistle {
    private String sound;
    
    public Whistle(String whistleSound) {
        this.sound = whistleSound;
    }
    
    public void sound() {
        System.out.println(this.sound);
    }
            
}
