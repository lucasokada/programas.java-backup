package com.br;

import java.util.function.Function;

public class ProductFunction implements Function<Product, String> {//Function<tipoEntrada, tipoSaida>

    @Override
    public String apply(Product product) {
        return product.getName().toUpperCase();
    }

}
