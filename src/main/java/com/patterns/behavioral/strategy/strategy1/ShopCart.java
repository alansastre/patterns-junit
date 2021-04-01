package com.patterns.behavioral.strategy.strategy1;

import java.util.ArrayList;
import java.util.List;

public class ShopCart {

    private List<Product> products;

    public ShopCart() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product){
        this.products.add(product);
    }

    public void removeProduct(Product product){
        this.products.remove(product);
    }

    // pagar utilizando una estrategia de pago
    public void pay(PaymentStrategy paymentMethod){
        double amount = 0;
        for (Product product : products) {
            amount += product.getPrice();
        }

        paymentMethod.pay(amount);
    }

    public List<Product> getProducts() {
        return products;
    }

    public ShopCart setProducts(List<Product> products) {
        this.products = products;
        return this;
    }
}
