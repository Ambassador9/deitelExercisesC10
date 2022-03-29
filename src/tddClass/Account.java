package tddClass;

public class Account {

    private int balance;
    //private int withdraw;

    public void deposit(int amount) {
        if(amount>0) balance = amount + balance;
        //if(amount<0) amount = 0;
        //balance = amount + balance;
    }

    public int getBalance() {
        return balance;
    }

    public void withdraw(int amount) {
        if(balance > amount) balance = balance - amount;
        if(balance < amount) {
            System.out.println("Withdrawal amount exceeded the balance");
            balance = balance;
        }
        //balance = balance - amount;
    }

}
