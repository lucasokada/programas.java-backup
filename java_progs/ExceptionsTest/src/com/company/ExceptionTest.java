package com.company;

public class ExceptionTest {
    public void method1() {
        int divisor = 0;
        int dividendo = 6;

        if(divisor == 0) {
            throw new ArithmeticException();
        } else {
            System.out.println(dividendo / divisor);
        }
    }

    public void method2() throws Exception {
        int divisor = 0;
        int dividendo = 6;

        if(divisor == 0) {
            throw new Exception();
        } else {
            System.out.println(dividendo / divisor);
        }
    }

    public void method3() throws MyException, MyException2 {
        int a = 7;
        if(a != 0) {
            throw new MyException();
        } else if (a == 7) {
            throw  new MyException2();
        }
    }
}
