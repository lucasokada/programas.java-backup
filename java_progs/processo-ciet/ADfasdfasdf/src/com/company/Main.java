package com.company;

public class Main {

    public static void main(String[] args) {
        int[] array1 = new int[] {22, 5, 18, 7, 1, 10, 2, 7, 3, 6, 4, 20};
        int index1 = findIndex(array1);
        System.out.println(index1);

        int[] array2 = new int[] {15, 5, 7, 8, 10, 2, 9, 1, 4, 4, 2, 7, 13, 2, 3};
        int index2 = findIndex2(array2, -1, array2.length / 2);
        System.out.println(index2);
    }

    public static int findIndex(int[] array) {
        int index = -1;
        int i = 0;

        while(index == -1) {
            int somaEsquerdaValue = somaEsquerda(array, i);
            int somaDireitaValue = somaDireita(array, i);

            index = somaDireitaValue == somaEsquerdaValue ? i : -1;
            i++;
        }

        return index;
    }

    public static int findIndex2(int[] array, int index, int i) {
        if(index == -1) {
            int somaEsquerdaValue = somaEsquerda(array, i);
            int somaDireitaValue = somaDireita(array, i);

            index = somaDireitaValue == somaEsquerdaValue ? i : -1;
            findIndex2(array, index, i / 2);
        }

        return index;
    }

    public static int somaDireita(int[] array, int beginIndex) {
        int soma = 0;

        for(int i = beginIndex; i < array.length; i++) {
            soma += array[i];
        }

        return soma;
    }

    public static int somaEsquerda(int[] array, int beginIndex) {
        int soma = 0;

        for(int i = beginIndex; i >= 0; i--) {
            soma += array[i];
        }

        return soma;
    }
}
