package com.company;

class Graph {
    int rows;
    int columns;
    int distanciasPercorridas[][];

    public Graph() {
        buildGraph();
    }

    private void buildGraph() {
        rows = columns = 7;
        distanciasPercorridas = new int[][]{
                {0, 500, 500, 1000, 500, 250, 750},
                {500, 0, 500, 1000, 500, 750, 1250},
                {500, 500, 0, 500, 500, 750, 1250},
                {1000, 1000, 500, 0, 500, 750, 750},
                {500, 500, 500, 500, 0, 250, 750},
                {250, 750, 750, 750, 250, 0, 500},
                {750, 1250, 1250, 750, 750, 500, 0}
        };
    }
}

public class Main {

    public static int calculaDistanciaDosEnsaios(Graph graph) {
        int distanciaTotal = 0;
        for(int i = 0; i < graph.rows - 1; i++) {
            for(int j = 0; j < graph.columns - 1; j++) {
                distanciaTotal += graph.distanciasPercorridas[i][j];
            }
        }

        return distanciaTotal;
    }

    public static int calculaDistanciaShow(Graph graph) {
        int distanciaTotal = 0;
        int row = graph.rows - 1;

        for(int i = 0; i < graph.columns; i++) {
            distanciaTotal += graph.distanciasPercorridas[row][i];
        }

        return distanciaTotal;
    }

    public static int metrosToQuilometros(int distancia) {
        return distancia / 1000;
    }

    public static Integer calculaDistanciaBandaPercorre(Integer numeroRodadaEnsaios,Integer numeroShows) {
        Graph graph = new Graph();
        int distanciaTotal = 0;

        for(int i = 0; i < numeroRodadaEnsaios; i++) {
            distanciaTotal += calculaDistanciaDosEnsaios(graph);
        }

        for(int i = 0; i < numeroShows; i++) {
            distanciaTotal += calculaDistanciaShow(graph);
        }

        return distanciaTotal * 2;
    }

    public static void main(String[] args) {
        System.out.println(calculaDistanciaBandaPercorre(1, 1));
    }
}
