package com.br;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("folder path");
        String strPath = input.nextLine();

        File path = new File(strPath);
        System.out.println("get name: " +  path.getName());
        System.out.println("get path: " +  path.getPath());
        System.out.println("get parent: " +  path.getParent());
    }
}
