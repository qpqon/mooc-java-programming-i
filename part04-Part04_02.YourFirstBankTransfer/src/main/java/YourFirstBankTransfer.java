// Creates an account named "Matthews account" with the balance 1000
// Creates an account named "My account" with the balance 0
// Withdraws 100.0 from Matthew's account
// Deposits 100.0 to "my account"
// Prints both the accounts

public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        String matsAccName    = "Matthews account";
        double matsAccBalance = 1000;
        
        String myAccName    = "My account";
        double myAccBalance = 0;
        
        Account matsAccount = new Account(matsAccName, matsAccBalance);
        Account myAccount = new Account(myAccName, myAccBalance);
        
        matsAccount.withdrawal(100);
        myAccount.deposit(100);
        
        System.out.println(matsAccount);
        System.out.println(myAccount);
    }
}
