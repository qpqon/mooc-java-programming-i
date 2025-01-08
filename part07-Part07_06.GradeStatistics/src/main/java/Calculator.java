
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
public class Calculator {
    private ArrayList<Integer> totalPoints;
    
    public Calculator() {
        this.totalPoints = new ArrayList<>();
    }
    
    public void add(int points) {
        this.totalPoints.add(points);
    }
    
    public String averageAll() {
        int sum = 0;
        for (int points: this.totalPoints) {
            sum += points;
        }
        double avg = 1.0 * sum / totalPoints.size();
        
        return "Point average (all): " + avg;
    }
    
    public String averagePassing() {
        int sum   = 0;
        int count = 0;
        for (int points: this.totalPoints) {
            if (points >= 50) {
                sum += points;
                count++;
            }
        }
        double avg = 1.0 * sum / count;
        
        if (avg == 0) {
            return "Point average (passing): -";
        }
        return "Point average (passing): " + avg;
    }
    
    public String percentPassing() {
        int count = 0;
        for (int points: this.totalPoints) {
            if (points >= 50) {
                count++;
            }
        }
        double percent = 100.0 * count / totalPoints.size();
        
        return "Pass percentage: " + percent;
    }
    
    public void printGrades() {
        int grade0 = 0;
        int grade1 = 0;
        int grade2 = 0;
        int grade3 = 0;
        int grade4 = 0;
        int grade5 = 0;
        
        for (int points: this.totalPoints) {
            if (points < 50) {
                grade0++;
            } else if (points < 60) {
                grade1++;
            } else if (points < 70) {
                grade2++;
            } else if (points < 80) {
                grade3++;
            } else if (points < 90) {
                grade4++;    
            } else {
                grade5++;
            }
        }
        
        System.out.println("Grade distribution:");
        System.out.println("5: " + this.inStars(grade5));
        System.out.println("4: " + this.inStars(grade4));
        System.out.println("3: " + this.inStars(grade3));
        System.out.println("2: " + this.inStars(grade2));
        System.out.println("1: " + this.inStars(grade1));
        System.out.println("0: " + this.inStars(grade0));
    }
    
    public String inStars(int grade) {
        String stars = "";
        for (int i = 0; i < grade; i++) {
            stars += "*";
        }
        return stars;
    }
}
