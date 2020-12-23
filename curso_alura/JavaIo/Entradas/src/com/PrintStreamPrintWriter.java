package com;

import java.io.*;

public class PrintStreamPrintWriter {

    public static void main(String[] args) throws IOException {
        PrintStream ps = new PrintStream("/home/lucas/Desktop/programas-java/curso_alura/JavaIo/Entradas/src/teste2.txt");

        ps.println("teste arqivo");
        ps.println();
        ps.println("fssgsdfg");

        ps.close();
    }
}
