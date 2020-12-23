package com.model;

import com.model.interfaces.Formas;

public abstract class Triangulo implements Formas {

    protected double base;
    protected double altura;
    protected double cateto1;
    protected double cateto2;

    public Triangulo(double base, double cateto1, double cateto2) {
        this.base = base;
        this.cateto1 = cateto1;
        this.cateto2 = cateto2;
        calculaAltura();

        if(!condicaoExistenciaTrinangulo()) {
            throw new RuntimeException("Condicao de existencia nao foi comprida");
        }
    }

    private boolean condicaoExistenciaTrinangulo() {
        if(base > cateto1 + cateto2 || cateto1 > cateto1 + base || cateto2 > base + cateto1) {
            return false;
        }

        return true;
    }

    public abstract void calculaAltura();

    @Override
    public abstract double area();

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public double getCateto1() {
        return cateto1;
    }

    public double getCateto2() {
        return cateto2;
    }
}
