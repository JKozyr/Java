public class BankAccount {
    String accountNumber;
    double balance;
    String accountHolder;

    public BankAccount(String accountNumber, double balance, String accountHolder) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolder = accountHolder;
    }

    void deposit(double amount) {
        if(amount <= 0){
            System.out.println("Sorry, you can't withdraw negative amount");
        }
        else {
            System.out.println(accountNumber);
            System.out.println(accountHolder);

            balance += amount;

            System.out.println("You Deposit " + amount + " $");
            System.out.println("Current balance: " + balance + " $\n\n\n");
        }
    }

    void withdraw(double amount) {
        if(amount > balance) {
            System.out.println("Sorry, you can't withdraw " + amount + " $");
            System.out.println("Current balance is: " + balance + " $\n\n\n");
        }
        if(amount <= 0){
            System.out.println("Sorry, you can't withdraw negative amount");
        }
        else {
            System.out.println(accountNumber);
            System.out.println(accountHolder);

            balance -= amount;

            System.out.println("You withdraw " + amount + " $");
            System.out.println("Current balance: " + balance + " $\n\n\n");


            if (balance < 100) {
                System.out.println("Low balance!!!!");
            }
        }
    }

    void displayBalance() {
        System.out.println(accountNumber);
        System.out.println(accountHolder);
        System.out.println("Current balance: " + balance + " $\n\n\n");

    }
}
