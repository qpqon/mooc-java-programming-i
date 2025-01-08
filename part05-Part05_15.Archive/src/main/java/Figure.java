/**
 * This code is free to use, modify, and distribute under the MIT License.
 * See LICENSE file for details.
 * 
 * Course: https://java-programming.mooc.fi/
 *
 * @author Daniel Menke
 */
public class Figure {
    private String identifier;
    private String figureName;
    
    public Figure (String figureID, String figureName) {
        this.identifier = figureID;
        this.figureName = figureName;
    }
    
    @Override
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        
        if (!(compared instanceof Figure)) {
            return false;
        }
        
        Figure comparedFigure = (Figure) compared;
        
        if (this.identifier.equals(comparedFigure.identifier)) {
            return true;
        }
        return false;
    }
    
    @Override
    public String toString(){
        return this.identifier + ": " + this.figureName;
    }
}
