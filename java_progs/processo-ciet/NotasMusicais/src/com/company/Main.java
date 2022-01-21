package com.company;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

class Tuple {
    private String nomeAscendente;
    private String nomeDescendente;

    public Tuple(String nomeAscendente, String nomeDescendente) {
        this.nomeAscendente = nomeAscendente;
        this.nomeDescendente = nomeDescendente;
    }

    public Tuple(String nome) {
        this.nomeAscendente = nome;
        this.nomeDescendente = nome;
    }

    public String getName(Integer semitons) {
        if(semitons >= 0) {
            return nomeAscendente;
        }

        return nomeDescendente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tuple tuple = (Tuple) o;
        return Objects.equals(nomeAscendente, tuple.nomeAscendente) && Objects.equals(nomeDescendente, tuple.nomeDescendente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeAscendente, nomeDescendente);
    }
}

class Notes {
    private List<Tuple> notes;
    private Integer centralNoteIndex;
    private DecimalFormat format = new DecimalFormat("#.####");

    public Notes() {
        notes = createMusicalNotesList();
        centralNoteIndex = findCentralNote();
    }

    private List<Tuple> createMusicalNotesList() {
        ArrayList<Tuple> noteTable = new ArrayList<>();

        noteTable.add(new Tuple("C"));
        noteTable.add(new Tuple("C#", "Db"));
        noteTable.add(new Tuple("D"));
        noteTable.add(new Tuple("D#", "Eb"));
        noteTable.add(new Tuple("E"));
        noteTable.add(new Tuple("F"));
        noteTable.add(new Tuple("F#", "Gb"));
        noteTable.add(new Tuple("G"));
        noteTable.add(new Tuple("G#", "Ab"));
        noteTable.add(new Tuple("A"));
        noteTable.add(new Tuple("A#", "Bb"));
        noteTable.add(new Tuple("B"));

        return noteTable;
    }

    private Integer findCentralNote() {
        return notes.indexOf(new Tuple("A"));
    }

    public int walkRightSide(Integer semitons, Integer currentIndex) {
        int currentPosition = semitons + currentIndex;

        if(currentPosition >= notes.size()) {
            return walkRightSide(currentPosition - notes.size(), 0);
        }

        return currentPosition;
    }

    public int walkLeftSide(Integer semitons, Integer currentIndex) {
        int currentPosition = currentIndex + semitons;
        if(currentPosition < 0) {
            return walkLeftSide(currentPosition ,notes.size());
        }

        return currentPosition;
    }

    public Tuple findNoteIndex(Integer semitons) {
        int findedNoteIndex = 0;

        if(semitons >= 0) {
            findedNoteIndex = walkRightSide(semitons, centralNoteIndex);
        } else {
            findedNoteIndex = walkLeftSide(semitons, centralNoteIndex);
        }

        return notes.get(findedNoteIndex);
    }

    public Double calculaFrequenciaNota(Integer semitons) {
        final Double frequenciaNotaCentral = 440.0;
        final Double quantidadeSemiTons = 12.0;

        return Math.pow(2.0 , (Double.valueOf(semitons) / quantidadeSemiTons)) * frequenciaNotaCentral;
    }
}


public class Main {

    public static String formatStringNumber(Double number) {
        if(number == Math.floor(number)) {
            return String.format("%.0f", number);
        }

        return String.format("%.4f", number);
    }

    public static List<String> geraFrequenciaNota(Integer semitons) {
        Notes notes = new Notes();

        Tuple findedNote = notes.findNoteIndex(semitons);
        Double frequencia = notes.calculaFrequenciaNota(semitons);

        String frequenciaText = formatStringNumber(frequencia);

        List<String> result = Arrays.asList(frequenciaText, findedNote.getName(semitons));
        return result;
    }

    public static void main(String[] args) {
	    List<String> result = geraFrequenciaNota(-24);
        System.out.println(result.get(0) + ", " + result.get(1));
    }
}
