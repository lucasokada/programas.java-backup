package com.br;

public class Carro
{
    public String cor;
    public int ano;
    public double preco;
    public int velocidadeAtual;

    public Carro(String cor, int ano, double preco)
    {

        System.out.println("teste");
        this.ano = ano;
        this.cor = cor;
        this.preco = preco;
    }

    public void acelerar(int velocidade)
    {
        this.velocidadeAtual = velocidade;
    }

    public void acelerar()
    {
        this.velocidadeAtual += 10;
    }
}
