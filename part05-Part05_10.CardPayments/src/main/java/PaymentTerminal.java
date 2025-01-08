public class PaymentTerminal {
	 
	 
    private double money;           // amount of cash
    private int    affordableMeals; // number of sold affordable meals
    private int    heartyMeals;     // number of sold hearty meals
 
 
    public PaymentTerminal() {
        this.money           = 1000; // register initially has 1000 euros of money
        this.affordableMeals = 0;
        this.heartyMeals     = 0;
    }
 
    public double eatAffordably(double payment) {
        double mealCost = 2.5;
        double change   = payment - mealCost;
        
        if (change < 0) {
            return payment;
        }
        
        this.affordableMeals++;
        this.money+= mealCost;
        return change;
    }
    
    public boolean eatAffordably(PaymentCard card) {
        double mealCost = 2.5;
        
        if (card.takeMoney(mealCost)) {
            this.affordableMeals++;
            return true;
        }
        
        return false;
    }
 
    public double eatHeartily(double payment) {
        double mealCost = 4.3;
        double change   = payment - mealCost;
        
        if (change < 0) {
            return payment;
        }
        
        this.heartyMeals++;
        this.money+= mealCost;
        return change;
    }
    
    public boolean eatHeartily(PaymentCard card) {
        double mealCost = 4.3;
        
        if (card.takeMoney(mealCost)) {
            this.heartyMeals++;
            return true;
        }
        
        return false;
    }
    
    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum >= 0) {
            card.addMoney(sum);
            this.money+= sum;
        }
    }
 
    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}