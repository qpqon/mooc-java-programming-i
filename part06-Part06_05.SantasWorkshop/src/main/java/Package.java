import java.util.ArrayList;
	 
/**
 * This code is free to use, modify, and distribute under the MIT License.
 * See LICENSE file for details.
 * 
 * Course: https://java-programming.mooc.fi/
 *
 * @author Daniel Menke
 */
public class Package {
    private ArrayList<Gift> gifts;
    
    public Package() {
        this.gifts       = new ArrayList<>();
    }
    
    public void addGift(Gift gift) {
        gifts.add(gift);
    }
    
    public int totalWeight() {
        int totalWeight = 0;
        for (Gift gift: gifts) {
            totalWeight += gift.getWeight();
        }
        return totalWeight;
    }
}