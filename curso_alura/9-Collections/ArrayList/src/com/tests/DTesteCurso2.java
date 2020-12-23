package com.tests;

import com.model.Aula;
import com.model.Curso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DTesteCurso2 {

    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Colecoes em java", "Alura");

        javaColecoes.adiciona(new Aula("aula teste", 22));
        javaColecoes.adiciona(new Aula("collections em java", 32));
        javaColecoes.adiciona(new Aula("java poo", 89));

        List<Aula> aulasImutavies = javaColecoes.getAulas(); //imutavel pois: Collections.unmodifiableList();
        List<Aula> aulasMutaveis = new ArrayList<>(aulasImutavies); //transforma a lista imutavel em uma lista mutavel

        Collections.sort(aulasMutaveis, Comparator.comparing(Aula::getTempo));
        System.out.println(aulasMutaveis);
        System.out.println(javaColecoes.getTempoTotal());
    }
}


