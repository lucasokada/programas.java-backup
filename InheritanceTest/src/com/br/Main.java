package com.br;

public class Main {

    public static void main(String[] args) {

        Account acc = new Account(001, "user1", 0.0);
        BusinessAccount bacc = new BusinessAccount(002, "user2", 0.0, 500.0);

        //UPCASTING -> superclass = subclass

        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(003, "user3", 0.0, 200.0);
        Account acc3 = new SavingAccounts(004, "user4", 0.0, 0.001);//Já que a conta empresarial também é uma conta, essas operações são possíveis
        //subclasse sendo atribuida na superclasse

        //DOWNCASTING -> subclass = superclass

        BusinessAccount acc4 = (BusinessAccount) acc2; //manual casting
        acc4.loan(100.0);

        if(acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount)acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }

        if(acc3 instanceof SavingAccounts){
            SavingAccounts acc5 = (SavingAccounts)acc3;
            acc5.updateBalance();
            System.out.println("update!");
        }

        acc1.withdraw(200.0);
        System.out.println("acc1 balance: " +acc1.getBalance());

        Account acc5 = new SavingAccounts(005, "user5", 1000.0, 0.01);
        acc5.withdraw(200.0);
        System.out.println("acc2 balance: " +acc5.getBalance());
    }
}
