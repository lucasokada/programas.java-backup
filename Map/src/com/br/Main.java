package com.br;

import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
	    Map<String, String> test = new TreeMap<>();

	    test.put("username", "Lucas"); //key , value
        test.put("email", "lucas@gmail.com");

        for(String k : test.keySet())
        {
            System.out.println(k + ": " + test.get(k));
        }
    }
}
