package OOPS.Abstraction;

class Bank1 extends ATM{
    private int balance = 300000;

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
