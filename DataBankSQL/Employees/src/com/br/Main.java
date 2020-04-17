package com.br;

import java.util.*;

import com.br.domain.EmployeeTypes.*;
import com.br.domain.entities.Employees;
import db.impl.DatabaseConnectionVerify;
import db.impl.operations.DatabaseTableCreate;
import db.impl.operations.DeleteDB;
import db.impl.operations.InsertDB;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int option;

        List<Employees> employee = new ArrayList<>();
        int i = 0;
        DatabaseConnectionVerify.verifyConnectionDb();
        createTableMain();

        do{
            menu();
            System.out.println("enter the option");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option){
                case 1:
                    System.out.println("enter the name");
                    String name = scanner.nextLine();
                    System.out.println("enter the salary");
                    double salary = scanner.nextDouble();
                    System.out.println("enter the Office");
                    officeMenu();
                    int officeOption = scanner.nextInt();

                    switch (officeOption) {
                        case 1:
                            employee.add(new Employees(name, salary, new Date(), new Worker(1000.0, 2500.0)));
                            break;
                        case 2:
                            employee.add(new Employees(name, salary, new Date(), new InCharge(2500.0, 3500.0)));
                            break;
                        case 3:
                            employee.add(new Employees(name, salary, new Date(), new Supervisor(3500.0, 5000.0)));
                            break;
                        case 4:
                            employee.add(new Employees(name, salary, new Date(), new Manager(5000.0, 7500.0)));
                            break;
                        case 5:
                            employee.add(new Employees(name, salary, new Date(), new Director(7500.0, 10000.0)));
                            break;
                        default:
                            break;
                    }
                    insertInDataBase(employee.get(i));
                    i++;
                    break;

                default:
                    break;

            }

        }while(option != -1);
    }

    public static void createTableMain()
    {
        try {
            DatabaseTableCreate.createTable();
            System.out.println("table created");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void insertInDataBase(Employees employee)
    {
        try {
            InsertDB.insert(employee);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void deleteInDataBase(String name)
    {
        try {
            DeleteDB.delete(name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void menu()
    {
        System.out.println("---------------------------MENU----------------------------");
        System.out.println("1 - insert");
        System.out.println("2 - delete");
        System.out.println("-----------------------------------------------------------");
    }

    public static void officeMenu()
    {
        System.out.println("------------------------OFFICE MENU-------------------------");
        System.out.println("1 - Worker");
        System.out.println("2 - In Charge");
        System.out.println("3 - Supervisor");
        System.out.println("4 - Manager");
        System.out.println("5 - Director");
        System.out.println("------------------------------------------------------------");
    }
}
