package com.br.Deposit;

import com.br.Bank;
import java.util.Scanner;

public class BankDeposit {

    Scanner input = new Scanner(System.in);

    void deposit(Bank user)
    {
        double depositValue;

        System.out.println("enter the deposit value");
        depositValue = input.nextDouble();

        if(depositValue < 0){
            System.out.println("error. Negative value");
        }else{
            accountBalance += depositValue;
        }
    }
}
