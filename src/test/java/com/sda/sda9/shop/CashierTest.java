package com.sda.sda9.shop;

import org.junit.Assert;
import org.junit.Test;

public class CashierTest {

    @Test
    public void testShoppingCartTotal(){
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(new Product("milk", 10));
        cart.addProduct(new Product("shoes", 1000));
        cart.addProduct(new Product("car", 5000));

        Cashier cashier = new Cashier();
        double actualTotal = cashier.getTotal(cart);
        double expectedTotal = 6010;

        Assert.assertEquals(expectedTotal, actualTotal, 2);
    }
}
