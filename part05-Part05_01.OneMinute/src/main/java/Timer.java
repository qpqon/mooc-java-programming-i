/**
 * This code is free to use, modify, and distribute under the MIT License.
 * See LICENSE file for details.
 * 
 * Course: https://java-programming.mooc.fi/
 *
 * @author Daniel Menke
 */
public class Timer {
    private ClockHand hundredths;
    private ClockHand seconds;
    
    public Timer() {
        this.hundredths = new ClockHand(100);
        this.seconds    = new ClockHand(60);
    }
    
    public void advance() {
        this.hundredths.advance();
        
        if (this.hundredths.value() == 0) {
            this.seconds.advance();
        }
    }
    
    public String toString() {
        return this.seconds + ":" + this.hundredths;
    }
}
