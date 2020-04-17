package com.br;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product("tv", 5000));
        list.add(new Product("mouse", 80));
        list.add(new Product("notebook", 2000));

        List<String> names = list.stream().map(new ProductFunction()).collect(Collectors.toList());
        //funçao map esta pegando a coleçao de valores e aplicando a funçao especificada em cada um dos valores

        names = list.stream().map(product -> product.getName().toUpperCase()).collect(Collectors.toList());
        //com expressao lambda
        names.forEach(System.out::println);
    }
}
