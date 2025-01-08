/**
 * This code is free to use, modify, and distribute under the MIT License.
 * See LICENSE file for details.
 * 
 * Course: https://java-programming.mooc.fi/
 *
 * @author Daniel Menke
 */
public class Cube {
    private int edgeLength;
    
    public Cube(int edgeLength) {
        this.edgeLength = edgeLength;
    }
    
    public int volume() {
        int volume = this.edgeLength * this.edgeLength * this.edgeLength;
        return volume;
    }
    
    public String toString() {
        return "The length of the edge is " 
                + this.edgeLength 
                + " and the volume "
                + this.volume();
    }
}
