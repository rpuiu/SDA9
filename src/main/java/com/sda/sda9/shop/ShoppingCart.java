package com.sda.sda9.shop;

public class ShoppingCart {

    private Product[] products;
    private int index;

    public ShoppingCart() {
        this.index = 0;
        this.products = new Product[5];
    }

    public void addProduct(Product product) {
        if (index < 5) {
            products[index] = product;
            index++;
        } else {
            System.out.println("Cart is full!!!");
        }
    }
}
