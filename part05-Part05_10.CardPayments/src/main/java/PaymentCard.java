public class PaymentCard {
	 
    private double balance;
 
    public PaymentCard(double balance) {
        this.balance = balance;
    }
 
    public double balance() {
        return this.balance;
    }
 
    public void addMoney(double increase) {
        this.balance+= increase;
    }
 
    public boolean takeMoney(double amount) {
        double newBalance = this.balance - amount;
        
        if (newBalance >= 0) {
            this.balance = newBalance;
            return true;
        }
        
        return false;
    }
}