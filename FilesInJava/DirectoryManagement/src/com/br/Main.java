package com.br;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);

	    System.out.println("enter a folder path");
	    String strPath = input.nextLine();

	    File path = new File(strPath);

	    File[] folders = path.listFiles(File::isDirectory); //show directories
	    System.out.println("FOLDERS:");
	    for(File obj : folders)
        {
            System.out.println(obj);
        }

	    File[] files = path.listFiles(File::isFile); //show files
	    System.out.println("FILES");
	    for(File obj : folders)
        {
            System.out.println(obj);
        }

	    boolean success = new File(strPath + "/newDirectory").mkdir(); //creat directory
	    System.out.println("directory created successfully" + success);

	    input.close();
    }
}
