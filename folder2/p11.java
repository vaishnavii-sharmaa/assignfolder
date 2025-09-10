class BankAccount {
    public int accountNumber;
    protected String accountHolder;
    private double balance;

    BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(int accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    public void displayDetails() {
        System.out.println("Account No: " + accountNumber +
                           ", Holder: " + accountHolder +
                           ", Balance: " + getBalance() +
                           ", Interest Rate: " + interestRate + "%");
    }
}

public class p11 {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(1001, "Alice", 5000.0);
        System.out.println("Account No: " + acc1.accountNumber +
                           ", Holder: " + acc1.accountHolder +
                           ", Balance: " + acc1.getBalance());

        acc1.deposit(2000);
        acc1.withdraw(1500);
        System.out.println("Updated Balance: " + acc1.getBalance());

        SavingsAccount sa = new SavingsAccount(2002, "Bob", 10000.0, 4.5);
        sa.displayDetails();
    }
}