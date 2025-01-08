// Write a program that creates an account with a balance of 100.0, 
// deposits 20.0 in it, and finally prints the balance. NB! Perform 
// all the operations in this exact order.

public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        String owner = "Daniel";
        double balance = 100.0;
        
        Account account = new Account(owner, balance);
        
        account.deposit(20.0);
        
        System.out.println(account);
    }
}
