package com.br;
import java.util.Locale;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double dollar, taxDollar, realValue;

        System.out.println("What is the dollar price?");
        CurrencyConverter.dollarPrice = input.nextDouble();

        System.out.println("How many dollars will be bought");
        CurrencyConverter.dollarQuantity = input.nextDouble();

        dollar = CurrencyConverter.dollarValue(CurrencyConverter.dollarPrice, CurrencyConverter.dollarQuantity);
        System.out.println("dollar = " +dollar);

        taxDollar = CurrencyConverter.taxCalc(dollar, CurrencyConverter.IOF);
        System.out.println("tax = " +taxDollar);

        realValue = CurrencyConverter.converterCalc(dollar, taxDollar);
        System.out.println("The real price will be: " +realValue + "reais");
    }
}
