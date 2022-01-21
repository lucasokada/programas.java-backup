package com.company;

public class Main {

    public static String numberToString(Number number) {
        if(number.doubleValue() == Math.floor(number.doubleValue())) {
            return String.valueOf(number.intValue());
        }

        return String.valueOf(number.doubleValue());
    }

    public static String tamanhoSetorBusca(Integer areaMaior,Integer areaMenor) {
        final double quantidadeSetores = 8.0;
        Double areaProcurada = (Double.valueOf(areaMaior) - Double.valueOf(areaMenor)) / quantidadeSetores;

        return numberToString(areaProcurada);
    }

    public static void main(String[] args) {
        System.out.println("Teste");
    }
}
