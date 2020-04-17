package com.br;

import java.util.Locale;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Produto produto1 = new Produto();
        int escolha = 1;

        produto1.opcaoEscolhida(escolha, produto1);

    }
}
