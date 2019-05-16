package com.sda.sda9.shop;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("milk", 10.3);
        Product p2 = new Product("eggs", 3.3);

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addProduct(p1);
        shoppingCart.addProduct(p2);
        shoppingCart.addProduct(p1);
        shoppingCart.addProduct(p2);
        shoppingCart.addProduct(p2);
        shoppingCart.addProduct(p2);
        shoppingCart.addProduct(p2);
        shoppingCart.addProduct(p1);
    }
}
