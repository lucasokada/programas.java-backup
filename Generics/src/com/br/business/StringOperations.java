package com.br.business;

public class StringOperations {
    public static double stringToDouble(String number)
    {
        return Double.parseDouble(number);
    }

    public static String[] splitString(String str)
    {
        String[] array;

        array = str.split(",");

        return array;
    }
}
