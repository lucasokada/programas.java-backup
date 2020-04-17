package com.br;
import java.util.Scanner;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.println("enter the array size");
        int n = input.nextInt();
        int i;
        double[] height = new double[n];
        double sum = 0, heightAverage = 0;

        System.out.println("enter the heights");

        for(i=0; i<n; i++)
        {
            height[i] = input.nextDouble();
            sum += height[i];
        }

        System.out.println("lenght = " + n + "sum = " + sum);
        heightAverage = sum / n;

        System.out.println("the average is : " +heightAverage);

        input.close();
    }
}
