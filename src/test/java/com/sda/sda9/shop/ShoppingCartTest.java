package com.sda.sda9.shop;

import org.junit.Assert;
import org.junit.Test;

public class ShoppingCartTest {

    @Test
    public void testSuccessfullyAddOneProduct(){
        Product testProduct = new Product("milk", 10);
        ShoppingCart testShoppingCart = new ShoppingCart();
        testShoppingCart.addProduct(testProduct);

        Product[] allProductsInCart = testShoppingCart.getProducts();
        Product actualProduct = allProductsInCart[0];

        Assert.assertEquals("milk", actualProduct.getName());
        Assert.assertEquals(10, actualProduct.getPrice(),0);
    }

    @Test
    public void testCartContains(){
        Product testProduct = new Product("milk", 10);
        ShoppingCart testShoppingCart = new ShoppingCart();
        testShoppingCart.addProduct(testProduct);

        Assert.assertTrue(testShoppingCart.contains(testProduct));

        Product product2 = new Product("ceva", 123);
        Assert.assertFalse(testShoppingCart.contains(product2));

        Product p2 = new Product("faina", 45);
        Product p3 = new Product("oua", 123);
        Product p4 = new Product("paine", 231);
        testShoppingCart.addProduct(p2);
        testShoppingCart.addProduct(p3);
        testShoppingCart.addProduct(p4);

        Assert.assertTrue(testShoppingCart.contains(p2));
        Assert.assertTrue(testShoppingCart.contains(p3));
        Assert.assertTrue(testShoppingCart.contains(p4));
        Assert.assertTrue(testShoppingCart.contains(testProduct));



    }
}
