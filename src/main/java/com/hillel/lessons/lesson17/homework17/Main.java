package com.hillel.lessons.lesson17.homework17;

import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {

        Product product1 = new Product("Cheese", 25);
        Product product2 = new Product("Mayo", 3);
        Product product3 = new Product("Ham", 11);

        List<Product> list = new ArrayList<>();
        list.add(product1);
        list.add(product2);
        list.add(product3);

        ProductMarket productMarket = new ProductMarket(list);

        System.out.println("All product names: " + productMarket.getAllProductNames());
        System.out.println("All product names sorted alphabetically: "
                + productMarket.getAllProductNamesSortedAlphabetically());
        System.out.println("All prices greater than 10: " + productMarket.getAllPricesGreaterThan10());
        System.out.println("All prices less than 5: " + productMarket.getAllPricesSmallerThan5());
        System.out.println("Get all prices as String: " + productMarket.getAllPricesAsString());


    }
}
