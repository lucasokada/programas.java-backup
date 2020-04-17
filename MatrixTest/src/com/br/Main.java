package com.br;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);

	    int n = input.nextInt();
	    int i, j;
	    int [][] matrix = new int [n][n]; //matrix declaration

        for(i=0; i<n; i++)
        {
            for(j=0; j<n; j++)
            {
                matrix[i][j] = input.nextInt();
            }
        }

        for(i=0; i<n; i++)
        {
            for(j=0; j<n; j++)
            {
                System.out.printf("%d ", matrix[i][j]);
            }
            System.out.println();
        }

        System.out.printf("lines: %d\n", matrix.length);
        System.out.printf("columns: %d\n", matrix[n].length);

	    input.close();
    }
}
