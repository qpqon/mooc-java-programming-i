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
public class AvesCompendium {
    private ArrayList<Bird> birds;
    
    public AvesCompendium() {
        this.birds = new ArrayList<>();
    }
    
    public void addBird(Bird bird) {
        this.birds.add(bird);
    }
    
    public void observed(String animal) {
        for (Bird bird: birds) {
            if (bird.getName().equals(animal)) {
                bird.addObservation();
                return;
            }
        }
        System.out.println("Not a bird!");
    }
    
    public void printBirds() {
         for (Bird bird: birds) {
             System.out.println(bird);
         }
    }
    
    public void printBird(String name) {
        for (Bird bird: birds) {
            if (bird.getName().equals(name)) {
                System.out.println(bird.toString());
            }
        }
    }
}