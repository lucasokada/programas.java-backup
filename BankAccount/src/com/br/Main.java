package com.br;
import com.br.util.IntegerUtil;

import java.util.Scanner;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Bank user1 = null;
        int number;
        String name;
        double balance = 0;
        String option;
        int choice = 1;

        System.out.println("enter the account number:");
        number = IntegerUtil.convertStringToInt(input.nextLine());

        System.out.println("enter the account user name:");
        name = input.nextLine();

        System.out.println("is there a initial deposit?(y/n)");
        option = input.nextLine();

        switch (option){
            case "y":
                System.out.println("enter the initial balance:");
                balance = input.nextDouble();
                user1 = new Bank(number, name, balance);
                break;
            case "n":
                user1 = new Bank(number, name);
                break;
            default:
                System.out.println("that option doesnt exist");
                choice = 0;
                break;
        }

        while(choice != 0){

            user1.menu();
            choice = input.nextInt();

            switch (choice){
                case 1:
                    user1.deposit(user1);
                    break;
                case 2:
                    user1.withdraw(user1);
                    break;
                case 3:
                    user1.showInformations(user1);
                    break;
                case 4:
                    user1.changeUsername(user1);
                    break;
                default:
                    break;
            }
        }
    }
}
