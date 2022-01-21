package com.company;

public class Main {

    public static void main(String[] args) {
        ExceptionTest et = new ExceptionTest();

        try {
            et.method1();
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
//            e.printStackTrace();
        }


        try {
            et.method3();
        } catch (MyException e) {
            e.printStackTrace();
        } catch (MyException2 e) {
            e.printStackTrace();
        }
    }
}
