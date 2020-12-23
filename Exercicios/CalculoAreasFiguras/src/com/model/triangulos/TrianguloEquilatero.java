package com.model;

public class TrianguloEquilatero extends Triangulo {
    public TrianguloEquilatero(double base, double cateto1, double cateto2) {
        super(base, cateto1, cateto2);
        if(base != cateto1 || base != cateto2) {
            throw new RuntimeException("Este nao e um triangulo equilatero");
        }
    }

    @Override
    public void calculaAltura() {
        altura = base * Math.sqrt(3.0) / 2;
    }

    @Override
    public double area() {
        return base * altura / 2;
    }
}
