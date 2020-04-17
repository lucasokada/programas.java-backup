package com.br;

//  SUPER CLASSE!!
public class Account {

    private Integer number;
    private String holder;
    protected Double balance;

    public Account(Integer number, String holder, Double balance)
    {
        this.balance = balance;
        this.holder = holder;
        this.number = number;
    }

    public Integer getNumber() { return number; }
    public void setNumber(Integer number1) { this.number = number1; }

    public String getHolder() { return  holder; }
    public void setHolder() { this.holder = holder; }

    public Double getBalance() { return balance; }

    public void withdraw(double amount)
    {
        balance -= amount;
    }

    public void deposit(double amount)
    {
        balance += amount;
    }
}
