package com.br;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();
        list.add(new Product("tv", 5000));
        list.add(new Product("mouse", 80));
        list.add(new Product("notebook", 2000));

        list.forEach(new ProductConsumer());
        list.forEach(System.out::println);

        //lambda expression

        list.forEach(product -> product.setPrice(product.getPrice() * 1.1));
        list.forEach(System.out::println);
    }
}
