package com.br;
import Business.GerarQuartos;
import Dominio.Quarto;

import java.util.Scanner;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Quarto[] quartos = new Quarto[10];

       GerarQuartos.inicializaQuartos(quartos);
       GerarQuartos.imprimirQuartos(quartos);

    }
}
