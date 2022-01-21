package com.company;

import javax.swing.table.TableStringConverter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static int minimizeBias(List<Integer> ratings) {
        List<Integer> list = new ArrayList<Integer>(ratings);
        int length = list.get(0);
        int result = 0;
        int secondIndex = 0;

        for(int i = 1; i < length - 2; i++) {
            int diff = Integer.MAX_VALUE;

            for(int j = i + 1; j < length; j++) {
                int elementsDiff = Math.abs(list.get(i) - list.get(j));
                secondIndex = j;
                diff = Math.min(elementsDiff, diff);
            }

            list.remove(secondIndex);
            length--;
            result += diff;
        }

        return result;
    }

    public static void main(String[] args) {
        int res = minimizeBias(Arrays.asList(10, 2, 5, 6, 10, 7, 6, 7, 9, 7, 7));
        System.out.println(res);
    }
}
