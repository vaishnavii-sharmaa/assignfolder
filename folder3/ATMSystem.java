import java.util.*;
import java.time.LocalDateTime;
import java.util.UUID;
interface TransactionLogger {
    void logTransaction(Transaction transaction);
}


class Transaction {
    private final String transactionId;
    private final LocalDateTime date;
    private final double amount;
    private final String type; 

    public Transaction(double amount, String type) {
        this.transactionId = UUID.randomUUID().toString();
        this.date = LocalDateTime.now();
        this.amount = amount;
        this.type = type;
    }

    public String getTransactionId() { return transactionId; }
    public LocalDateTime getDate() { return date; }
    public double getAmount() { return amount; }
    public String getType() { return type; }

    @Override
    public String toString() {
        return "[" + type + "] $" + amount + " on " + date + " (ID: " + transactionId + ")";
    }
}


class Account {
    protected String accountNumber;
    protected String holderName;
    protected double balance;
    protected List<Transaction> transactions = new ArrayList<>();

    public Account(String accountNumber, String holderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = initialBalance;
    }

    public void addTransaction(Transaction t) {
        transactions.add(t);
    }

    public double getBalance() {
        return balance;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }
}


class SavingsAccount extends Account {
    private static final double MIN_BALANCE = 500;

    public SavingsAccount(String accountNumber, String holderName, double initialBalance) {
        super(accountNumber, holderName, initialBalance);
    }

    public boolean canWithdraw(double amount) {
        return (balance - amount) >= MIN_BALANCE;
    }
}


class CurrentAccount extends Account {
    public CurrentAccount(String accountNumber, String holderName, double initialBalance) {
        super(accountNumber, holderName, initialBalance);
    }
}


abstract class ATM implements TransactionLogger {
    protected String location;
    protected String machineId;

    public ATM(String location, String machineId) {
        this.location = location;
        this.machineId = machineId;
    }

    public abstract void withdraw(Account account, double amount);
    public abstract void deposit(Account account, double amount);

    public void logTransaction(Transaction transaction) {
        System.out.println("Transaction logged: " + transaction);
    }
}

class ConcreteATM extends ATM {

    public ConcreteATM(String location, String machineId) {
        super(location, machineId);
    }

    @Override
    public void withdraw(Account account, double amount) {
        if (account instanceof SavingsAccount) {
            SavingsAccount sa = (SavingsAccount) account;
            if (!sa.canWithdraw(amount)) {
                System.out.println("Withdrawal failed: Minimum balance must be maintained.");
                return;
            }
        }

        if (amount <= account.getBalance()) {
            account.balance -= amount;
            Transaction t = new Transaction(amount, "Withdraw");
            account.addTransaction(t);
            logTransaction(t);
            System.out.println("Withdrawal of $" + amount + " successful.");
        } else {
            System.out.println("Withdrawal failed: Insufficient balance.");
        }
    }

    @Override
    public void deposit(Account account, double amount) {
        account.balance += amount;
        Transaction t = new Transaction(amount, "Deposit");
        account.addTransaction(t);
        logTransaction(t);
        System.out.println("Deposit of $" + amount + " successful.");
    }
}


public class ATMSystem {
    public static void main(String[] args) {
        ATM atm = new ConcreteATM("Main Street", "ATM001");

        SavingsAccount savings = new SavingsAccount("SA123", "Alice", 1000);
        CurrentAccount current = new CurrentAccount("CA456", "Bob", 500);

        System.out.println("===== Savings Account Transactions =====");
        atm.withdraw(savings, 600); // Should fail (min balance rule)
        atm.withdraw(savings, 400); // Should succeed
        atm.deposit(savings, 300);

        System.out.println("\n===== Current Account Transactions =====");
        atm.withdraw(current, 400); // Should succeed
        atm.deposit(current, 500);

        System.out.println("\n📄 Savings Account Statement:");
        for (Transaction t : savings.getTransactions()) {
            System.out.println(t);
        }

        System.out.println("\n📄 Current Account Statement:");
        for (Transaction t : current.getTransactions()) {
            System.out.println(t);
        }
    }
}

