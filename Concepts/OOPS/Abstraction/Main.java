package OOPS.Abstraction;

public class Main {
    public static void main(String[] args) {
        ATM bank1 = new Bank1();
        ATM bank2 = new Bank2();

        bank1.withdraw(2000);
        bank2.checkBalance();
    }
}
