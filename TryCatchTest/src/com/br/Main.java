package com.br;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {
            String[] vect = input.nextLine().split(" ");
            int posiction = input.nextInt();
            System.out.println(vect[posiction]);
        }catch (ArrayIndexOutOfBoundsException exeption){
            System.out.println("invalid position");
        }catch (InputMismatchException exeption){
            System.out.println("input error");
        }

        System.out.println("end of program");

        input.close();
    }
}
