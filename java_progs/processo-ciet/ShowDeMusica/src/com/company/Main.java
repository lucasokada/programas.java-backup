package com.company;

public class Main {

    public static Double kilometersToMeters(Double distancia) {
        final int quilometroEmMetros = 1000;
        return distancia * quilometroEmMetros;
    }

    public static Integer retornaTempoArenaEmMilisegundos(String distancia,Integer velocidade) {
        Double distance = kilometersToMeters(Double.parseDouble(distancia));
        Double time = (distance / velocidade) * 1000;
        System.out.println(time);

        return Math.toIntExact(Math.round(time));
    }

    public static void main(String[] args) {
        Integer tempo = retornaTempoArenaEmMilisegundos("0.45", 340);
    }
}
