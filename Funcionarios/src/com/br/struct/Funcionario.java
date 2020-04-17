package com.br.struct;


public class Funcionario {

    private String identificationNumber;
    private String name;
    private float salary;

    public String getIdentificationNumber() {return identificationNumber;}
    //public void setId(String id) {this.identificationNumber = id;}

    public String getName() {return name;}
    //public void setName(String name) {this.name = name;}

    public float getSalary() {return salary;}
    public void setSalary(float salary1) {this.salary = salary1;}

    public Funcionario(String idNumber, String name, float salary)
    {
        this.identificationNumber = idNumber;
        this.name = name;
        this.salary = salary;
    }

    public static void menu()
    {
        System.out.println("-------------menu-------------");
        System.out.println("1- show employees informations");
        System.out.println("2 - increase salary");
        System.out.println("------------------------------");
    }
}
