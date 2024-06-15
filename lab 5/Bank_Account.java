public class Bank_Account {
     int accountNo;
     String userName;
     String email;
     String accountType;
     double accountBalance;

    
    public Bank_Account(int accountNo, String userName, String email, String accountType, double accountBalance) {
        this.accountNo = accountNo;
        this.userName = userName;
        this.email = email;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }

    
    public void getAccountDetails(int accountNo, String userName, String email, String accountType, double accountBalance) {
        this.accountNo = accountNo;
        this.userName = userName;
        this.email = email;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }

    
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNo);
        System.out.println("User Name: " + userName);
        System.out.println("Email: " + email);
        System.out.println("Account Type: " + accountType);
        System.out.println("Account Balance: " + accountBalance);
    }

    public static void main(String[] args) {
        Bank_Account account = new Bank_Account(123456, "John Doe", "john.doe@example.com", "Savings", 1000.0);
        account.displayAccountDetails();
    }
}
