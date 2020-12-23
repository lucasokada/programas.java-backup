package com;

import java.io.*;

public class SerializacaoObjetoCriado {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //classe -> bináro
        Cliente cliente = new Cliente();
        cliente.setNome("Lucas Okada");
        cliente.setProfissao("Programador");
        cliente.setCpf("12311243398");

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
        oos.writeObject(cliente);
        oos.close();

        //binário -> classe
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
        Cliente cilenteAux = (Cliente) ois.readObject();
        System.out.println(cilenteAux.toString());
        ois.close();
    }
}
