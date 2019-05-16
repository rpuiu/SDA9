package com.sda.sda9.shop;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("milk", 10.3);
        Product p2 = new Product("eggs", 3.3);

        System.out.println(p1.toString());
        System.out.println(p2.toString());

        ShoppingCart shoppingCart = new ShoppingCart();
    }
}
