interface Loanable{
    void applyForLoan(double amount);
    void calculateLoanEligibility();
}
abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = initialBalance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
    public abstract void calculateInterest();
}
class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolderName, double initialBalance, double interestRate) {
        super(accountNumber, accountHolderName, initialBalance);
        this.interestRate = interestRate;
    }
    @Override
    public void calculateInterest() {
        System.out.println("Calculating interest for Savings Account at rate: " + interestRate);
    }
}
class CurrentAccount extends BankAccount {
    private double interestRate;

    public CurrentAccount(String accountNumber, String accountHolderName, double initialBalance, double interestRate) {
        super(accountNumber, accountHolderName, initialBalance);
        this.interestRate = interestRate;
    }
    @Override
    public void calculateInterest() {
        System.out.println("Calculating interest for Savings Account at rate: " + interestRate);
    }
}
public class BankingSystem {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("SA123", "John Doe", 1000.0, 0.05);
        savingsAccount.deposit(500);
        savingsAccount.withdraw(200);
        savingsAccount.calculateInterest();
        CurrentAccount currentAccount = new CurrentAccount("CA123", "Jane Doe", 2000.0, 0.03);
        currentAccount.deposit(800);
        currentAccount.withdraw(300);
        currentAccount.calculateInterest();
    }
}
