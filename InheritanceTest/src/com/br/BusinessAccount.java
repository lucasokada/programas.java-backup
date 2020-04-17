package com.br;

public class BusinessAccount extends Account{

    private double loanLimit;

    public BusinessAccount(Integer number, String holder, Double balance, double loanLimit) {
        super(number, holder, balance); //superclass (Account)
        this.loanLimit = loanLimit;
    }

    public double getLoanLimit() { return loanLimit; }
    public void setLoanLimit(double loanLimit) { this.loanLimit = loanLimit; }

    public void loan(double amount)
    {
        if(amount <= loanLimit){
            deposit(amount);
        }
    }

    //utilizando super() na sobreposição
    @Override
    public void withdraw(double amount)
    {
        super.withdraw(amount);
        balance -= 2.0;
    }
}
//in that case, BusinessAccount is a subclass
