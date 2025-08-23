package OOPS.Abstraction;

public class Bank2 extends ATM{
    private int balance = 400000;

    @Override
    void withdraw(int amount) {
        if(amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawing: " + amount + "Remaining Balance: " + balance);
        } else {
            System.out.println("Amount entered is more than the balance!!");
        }
    }

    @Override
    void checkBalance() {
        System.out.println("Balance: " + balance);
    }
}
