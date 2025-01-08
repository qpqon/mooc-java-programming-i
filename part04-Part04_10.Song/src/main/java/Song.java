/*
 * MIT License:
 * This code is free to use, modify, and distribute under the MIT License.
 * See LICENSE file for details.
 * 
 * Course: https://java-programming.mooc.fi/
 *
 * @author: Daniel Menke
 */
public class Song {
    private String name;
    private int length;
    
    public Song(String name, int length) {
        this.name = name;
        this.length = length;
    }
    
    public String name() {
        return this.name;
    }
    
    public int length() {
        return this.length;
    }
}
