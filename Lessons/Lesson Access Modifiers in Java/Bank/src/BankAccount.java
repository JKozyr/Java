public class BankAccount {
    private int accountNumber;
    private double balance;
    private String accountHolderName;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    BankAccount(int accountNumber, double balance, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName = accountHolderName;
    }

    public void deposit(double amount) {
        if(amount < 0) {
            System.out.println("Invalid deposit amount\n");
        }
        else {
            this.balance += amount;
            System.out.println("Deposited " + amount+ " $");
            System.out.println("Your balance is: " + this.balance + "$\n\n");
        }
    }

    public void withdraw(double amount) {
        if(amount > balance) {
            System.out.println("You can't withdraw more than balance\n");
        } else if (amount < 0) {
            System.out.println("You can't withdraw negative amount\n");
        }
        else {
            this.balance -= amount;
            System.out.println("Withdrawed " + amount+ " $");
            System.out.println("Your balance is: " + this.balance + "$\n\n");
        }
    }


}
