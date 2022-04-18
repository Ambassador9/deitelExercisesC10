package chapterSeven;

public class Account {
    private final String ACCOUNT_NUMBER;
    private String accountName;
    private String pin;
    private int balance;

    public Account(String accountNumber, String lastName, String firstName, String pin) {
        ACCOUNT_NUMBER = accountNumber;
        accountName = lastName +" "+ firstName;
        this.pin = pin;
    }

    public String getAccountNumber() {
        return ACCOUNT_NUMBER;
    }

    public String getAccountName() {
        return accountName;
    }

    public String getAccountPin() {
        return pin;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
        } else balance = this.balance;
    }

    public int getBalance(String pin) {
        if(pin == this.pin){
            return balance;
        }
        return balance = 0;
//        return balance;
    }

    public void withdraw(int amount, String pin) {
        if(pin.equals(this.pin)){
            if(amount < balance) {
                balance -= amount;
            }
        }
    }
}
