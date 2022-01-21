package com.company;

import java.util.ArrayList;

public class Main {

    public static boolean findIngressoInGuiche(Integer numeroIngresso, ArrayList<Integer> guiche) {
        return guiche.contains(numeroIngresso);
    }

    public static ArrayList<Integer> buildIngressos(int length ,int lastValueOfGuiche) {
        ArrayList<Integer> ingressosGuiche = new ArrayList<>(length);
        int element = lastValueOfGuiche;
        for(int i = 0; i < length; i++) {
            element++;
            ingressosGuiche.add(element);
        }

        return ingressosGuiche;
    }

    public static Integer buildGuicheUntilFindIngresso(Integer numeroIngresso) {
        boolean findIngresso = false;
        int numeroGuiche = 1;
        int lastValueOfGuiche = 0;
        int arrayLength = 1;
        ArrayList<Integer> ingressosGuiche;

        if(numeroIngresso > 0) {
            while (!findIngresso) {
                ingressosGuiche = buildIngressos(arrayLength, lastValueOfGuiche);
                findIngresso = findIngressoInGuiche(numeroIngresso, ingressosGuiche);
                lastValueOfGuiche = ingressosGuiche.get(ingressosGuiche.size() - 1);

                if (!findIngresso) {
                    arrayLength = 2 * numeroGuiche + 1;
                    numeroGuiche++;
                }
            }
        } else {
            numeroGuiche = 0;
        }

        return numeroGuiche;
    }

    public static Integer retornaGuicheIngresso(Integer ingressoNumero) {
        return buildGuicheUntilFindIngresso(ingressoNumero);
    }

    public static void main(String[] args) {
        Integer result = buildGuicheUntilFindIngresso(0);
        System.out.println(result);
    }
}
