package com.br;
import java.util.Scanner;

public class Produto {
    Scanner input = new Scanner(System.in);

    public String nome;
    public double preco;
    public int quantidade;
    public double valorEstoque;

    public void menu()
    {
        System.out.println("--------------------MENU--------------------");
        System.out.println("1 - inserir dados do produto");
        System.out.println("2 - mostrar dados do produto");
        System.out.println("3 - adicionar produtos no estoque");
        System.out.println("4 - remover produtos do estoque");
        System.out.println("---------------------------------------------");
    }

    public Produto insereDadosProduto()
    {
        Produto x = new Produto();

        System.out.println("nome produto:");
        x.nome = input.nextLine();

        System.out.println("preço:");
        x.preco = input.nextFloat();

        System.out.println("quantidade:");
        x.quantidade = input.nextInt();

        x.valorEstoque = x.quantidade * x.preco;

        return(x);
    }

    public void mostraDadosProduto(Produto x)
    {
        System.out.println("nome produto: " +x.nome);
        System.out.println("preço : " +x.preco);
        System.out.println("quantidade: " +x.quantidade);
        System.out.println("valor no estoque: " +x.valorEstoque);
    }

    public void adicionaEstoque(Produto x)
    {
        int quantidadeAdicionada;

        System.out.println("quantidade a ser adicionada:");
        quantidadeAdicionada = input.nextInt();

        x.quantidade += quantidadeAdicionada;
        x.valorEstoque += quantidadeAdicionada * x.preco;
        x.mostraDadosProduto(x);
    }

    public void removaEstoque(Produto x)
    {
        int quantidadeRemovida;

        do {
            System.out.println("quantidade a ser removida:");
            quantidadeRemovida = input.nextInt();

            if(quantidadeRemovida > x.quantidade){
                System.out.println("quantidade indisponivel. Tente novamente");
            }
        }while(quantidadeRemovida > x.quantidade);

        x.quantidade -= quantidadeRemovida;
        x.valorEstoque -= quantidadeRemovida * x.preco;

        x.mostraDadosProduto(x);
    }

    public void opcaoEscolhida(int escolha, Produto x)
    {
        while(escolha >= 1 && escolha <= 4){

            x.menu();
            System.out.println("digite a escolha:");
            escolha = input.nextInt();

            switch (escolha) {
                case 1:
                    x = x.insereDadosProduto();
                    break;
                case 2:
                    x.mostraDadosProduto(x);
                    break;
                case 3:
                    x.adicionaEstoque(x);
                    break;
                case 4:
                    x.removaEstoque(x);
                    break;
                default:
                    System.out.println("escolha invalida");
                    break;
            }
        }
    }

}