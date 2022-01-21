package com.company;

public class Main {

    public static Double timeOfPerception(Integer distancia) {
        return distancia / 340.0;
    }

    public static boolean retornaSeHaEcoNoEstudio(Integer distancia) {
        final Double limitTime = 0.1;
        final Integer distanciaTotal = 2 * distancia;

        final Double time = timeOfPerception(distanciaTotal);

        return time >= limitTime;
    }

    public static void main(String[] args) {
        boolean temEco = retornaSeHaEcoNoEstudio(20);
        System.out.println(temEco);
    }
}
