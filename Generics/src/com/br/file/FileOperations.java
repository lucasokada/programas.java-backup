package com.br.file;

import com.br.business.StringOperations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileOperations {
    private File file;

    public static String readFile(int n) throws IOException
    {
        String path = "/home/lucas/Desktop/product_prices.txt";
        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine();
            String productInfos = null;
            int i = 0;

            while(line != null && i != n){
                productInfos = line;
                line = br.readLine();
                i++;
            }

            return productInfos;
        }
    }

    public static int numberOfLines() throws IOException
    {
        String path = "/home/lucas/Desktop/product_prices.txt";
        int i = 0;

        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine();

            while(line != null){
                line = br.readLine();
                i++;
            }
        }
        return i;
    }
}
