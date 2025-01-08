/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author cosi
 */
public class ExerciseManagementTest {
    private ExerciseManagement management;
    
    @Before
    public void initialize() {
        this.management = new ExerciseManagement();
    }
    
    @Test
    public void exerciseListEmptyAtBeginning() {
        assertEquals(0, management.exerciseList().size());
    }
    
    @Test
    public void addingExerciseListGrowingByOne() {
        management.add("This is a test");
        assertEquals(1, management.exerciseList().size());
    }
    
    @Test
    public void addedExerciseIsInList() {
        management.add("This is a test");
        assertTrue(management.exerciseList().contains("This is a test"));
    }
    
    @Test
    public void exerciseCanBeMarkedAsCompleted() {
        management.add("new exercize");
        management.markAsCompleted("new exercize");
        assertTrue(management.isCompleted("new exercize"));
    }
    
    @Test
    public void ifNotMarkedCompletedIsNotCompleted() {
        management.add("new exercize");
        management.markAsCompleted("new exercize");
        assertFalse(management.isCompleted("some exercize"));
    }
}
