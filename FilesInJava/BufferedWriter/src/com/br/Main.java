package com.br;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        String[] line = new String[]{"Lucas", "Eiki", "Okada"};
        String path = "/home/lucas/Desktop/PROGRAMAS.JAVA/FilesInJava/file2.txt";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){

            for(String obj : line) {
                bw.write(obj); //bw.write(obj, true); to concatenate
                bw.newLine();
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}