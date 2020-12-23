package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class CMaisStreams {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<Curso>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));

        Optional<Curso> optionalCurso  = cursos
                                            .stream()
                                            .filter(c -> c.getAlunos() >= 100)
                                            .findAny();
        //optional é um tipo que admite null, ou seja, a variavel pode existir ou nao.

        optionalCurso.get();    //se o curso for null devolve uma exception(nao interessante)
        Curso curso = optionalCurso.orElse(null); //se o objeto nao existir retorna null
        System.out.println(curso);

        //outra forma melhor para nao retornar valores null:

        optionalCurso.ifPresent(c -> System.out.println(c.getClass()));
    }
}
