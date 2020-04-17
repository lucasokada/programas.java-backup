package com.br.util;

public class IntegerUtil {

    public static int convertStringToInt(String number){
        int convertedValue;

        try{
            convertedValue = Integer.parseInt(number);
        } catch (NumberFormatException ex){
            System.out.println("Erro ao converter valor");
            convertedValue = -1;
        }

        return  convertedValue;
    }
}
