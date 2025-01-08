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
public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;
    
    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase) {
        int sumWeight = suitcase.totalWeight();
        
        for (Suitcase element: suitcases) {
            sumWeight += element.totalWeight();
        }
        
        if (sumWeight <= this.maxWeight) {
            this.suitcases.add(suitcase);
        }
    }
    
    @Override
    public String toString() {
        if (this.suitcases.isEmpty()) {
            return "no suitcases (0 kg)";
        }
        
        int suitcaseSum = 0;
        int totalWeight = 0;
        for (Suitcase suitcase: suitcases) {
            suitcaseSum++;
            totalWeight += suitcase.totalWeight();
        }
        
        if (this.suitcases.size() == 1) {
            return suitcaseSum + " suitcase " + "(" + totalWeight + " kg)";
        }
    
        return  suitcaseSum + " suitcases " + "(" + totalWeight + " kg)";
    }
    
    public void printItems() {
        for (Suitcase suitcase: suitcases) {
            suitcase.printItems();
        }
    }
}