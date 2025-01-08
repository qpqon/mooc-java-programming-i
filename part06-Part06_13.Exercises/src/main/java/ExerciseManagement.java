
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
public class ExerciseManagement {
    private ArrayList<Exercise> exercises;
    
    public ExerciseManagement() {
        this.exercises = new ArrayList<>();
    }
    
    public ArrayList<String> exerciseList() {
        ArrayList<String> list = new ArrayList<>();
        for (Exercise exercise: exercises) {
            list.add(exercise.getName());
        }
        return list;
    }
    
    public void add(String exercise) {
        this.exercises.add(new Exercise(exercise));
    }
    
    public void markAsCompleted(String xrcise) {
        for (Exercise exercise: exercises) {
            if (exercise.getName().equals(xrcise)) {
                exercise.setCompleted(true);
            }
        }
    }
    
    public boolean isCompleted(String xercise) {
        for (Exercise exercise: exercises) {
            if (exercise.getName().equals(xercise)) {
                return exercise.isCompleted();
            }
        }
        return false;
    }
}
