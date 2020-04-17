package com.br;

import java.util.Arrays;
import java.util.List;
import java.util.logging.LogManager;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3 ,4 ,5);
        Stream<Integer> st = list.stream(); //criaçao de stream a partir de uma lista
        System.out.println(Arrays.toString(st.toArray())); //transforma a stream em um array

        st = list.stream().map(x -> x * 10);// aplica a operação fornecida em todos os elementos
        System.out.println(Arrays.toString(st.toArray()));
	
        Stream<String> st2 = Stream.of("lucas", "celso", "cesar", "sonia");
        System.out.println(Arrays.toString(st2.toArray()));

        Stream<Integer> st3 = Stream.iterate(0, x -> x+2); //iteraçao de geraçao dos proximos elementos. 0, 2, 4, 6 ...
        System.out.println(Arrays.toString(st3.limit(4).toArray())); //limite de x elementos

        Stream<Long> st4 = Stream.iterate(new Long[] {0L, 1L}, p -> new Long[] {p[1], p[0] + p[1]}).map(p -> p[0]).limit(20);
        System.out.println(Arrays.toString(st4.toArray())); //fibonacci

        int sum = list.stream().reduce(0, (x, y) -> x + y);//valor inicial rebendo dois argumentos e gerando um resultado
        System.out.println(sum);
    }
}
