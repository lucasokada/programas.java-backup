package com.br;

import business.ReadFile;
import business.StringSplit;
import entities.Employee;

import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<Employee> employees = StringSplit.Split(ReadFile.readFileDatas());
        employees.forEach(System.out::println);

        Stream<Employee> employeeStream = employees.stream();
        double sum = sum(employees);
        System.out.println(sum);
        alphabeticalOrder(employees, 20000);
    }

    public static double sum(List<Employee> list)
    {
        double sum = list.stream().
                filter(x -> x.getEmail().
                toUpperCase().
                startsWith("C")).
                mapToDouble(x -> x.getSalary()).
                sum();
        return sum;
    }

    public static void alphabeticalOrder(List<Employee> list, double salary)
    {
                list.stream().
                filter(x -> x.getSalary() > salary).
                sorted((x, y) -> x.getEmail().compareTo(y.getEmail())).
                forEach(System.out::println);
    }
}
