
public class HealthStation {
    private int weighings;
 
    public HealthStation() {
        this.weighings = 0;
    }    
    
    public int weigh(Person person) {
        int weight = person.getWeight();
        this.weighings++;
        return weight;
    }
    
    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }
    
    public int weighings() {
        return this.weighings;
    }
 
}