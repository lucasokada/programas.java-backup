package com.br;

import java.util.Locale;
import com.br.business.ListOperations;
import com.br.business.StringOperations;
import com.br.entities.Product;
import com.br.file.FileOperations;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);

        ListOperations<Product> list = new ListOperations<>();

        int numberOfLines = FileOperations.numberOfLines();
        int i = 1;

        while(i != numberOfLines) {

            String info = FileOperations.readFile(i);
            String[] array = StringOperations.splitString(info);
            double price = StringOperations.stringToDouble(array[1]);
            list.addList(new Product(array[0], price));

            //System.out.println("name: " + array[0] + "\n" + "price: " + price);
            i++;
        }
    }
}
