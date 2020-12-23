package com.tests;

import com.model.Aula;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TesteListaAulas {
    public static void main(String[] args) {
        Aula a1 = new Aula("Revisando ArrayList", 21);
        Aula a2 = new Aula("Listas de objetos", 15);
        Aula a3 = new Aula("Relacionamento de listas e objetos", 15);

        ArrayList<Aula> aulas = new ArrayList<>();
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);

        System.out.println(aulas.toString());
        Collections.sort(aulas);        //para que possamos ordenar, a classe que sera ordenada deve ser comparavel,
                                        // sendo assim deve implementar a interface Comparable

        Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
    }
}
