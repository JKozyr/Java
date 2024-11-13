public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount("4930049328832",1340.23,"John Marson");
        BankAccount bankAccount2 = new BankAccount("4930027362878",0,"Adin Bustaf");
        BankAccount bankAccount3 = new BankAccount("4930074826761",20012.03,"Julian Tarkov");
        BankAccount bankAccount4 = new BankAccount("4930093830029",1993482.32,"Bill Mace");


        bankAccount1.displayBalance();
        bankAccount1.withdraw(1000);
        bankAccount1.deposit(2000);


        bankAccount2.displayBalance();
        bankAccount2.withdraw(10);
        bankAccount2.deposit(2000);


        bankAccount3.displayBalance();
        bankAccount3.withdraw(-10000);
        bankAccount3.deposit(2000);


        bankAccount4.displayBalance();
        bankAccount4.withdraw(1000000);
        bankAccount4.deposit(2020202020);

    }
}