/**
 * This code is free to use, modify, and distribute under the MIT License.
 * See LICENSE file for details.
 * 
 * Course: https://java-programming.mooc.fi/
 *
 * @author Daniel Menke
 */
public class Fitbyte {
    private int age;
    private int restingHeartRate;
    
    public Fitbyte(int age, int restingHeartRate) {
        this.age              = age;
        this.restingHeartRate = restingHeartRate;
    }
    
    // (maximum heart rate - resting heart rate) * (target heart rate percentage) + resting heart rate
    public double targetHeartRate(double percentageOfMaximum) {
        double maximumHeartRate = 206.3 - (0.711 * this.age);
        double targetHeartRate  = (maximumHeartRate - this.restingHeartRate) * percentageOfMaximum + this.restingHeartRate;
        
        return targetHeartRate;                         
    }
}
