package com.sda.sda9.shop;

public class Cashier {

    public double getTotal(ShoppingCart cart) {
        Product[] products = cart.getProducts();

        double total = 0;
        for (Product product : products) {
            if (product != null) {  //the array will be initialized with null products(if we add 3, 2 will be null)
                total += product.getPrice(); // total = total + price;
            }
        }
        return total;
    }
}
