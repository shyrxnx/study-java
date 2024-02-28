public abstract class Account {
    private final String accountID;
    private double balance;

    Account(String accountID, double balance) {
        this.accountID = accountID;
        this.balance = balance;
    }

    public String getAccountID() {
        return accountID;
    }
    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("$" + amount + " deposited successfully." + "\n");
        } else {
            System.out.println("Invalid amount for deposit." + "\n");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("$" + amount + " withdrawn successfully." + "\n");
        } else {
            System.out.println("Insufficient funds or invalid amount for withdrawal." + "\n");
        }
    }
    abstract void displayAccountDetails();
}
