package com.br;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(); // List<weapperType> name = new Arraylist(class that instanciates the insterface List)

        list.add(2000); //add elements in the list
        list.add(300);
        list.add(400);
        list.add(2, 50); // add the element "e" in the position "i"

        System.out.println(list.size()); //size of list
        for(Integer x : list) //for each
        {
            System.out.println(x);
        }

        list.remove("50"); //remove the element of the list
        list.remove(3); //remove the position 4 of the list

        System.out.println("size list " +list.size()); //size of list
        for(Integer x : list) //for each
        {
            System.out.println(x);
        }

        System.out.println("index:" +list.indexOf(2000)); //return the position of the element
        System.out.println("index:" +list.indexOf(2));

        //x -> x.charAt(i) == 'X' predicate
    }
}
