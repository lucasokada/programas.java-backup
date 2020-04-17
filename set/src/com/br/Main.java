package com.br;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hashset");
        Set<String> set1 = new HashSet<>(); // rápido(O(n), tabela hash), não ordenado

        set1.add("notebook");
        set1.add("celular");
        set1.add("televisao");
        set1.add("tablet");
        set1.add("caixa de som");

        System.out.println("achou = " + set1.contains("televisao"));
        System.out.println(set1.contains("achou = " + "pen drive"));
        System.out.println();

        for(String str : set1)
        {
            System.out.println(str);
        }
        System.out.println();

        //==========================================================================

        System.out.println("Treeset");
        Set<String> set2 = new TreeSet<>();// lento(O(log(n))), árvore rubo-negra, ordenado

        set2.add("notebook");
        set2.add("celular");
        set2.add("televisao");
        set2.add("tablet");
        set2.add("caixa de som");
        set2.add("televisao"); // conjuntos SET não admitem repetições

        System.out.println("achou = " + set2.contains("televisao"));
        System.out.println(set2.contains("achou = " + "pen drive"));
        System.out.println();

        for(String str : set2)
        {
            System.out.println(str);
        }
        System.out.println();

        //=========================================================================

        System.out.println("LinkedHashset");
        Set<String> set3 = new LinkedHashSet<>();// velocidade intermediária, elementos na ordem que foram adicionados

        set3.add("notebook");
        set3.add("celular");
        set3.add("televisao");
        set3.add("tablet");
        set3.add("caixa de som");

        System.out.println("achou = " + set3.contains("televisao"));
        System.out.println(set3.contains("achou = " + "pen drive"));
        System.out.println();

        for(String str : set3)
        {
            System.out.println(str);
        }
        System.out.println();

        set3.removeIf(x -> x.length() > 3); //remove elementos x tal que x tenha tamanho > 4
        set3.removeIf(x -> x.charAt(0) == 't');//remove elementos x tal que comece com t

        for(String str : set3)
        {
            System.out.println(str);
        }
        System.out.println();

    }
}
