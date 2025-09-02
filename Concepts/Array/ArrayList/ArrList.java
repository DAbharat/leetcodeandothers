package Array.ArrayList;

import java.util.ArrayList;

public class ArrList {
    public static void main(String[] args) {
        ArrayList<String> cart = new ArrayList<>();

        cart.add("Laptop");
        cart.add("Smartphone");
        cart.add("Headphones");
        cart.add("Keyboard");

        System.out.println("Removing: " + cart.get(1));
        cart.remove(1);
        System.out.println("Updated cart details: " + cart);

        cart.set(1, "Earbuds");
        System.out.println("Cart details after replacing an item: " + cart);

        System.out.println("Items in cart: ");
        for (String item : cart) {
            System.out.println(item);
        }
    }
}
