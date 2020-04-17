package com.br;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        File file = new File("/home/lucas/Desktop/PROGRAMAS.JAVA/FilesInJava/file.txt");
        Scanner input = null;

        try{
            input = new Scanner(file); //instancia teclado para arquivo
            while (input.hasNextLine()) //enquanto existir proxima linha
                System.out.println(input.nextLine());

        }catch (IOException exception){
            System.out.println("Error: " + exception.getMessage());

        }finally {
            if(input != null) {
                input.close();
            }
        }

        System.out.println("==================================================================================================================");

        String path = "/home/lucas/Desktop/PROGRAMAS.JAVA/FilesInJava/file.txt";
        FileReader fr = null;
        BufferedReader br = null;

        try{
            fr = new FileReader(path);
            br = new BufferedReader(fr);

            String line = br.readLine();
            while(line != null)
            {
                System.out.println(line);
                line = br.readLine();
            }
        }catch (IOException exception){
            System.out.println(exception.getMessage());
        }finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (fr != null) {
                    fr.close();
                }
            }catch (IOException exception){
                exception.printStackTrace();
            }
        }
    }
}
