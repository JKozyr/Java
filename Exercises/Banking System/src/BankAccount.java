public class BankAccount {
    private int accountNumber;
    private double balance;
    private String accountHolderName;

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public BankAccount(int accountNumber, double balance, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName = accountHolderName;
    }

    void deposit(double amount) {
        if(amount <= 0) {
            System.out.println("You can't deposit negative amount");
        }
        else {
            this.balance += amount;
            System.out.println("Your balance after this operation is: " + this.balance);
        }
    }

    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("You can't withdraw negative amount");
        } else if (amount > balance) {
            System.out.println("You can't withdraw more than balance");
        } else {
            this.balance -= amount;
            System.out.println("Your balance after this operation is: " + this.balance);
        }
    }
        void showBalance(){
            System.out.println("Your balance is: " + this.balance);
        }
    }


