
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
public class Recipe {
    private String name;
    private int cookingTime;
    ArrayList<String> ingredients;
    
    public Recipe(String name, int cookingTime, ArrayList<String> ingredients) {
        this.name = name;
        this.cookingTime = cookingTime;
        this.ingredients = ingredients;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getCookingTime() {
        return this.cookingTime;
    }
    
    public boolean hasIngredient(String searchedIngredient) {
        for (String ingredient: ingredients) {
            if (ingredient.equals(searchedIngredient)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public String toString() {
        return this.name + ", cooking time: " + this.cookingTime;
    }
}
