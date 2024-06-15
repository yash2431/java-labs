class InsufficientFundException extends Exception {
    public InsufficientFundException(String message) {
        super(message);
    }
}

class Account {
     double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) throws InsufficientFundException {
        if (amount > balance) {
            throw new InsufficientFundException("Insufficient funds. Withdrawal amount exceeds balance.");
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }
}

public class BankDemo {
    public static void main(String[] args) {
        Account account = new Account(1000);

        try {
            account.withdraw(500);
            account.withdraw(700); // This will throw an InsufficientFundException
        } catch (InsufficientFundException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Current balance: " + account.getBalance());
    }
}
