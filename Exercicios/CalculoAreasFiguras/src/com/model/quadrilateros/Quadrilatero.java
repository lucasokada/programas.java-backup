package com.model;

import com.model.interfaces.Formas;

import java.text.Normalizer;

public abstract class Quadrilatero implements Formas {
    private double largura;
    private double altura;

    public Quadrilatero(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
     public double area() {
        return this.altura * this.largura;
    }
}
