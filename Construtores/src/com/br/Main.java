package com.br;

public class Main {

    public String teste;

    public static void main(String[] args) {

        Carro x = new Carro("vermelho", 1990, 5000);
        Carro y = new Carro("azul", 2000, 10000);

        System.out.println("cor" +x.cor);
        Carro z = x;
        z.cor = "amarelo";
        System.out.println("cor" +x.cor);
    }
}
