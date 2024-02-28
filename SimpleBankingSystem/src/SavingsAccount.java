public class SavingsAccount extends Account {
    private final double interestRate;

    public SavingsAccount(String accountID, double balance, double interestRate) {
        super(accountID, balance);
        this.interestRate = interestRate;
    }

    @Override
    void displayAccountDetails() {
        System.out.println("===== Savings Account =====");
        System.out.println("Account ID: " + getAccountID());
        System.out.println("Balance: $" + getBalance());
        System.out.println("Interest Rate: " + interestRate);
    }
}
