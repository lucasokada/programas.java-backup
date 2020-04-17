package com.br.Business;
import com.br.struct.Funcionario;
import java.util.Scanner;
import java.util.List;

public class GerarFuncionarios {
    private static Scanner input = new Scanner(System.in);

    public static int employeesNumber()
    {
        int number;

        number = input.nextInt();

        return number;
    }

    public static void returnEmployees(int employeesNumber, List<Funcionario> employee)
    {
        int i = 0;
        String id, name;
        float salary;

        while(i < employeesNumber){
            input.nextLine();
            System.out.println("enter the id number");
            id = input.nextLine();

            System.out.println("enter the name");
            name = input.nextLine();

            System.out.println("enter the initial salary");
            salary = input.nextFloat();

            employee.add(new Funcionario(id, name, salary)); //adiciona novo nó instanciado
            i++;
        }
    }

    public static void allemployees(List<Funcionario> employee)
    {
        int i;

        for(i=0; i<employee.size(); i++)
        {
            System.out.println("name: " +employee.get(i).getName());
            System.out.println("ID: " +employee.get(i).getIdentificationNumber());
            System.out.println("salary: " + employee.get(i).getSalary());
            System.out.println("-------------------------");
        }

    }
}


