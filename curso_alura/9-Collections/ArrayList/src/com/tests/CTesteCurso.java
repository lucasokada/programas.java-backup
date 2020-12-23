package com.tests;

import com.model.Aula;
import com.model.Curso;

import java.util.ArrayList;
import java.util.List;

public class CTesteCurso {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Colecoes em java", "Alura");

//        List<Aula> aulas = javaColecoes.getAulas();
//        System.out.println(aulas);

//        aulas.add(new Aula("Trabalhando com ArrayList", 21));
//        javaColecoes.getAulas().add(new Aula("Java collections" , 43)); //outra forma de add
        //As formas acima não é uma forma boa de adicionar, pois o usuário tem acesso direto ao objeto, tornando o codigo
        //mais encapsulado.Uma forma melhor de fazer esse add, é a criação de um método que apenas adicione aulas na classe Curso.
        javaColecoes.adiciona(new Aula("Java collections" , 43));



    }
}
