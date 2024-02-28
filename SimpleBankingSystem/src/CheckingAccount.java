public class CheckingAccount extends Account {

    public CheckingAccount(String accountID, double balance) {
        super(accountID, balance);
    }

    @Override
    void displayAccountDetails() {
        System.out.println("===== Checking Account =====");
        System.out.println("Account ID: " + getAccountID());
        System.out.println("Balance: $" + getBalance() + "\n");
    }
}
