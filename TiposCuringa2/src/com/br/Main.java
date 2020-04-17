package com.br;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    List<Integer> intList = Arrays.asList(2,3,4,7,8,40);
	    List<Double> doubleList = Arrays.asList(4.6, 4.3, 8.655);
        List<Object> objList = new ArrayList<>();

        copy(intList, objList);
        copy(doubleList, objList);

        printList(objList);

        /*List<?> list = new ArrayList<>();
        list.add(5); erro. não é possível adicionar elementos em uma lista sem tipo*/
    }

    public static void copy(List<? extends Number> sourceList, List<? super Object> destinationList)
    {
        for(Number number : sourceList)
        {
            destinationList.add(number);
        }
    }

    public static void printList(List<?> list)
    {
        for(Object obj : list)
        {
            System.out.print(obj + ",");
        }
        System.out.println();
    }
}
