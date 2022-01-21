package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<BurgerBuilder> burgerList = new ArrayList<>();
        burgerList.add(new CheeseBurger());
        burgerList.add(new CheeseBurger());
        burgerList.add(new Hamburger());
        burgerList.add(new CheeseBurger());
        burgerList.add(new Hamburger());

        for(BurgerBuilder burger : burgerList) {
            System.out.println(burger.toString());
        }
    }
}
