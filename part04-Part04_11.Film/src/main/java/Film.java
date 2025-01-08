/*
 * MIT License:
 * This code is free to use, modify, and distribute under the MIT License.
 * See LICENSE file for details.
 * 
 * Course: https://java-programming.mooc.fi/
 *
 * @author: Daniel Menke
 */
public class Film {
    private String name;
    private int ageRating;
    
    public Film(String filmName, int filmAgeRating) {
        this.name = filmName;
        this.ageRating = filmAgeRating;
    }
    
    public String name() {
        return this.name;
    }
    
    public int ageRating() {
        return this.ageRating;
    }
}
