
import java.util.Arrays;

public class MainProgram {
	 
    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }
    
    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int number: array) {
            if (number < smallest) {
                smallest = number;
            }
        }
        return smallest;
    }
    
    public static int indexOfSmallest(int[] array) {       
        int indexOfSmallest = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[indexOfSmallest]) {
                indexOfSmallest = i;
            }
        }
        return indexOfSmallest;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int indexOfSmallest = startIndex;
        for (int i = startIndex + 1; i < table.length; i++) {
            if (table[i] < table[indexOfSmallest]) {
                indexOfSmallest = i;
            }
        }
        return indexOfSmallest;
    }
 
    public static void swap(int[] array, int index1, int index2) {
        int helper    = array[index1];
        array[index1] = array[index2];
        array[index2] = helper;
    }
    
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
            MainProgram.swap(array, MainProgram.indexOfSmallestFrom(array, i), i);
        }
    }
}