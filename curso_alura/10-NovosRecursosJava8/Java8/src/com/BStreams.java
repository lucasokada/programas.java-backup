package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<Curso>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));

        cursos.sort(Comparator.comparing(Curso::getAlunos));
        cursos.forEach(c -> System.out.println(c.toString()));

        //Para trabalhar com coleçoes de dados que devem ser operados seguindo um criterio utilizamos as streams

        cursos.stream().filter(c -> c.getAlunos() >= 100); //retorna uma sequencia de objetos que podem ser operados
                                                            // de acordo com os metodos nesse stream

        System.out.println();
        System.out.println("Apos stream");
        cursos.forEach(c -> System.out.println(c.toString()));
        //Tudo oque é feito em uma stream nao impacta a coleçao original original,
        // por isso a saida continua sendo a mesma


        System.out.println();
        System.out.println("Apos stream 2");
        cursos.stream().filter(c -> c.getAlunos() >= 100)
                .forEach(c -> System.out.println(c.toString()));
        //agora a operaçao de printar todos os alunos esta sendo feita na mesma operaçao,
        //por isso printa os valores corretos. Contudo, a lista original continua sendo a mesma


        cursos.stream().filter(c -> c.getAlunos() >= 100)
                .map(Curso::getAlunos)
                .forEach(System.out::println);  //map recebe uma colecao de objetos e
                                                                // transforma em inteiro

        cursos.stream().filter(c -> c.getAlunos() >= 50)
                .mapToInt(Curso::getAlunos)
                .sum();

        //stream e collections nao sao a mesma coisa
    }
}
