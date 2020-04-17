package com.br;

public class SavingAccounts extends Account{
    private Double interestRate;

    public SavingAccounts(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance()
    {
        balance += balance * interestRate;
    }

    //sobreposição
    @Override
    public void withdraw(double amount)
    {
        balance -= amount;
    }
}
