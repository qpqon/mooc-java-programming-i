
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition) {
        int euros = this.euros + addition.euros();
        int cents = this.cents + addition.cents();
        
        Money newMoney = new Money(euros, cents);
        return newMoney;
    }
    
    public boolean lessThan(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        }
        
        if (this.euros == compared.euros &&
            this.cents < compared.euros) {
            return true;
        }
        return false;
    }
    
    public Money minus(Money decreaser) {
        int thisCents = this.euros * 100 + this.cents;
        int decreaserCents = decreaser.euros * 100 + decreaser.cents();
        
        int newEuros = 0;
        int newCents = thisCents - decreaserCents;
        
        if (newCents < 0) {
            newCents = 0;
        }
        
        Money newMoney = new Money(newEuros, newCents);
        return newMoney;
    }
}
