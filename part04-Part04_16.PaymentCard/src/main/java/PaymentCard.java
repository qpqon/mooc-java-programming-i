/**
 * This code is free to use, modify, and distribute under the MIT License.
 * See LICENSE file for details.
 * 
 * Course: https://java-programming.mooc.fi/
 *
 * @author Daniel Menke
 */
public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }
    
    public void eatAffordably() {
        double affordableMeal = 2.60;
        
        if ((this.balance - affordableMeal) >= 0) {
            this.balance -= affordableMeal;
        }
    }

    public void eatHeartily() {
        double heartyMeal = 4.60;
        
        if ((this.balance - heartyMeal) >= 0) {
            this.balance -= heartyMeal;
        }
    }
    
    public void addMoney(double amount) {
        double cardLimit = 150.0;
        
        if (amount > 0) {
            this.balance += amount;
            if (this.balance > cardLimit) {
                this.balance = cardLimit;
            }
        }
    }
}
