
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
public class CookBook {
    private ArrayList<Recipe> recipes;
    
    public CookBook() {
        this.recipes = new ArrayList<>();
    }
    
    public void addRecipe(Recipe recipe) {
        this.recipes.add(recipe);
    }
    
    public void searchName(String word) {
        for (Recipe recipe: recipes) {
            if (recipe.getName().contains(word)) {
                System.out.println(recipe);
            }
        }
    }
    
    public void maxTime(int maxTime) {
        for (Recipe recipe: recipes) {
            if (recipe.getCookingTime() <= maxTime) {
                System.out.println(recipe);
            }
        }
    }
    
    public void searchIngredient(String ingredient) {
        for (Recipe recipe: recipes) {
            if (recipe.hasIngredient(ingredient)) {
                System.out.println(recipe);
            }
        }
    }
    
    public void printBook() {
        for (Recipe recipe: recipes) {
            System.out.println(recipe);
        }
    }
}
