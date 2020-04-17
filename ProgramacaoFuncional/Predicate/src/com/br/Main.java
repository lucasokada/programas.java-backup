package com.br;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();
        list.add(new Product("tv", 5000));
        list.add(new Product("mouse", 80));
        list.add(new Product("notebook", 2000));

        list.removeIf(new ProductPredicate());

        for(Product p : list)
        {
            System.out.println(p.toString());
        }

        list.add(new Product("mouse", 80));

        list.removeIf(product -> product.getPrice() < 2000); //com expressoes lambda

        for(Product p : list)
        {
            System.out.println(p.toString());
        }

    }
}
