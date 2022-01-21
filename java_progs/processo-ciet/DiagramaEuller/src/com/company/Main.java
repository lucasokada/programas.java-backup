package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static Double porcentagemToPessoas(Double porcentagem, double quantidadePessoasTotal) {
        return quantidadePessoasTotal * porcentagem;
    }

    public static Integer retornaPessoasPreferemUmUnicoPalco(Integer quantidadePessoasEvento) {
        final Double gostamDosTresPalcos = 0.03; //3%
        final Double gostamAB = 0.20;
        final Double gostamAC = 0.18;
        final Double gostamBC = 0.10;
        final Double gostamA = 0.45;
        final Double gostamB = 0.33;
        final Double gostamC = 0.34;

        Double quantidadePessoasTotal = Double.valueOf(quantidadePessoasEvento);

        HashMap<String, Double> pessoasPorGrupo = new HashMap<>();

        pessoasPorGrupo.put("ABC", porcentagemToPessoas(gostamDosTresPalcos, quantidadePessoasTotal));
        pessoasPorGrupo.put("AB", porcentagemToPessoas(gostamAB, quantidadePessoasTotal) - pessoasPorGrupo.get("ABC"));
        pessoasPorGrupo.put("AC", porcentagemToPessoas(gostamAC, quantidadePessoasTotal) - pessoasPorGrupo.get("ABC"));
        pessoasPorGrupo.put("BC", porcentagemToPessoas(gostamBC, quantidadePessoasTotal) - pessoasPorGrupo.get("ABC"));

        pessoasPorGrupo.put("A", porcentagemToPessoas(gostamA, quantidadePessoasTotal) - pessoasPorGrupo.get("AB") - pessoasPorGrupo.get("AC") - pessoasPorGrupo.get("ABC"));
        pessoasPorGrupo.put("B", porcentagemToPessoas(gostamB, quantidadePessoasTotal) - pessoasPorGrupo.get("AB") - pessoasPorGrupo.get("BC") - pessoasPorGrupo.get("ABC"));
        pessoasPorGrupo.put("C", porcentagemToPessoas(gostamC, quantidadePessoasTotal) - pessoasPorGrupo.get("AC") - pessoasPorGrupo.get("BC") - pessoasPorGrupo.get("ABC"));

        final Double pessoasGostamApenasUmPalco = pessoasPorGrupo.get("A") + pessoasPorGrupo.get("B") + pessoasPorGrupo.get("C");

        return pessoasGostamApenasUmPalco.intValue();
    }

    public static void main(String[] args) {
        Integer pessoas = retornaPessoasPreferemUmUnicoPalco(10000);
        System.out.println(pessoas);
    }
}
