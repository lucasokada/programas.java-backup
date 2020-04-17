package com.br.Business.SalaryOperations;
import com.br.struct.Funcionario;
import java.util.List;

public class IncreaseSalary {

    public static int searchEmployeeName(String name, List<Funcionario> employee)
    {
        int i = 0;
        Integer position = null;
        boolean achou = false;

        while(achou != true && i != employee.size())
        {
            if(name.equals(employee.get(i).getName()) == true){
                achou = true;
            }

            System.out.println("achou - " + achou);
            position = i;
            i++;
        }

        if(achou == true){
            return position;
        }else{
            return -1;
        }
    }

    public static String increaseSalary(float tax, int position, List<Funcionario> employees)
    {
        float salary = employees.get(position).getSalary();
        float increaseTax = salary * tax / 100;

        salary += increaseTax;

        employees.get(position).setSalary(salary);
        return "new salary of " + employees.get(position).getName() + "= " + employees.get(position).getSalary();
    }
}
