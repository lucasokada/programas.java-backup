package com;

import java.io.*;

public class FileWriter {

    public static void main(String[] args) throws IOException {

//        FileOutputStream file = new FileOutputStream("/home/lucas/Desktop/programas-java/curso_alura/JavaIo/Entradas/src/teste.txt");
//        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(file);
//        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

            //uma das maneiras de utilizar o filewriter
//        FileWriter fw = new FileWriter("/home/lucas/Desktop/programas-java/curso_alura/JavaIo/Entradas/src/teste2.txt");
//
//        fw.write("Teste de escrita no arquivo");
//        fw.write(System.lineSeparator());
//        fw.close;

        java.io.FileWriter fw = new java.io.FileWriter("/home/lucas/Desktop/programas-java/curso_alura/JavaIo/Entradas/src/teste2.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("Teste de escrita no arquivo");
        bw.newLine();

        bw.close(); //fecha os anteriores automaticamente
    }
}
