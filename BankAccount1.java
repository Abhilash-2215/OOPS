abstract class BankAccount1 {
    abstract double calculateInterest();

    void displayAccountType() {
        System.out.println("Bank Account Details");
    }
}

class SavingsAccount extends BankAccount1{
    double balance;

    double calculateInterest() {
        return balance * 0.05;
    }
}

class Main {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount();
        s.balance = 50000;

        s.displayAccountType();
        System.out.println("Interest: " + s.calculateInterest());
    }
}