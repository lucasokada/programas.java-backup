package com.br;
import com.br.Business.SalaryOperations.IncreaseSalary;
import com.br.struct.Funcionario;
import com.br.Business.GerarFuncionarios;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int number;
        int position;
        String option;
        float tax;
        String name;
        List<Funcionario> employees = new ArrayList<>();

        System.out.println("enter the number of employees");
        number = GerarFuncionarios.employeesNumber();

        GerarFuncionarios.returnEmployees(number, employees);
        GerarFuncionarios.allemployees(employees);

        do {
            Funcionario.menu();
            option = input.nextLine();
            int result;
            result = Integer.parseInt(option);

            switch (result){
                case 1:
                    GerarFuncionarios.allemployees(employees);
                    break;

                case 2:
                    System.out.println("enter the desired name");
                    name = input.nextLine();
                    position = IncreaseSalary.searchEmployeeName(name, employees);
                    System.out.println("position: " +position);

                    if(position != -1){
                        System.out.println("enter the increment tax");
                        tax = input.nextFloat();
                        System.out.println(IncreaseSalary.increaseSalary(tax, position, employees));
                    }
                    break;

                default:
                    break;
            }
        }while(Integer.parseInt(option) != -1 || Integer.parseInt(option) > 2);

    }
}
