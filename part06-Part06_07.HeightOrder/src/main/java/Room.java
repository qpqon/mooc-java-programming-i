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
public class Room {
    private ArrayList<Person> persons;
    
    public Room() {
        this.persons = new ArrayList<>();
    }
    
    public void add(Person person) {
        this.persons.add(person);
    }
    
    public boolean isEmpty() {
        if (this.persons.isEmpty()) {
            return true;
        }
        return false;
    }
    
    public ArrayList<Person> getPersons() {
        return this.persons;
    }
    
    public Person shortest() {
        if (this.persons.isEmpty()) {
            return null;
        }
        
        Person shortest = this.persons.get(0);
        
        for (Person person: persons) {
            if (shortest.getHeight() > person.getHeight()) {
                shortest = person;
            }
        }
        return shortest;
    }
    
    public Person take() {
        if (this.isEmpty()) {
            return null;
        }
        
        Person shorty = this.shortest();
        
        this.persons.remove(shorty);
        
        return shorty;
    }
}