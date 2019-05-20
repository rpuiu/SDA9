package com.sda.sda9.shop;

public class ShoppingCart {

    private Product[] products;
    private int index;

    public static void main(String[] args) {
        ShoppingCart c= new ShoppingCart();
        c.getProducts(); // get the value of the empty array;
        Product product = new Product("a", 1);
        c.contains(product); //array of products is empty
        c.addProduct(product);
        c.addProduct(product);
        c.addProduct(product);
        c.contains(product); // array of products contains the 3 items above.

        c.getProducts(); // get the value of the array with elements.
    }
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

    public Product[] getProducts() { //Use getters to retrieve value of private fields'
        return products;
    }

    //    public boolean contains(Product prod) {
//        for (Product currentProduct : products) {
//            if (currentProduct == null){
//                continue;
//            }
//                if (currentProduct.getPrice() == prod.getPrice() &&
//                        currentProduct.getName().equals(prod.getName())) {
//
//                    return true;
//                }
//        }
//        return false;
//    }
    public boolean contains(Product prod) {
        for (Product currentProduct : products) {
            if (prod.equals(currentProduct)) {
                return true;
            }
        }
        return false;
    }
}
