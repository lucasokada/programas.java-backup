package com.br;
import java.util.Scanner;

public class Bank {
    private int accountNumber;
    private String accountUser;
    private double accountBalance;



    public Bank(int accountNumber, String accountUser, double accountBalance)
    {
        this.accountNumber = accountNumber;
        this.accountUser = accountUser;
        this.accountBalance = accountBalance;
    }

    public Bank(int accountNumber, String accountUser)
    {
        this.accountNumber = accountNumber;
        this.accountUser = accountUser;
    }
    //---------------------------------------
    public int getNumber()
    {
        return accountNumber;
    }
    //---------------------------------------
    public void setUser(String name)
    {
        this.accountUser = name;
    }

    public String getUser()
    {
        return accountUser;
    }
    //---------------------------------------
    public double getBalance()
    {
        return accountBalance;
    }
    //---------------------------------------

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

    void withdraw(Bank user)
    {
        double withdrawValue;

        System.out.println("enter the withdraw value");
        withdrawValue = input.nextDouble();

        if(withdrawValue < 0 || withdrawValue > accountBalance){
            System.out.println("error");
        }else{
             accountBalance -= withdrawValue;
        }
    }

    void menu(){

        System.out.println("---------------MENU---------------");
        System.out.println("1 - deposit");
        System.out.println("2 - withdraw");
        System.out.println("3 - show account informations");
        System.out.println("4 - change account username");
        System.out.println("0 - extit");
        System.out.println("-----------------------------------");
    }

    void showInformations(Bank user)
    {
        System.out.println("username: " + accountUser);
        System.out.println("account number: " + accountNumber);
        System.out.println("account balance: " + accountBalance);
    }

    void changeUsername(Bank user)
    {
        String name;
        System.out.println("change the username");
        name = input.nextLine();
        user.setUser(name);
    }
}
