package com;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class OrdenaString {

    public static void main(String[] args) {
        List<String> palavras = new ArrayList<String>();
        palavras.add("teste");
        palavras.add("exemple");
        palavras.add("lucas");
        palavras.add("okada");

        Collections.sort(palavras);     //será ordenado da maneira padrão(ordem lexicografica)
                //se quisermos outra forma de ordenação devemos defini-la com uso de Comparator
        System.out.println(palavras);

        Comparator<String> comparator = new ComparadorPorTamanho();
        Collections.sort(palavras, comparator);
        System.out.println(palavras);
        //Antigamente para ordenar uma lista precisavamos do Collections. Com o java 8 essa operaçao
        //é implementada pela lista, tornando descessario utilizaçao de metodos estaticos

        palavras.sort(comparator);  //recebe um comparator como parametro
        System.out.println(palavras);

        //--------------------------------------------------------------------------------------------------------------

//        for(String s : palavras) {
//            System.out.println(s);
//        }
        //Assim como anteriormaente, a partir do java 8 as listas tambem implementam um forEach.

        Consumer<String> consumidor = new ImprimeNaLinha();
        palavras.forEach(consumidor);       //recebe como parametro um consumer


        //Se uma classe for utilizada apenas uma vez no programa inteiro podemos criar uma classe anonima
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

        //é possível utilizar essas classes anonimas ate mesmo em metodos:
        //recurso muito utilizado em android, swing, ejb, servlets, contudo pode deixar o codigo ilegivel e grande
        palavras.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        //para resolver os problemas listados anteriormente podemos utilizar uma forma reduzida, apagando a instancia
        //do consumer, deixando apenas o parametro e o corpo interno, acrescentando uma seta
        //obs: nesse caso nao ha uma classe anonima, mas o resultado e parecido
        palavras.forEach((String s) -> {
                System.out.println(s);
        });

        //ainda podemos reduzir mais ainda, caracterizando uma expressao lambda

        palavras.forEach(s -> System.out.println(s)); //para cada palavra s, dar sout(s)

        //as expressoes lambdas tambem podem ser convertidas para interfaces funcionais:

        Consumer<String> impressor = s -> System.out.println(s);  //essa forma so funciona com interfaces
                                                                // que tenham metodos compativeis
        palavras.forEach(impressor);    //analoga a expressao lambda

        //===========================================================================================================//
        //outro exemplo

        palavras.sort((s1, s2) -> {
                if(s1.length() < s2.length()) {
                    return -1;
                }else if(s1.length() > s2.length()) {
                    return 1;
                }
                return 0;
        });
        //expressoes lambdas funcionama para interfaces que tem um metodo abstrato, chamada interface funcional
        //apenas com isso ja foi possivel melhorar bastante o metodo sort. contudo ainda é possivel melhorar mais

        palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
        //essa forma é muito sucinta, contudo ainda podemos simplificar mais

        palavras.sort(Comparator.comparing(s -> s.length())); //recebe como parametro uma expressao lambda e transforma
        // em um comparator. dada a string s compare o length dela.
        //por baixo dos panos é isso que acontece:
        Function<String, Integer> function = s -> s.length(); //interface Function. Dado uma string ele retorna uma integer
        Comparator<String> comparator1 = Comparator.comparing(function);
        palavras.sort(comparator1);

        //outra forma(nova sintaxe):
        palavras.sort(Comparator.comparing(String::length));
        palavras.forEach(System.out::println);
    }


    //Ja que essa classe ja esta sendo inicializada como uma classe anonima no segundo exemplo ela nao seria mais
    //necessaria e poderia ser apagada
    static class ImprimeNaLinha implements Consumer<String> {

        @Override
        public void accept(String s) {
            System.out.println(s);
        }
    }


    static class ComparadorPorTamanho implements Comparator<String> {

        @Override
        public int compare(String s1, String s2) {
            // se deve vir antes, retorna negativo
            //se deve vir depois retorna positivo
            //se sao iguais retorna zero
            //quem define onde vai vir e o programador dependendo do parametro de ordenacao

            if(s1.length() < s2.length()) {
                return -1;
            }else if(s1.length() > s2.length()) {
                return 1;
            }
            return 0;
        }
    }
}
