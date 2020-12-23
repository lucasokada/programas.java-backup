package com.tests;

import java.util.ArrayList;
import java.util.Collections;

public class TesteListas {
    public static void main(String[] args) {

        String aula1 = "conhecendo mais de listas";
        String aula2 = "modelando a classe aula";
        String aula3 = "trabalhando com cursos e sets";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        System.out.println(aulas);

        aulas.remove(0);

        System.out.println(aulas);


        String aulaTeste = aulas.get(1);
        System.out.println(aulaTeste);

        for(int i = 0; i < aulas.size(); i++) {     //forma muito lenta de percorrer listas
            System.out.println("Aulas: " + aulas.get(i));
        }

        for(String aula : aulas) { //for each
            System.out.println("aula: " + aula);
        }

        aulas.forEach(aula -> {                 //algumas vantagens(paralelismo ...) e mais elegante
            System.out.println("percorrendo: " + aula);     //expressão lambda
        });

        aulas.add("Aumentando os conhecimentos");

        System.out.println("antes de ordenar " + aulas);

        Collections.sort(aulas);        //classe auxiliar com diverssos metodos estaticos, entre eles o sort
                                        //ordena na ordem crescente

        System.out.println("depois de ordenar " + aulas);

    }
}
