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
public class Suitcase {
    private ArrayList<Item> items;
    private int             maxWeight;
    
    public Suitcase(int maxWeight) {
        this.items     = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    
    public void addItem(Item item) {
        int newWeight = this.totalWeight() + item.getWeight();
        
        if (this.maxWeight >= newWeight) {
            this.items.add(item);
            
        }
    }
    
    @Override
    public String toString() {
        if (this.items.isEmpty()) {
            return "no items (0 kg)";
        }
        
        int itemSum   = 0;
        for (Item item: items) {
            itemSum++;
        }
        
        if (this.items.size() == 1) {
            return itemSum + " item " + "(" + this.totalWeight() + " kg)";
        }
 
        return  itemSum + " items " + "(" + this.totalWeight() + " kg)";
    }   
    
    public void printItems() {
        for (Item item: items) {
            System.out.println(item);
        }
    }
    
    public int totalWeight() {
        int totalWeight = 0;
        
        for (Item item: items) {
            totalWeight += item.getWeight();    
        }
        return totalWeight;
    }
    
    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        
        Item heaviest = this.items.get(0);
        
        for (Item item: items) {
            if (heaviest.getWeight() < item.getWeight()) {
                heaviest = item;
            }
        }
        return heaviest;
    }
}