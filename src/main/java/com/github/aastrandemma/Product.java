package com.github.aastrandemma;

public class Product {
    private final String productName;
    private double price;
    private final int stock;

    public Product(String productName, double price, int stock) {
        this.productName = productName;
        this.price = price;
        this.stock = stock;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    @Override
    public String toString() {
        return "Product: " + productName + ", Price: " + price + ", Stock: " + stock;
    }
}