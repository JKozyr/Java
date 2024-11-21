public class Main {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount(9938293,1000,"Gostin");

        bankAccount.deposit(500);
        bankAccount.withdraw(10);

        bankAccount.showBalance();

    }
}