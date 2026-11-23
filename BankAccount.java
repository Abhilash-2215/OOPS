public class BankAccount {
    private String accountHolder = "Abhi";
    private double balance = 2872897.00;

    public void getter() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }

    public void setter(String s, double b) {
        accountHolder = s;

        if (b <= 0) {
            System.out.println("Negative balance not allowed");
        } else {
            balance = b;
        }
    }

   
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited successfully");
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount");
        } else if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully");
        }
    }
}

class Main {
    public static void main(String[] args) {
        BankAccount c = new BankAccount();

        c.getter();

        c.deposit(5000);

        c.withdraw(2000);

        c.setter("Ravi", -100.00);

        c.getter();
    }
}