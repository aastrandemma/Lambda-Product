package com.github.aastrandemma;

import java.util.ArrayList;
import java.util.List;

public class ProductApp {
    public static void main(String[] args) {
        List<Product> storage = new ArrayList<>();
        storage.add(new Product("Nook's Cranny & Rosie's house", 105, 0));
        storage.add(new Product("Julian's birthday", 250, 15));
        storage.add(new Product("Bunnies outdoor activities", 300, 5));

        Conditional conditionalForStockZero = product -> product.getStock() == 0;
        Action printProduct = product -> System.out.println(product.toString());
        process(storage, conditionalForStockZero, printProduct);

        Conditional conditionalForProductsStartsB = product -> product.getProductName().startsWith("B");
        Action printProductName = product -> System.out.println(product.getProductName());
        process(storage, conditionalForProductsStartsB, printProductName);

        Conditional conditionalForProductsPriceBetween100And150 = product -> product.getPrice() > 100 && product.getPrice() < 150;
        process(storage, conditionalForProductsPriceBetween100And150, printProduct);

        Conditional conditionalForStockLessThan10Above0 = product -> product.getStock() < 10 && product.getStock() > 0;
        Action increasePrice = product -> {
            double increasedPrice = product.getPrice() * 1.5;
            product.setPrice(increasedPrice);
        };
        process(storage, conditionalForStockLessThan10Above0, increasePrice);
    }

    public static void process(List<Product> list, Conditional conditional, Action action) {
        for (Product product : list) {
            if (conditional.test(product)) {
                action.execute(product);
            }
        }
    }
}