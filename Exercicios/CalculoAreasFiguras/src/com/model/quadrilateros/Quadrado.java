package com.model;

public class Quadrado extends Retangulo {

    public Quadrado(double largura, double altura)  {
        super(largura, altura);
        if(largura != altura) {
            throw new RuntimeException("Esta figura não é um quadrado");
        }
    }
}
