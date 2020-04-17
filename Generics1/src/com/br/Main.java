package com.br;

import com.br.business.ListService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ListService<String> list = new ListService<>();

        String element = input.nextLine();
        list.addListElement(element);
        list.addListElement("lucas");
        list.addListElement("cesar");
        list.addListElement("celso");
        list.addListElement("sonia");

        int size = list.listSize();

        for(int i=0; i < size; i++)
        {
            System.out.println(list.showList(i));
        }

    }
}
