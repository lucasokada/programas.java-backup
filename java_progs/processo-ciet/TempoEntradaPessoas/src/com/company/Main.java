package com.company;

import java.math.BigDecimal;

public class Main {

    public static Double segundosToMinutos(Double tempo) {
        return tempo / 60;
    }

    public static Integer retornaTempoMinimoEmMinutos(Integer p,Integer s,Integer n) {
        Double quantidadePessoasPorPortao = (double)p / n;

        if(quantidadePessoasPorPortao != Math.floor(quantidadePessoasPorPortao)) {
            quantidadePessoasPorPortao = Math.floor(quantidadePessoasPorPortao) + 1;
        }

        Double tempoParaTodosEntrarem = quantidadePessoasPorPortao * s;
        tempoParaTodosEntrarem = segundosToMinutos(tempoParaTodosEntrarem);

        return Math.toIntExact(Math.round(Math.ceil(tempoParaTodosEntrarem)));
    }

    public static void main(String[] args) {
        Integer tempo = retornaTempoMinimoEmMinutos(2749,50,8);
        System.out.println(tempo);
    }
}
