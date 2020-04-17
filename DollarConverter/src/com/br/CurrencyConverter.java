package com.br;

import java.util.Scanner;

public final class CurrencyConverter {
    Scanner input = new Scanner(System.in);

    public static double dollarPrice;
    public static double dollarQuantity;
    public static final double IOF = 0.006;

    public static double dollarValue(double dollarPrice, double dolllarQuantity)
    {
        double valueInDollar;

        valueInDollar = dollarPrice * dolllarQuantity;

        return  valueInDollar;
    }

    public static double taxCalc(double valueInDollar, double IOF)
    {
        double tax;

        tax = valueInDollar * IOF;

        return tax;
    }

    public static double converterCalc(double valueInDollar, double tax)
    {
        double realValue;

        realValue = valueInDollar + tax;

        return realValue;
    }
}
