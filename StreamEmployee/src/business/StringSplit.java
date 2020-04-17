package business;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;

public class StringSplit {

    public static List<Employee> Split(List<String> str)
    {
        int i = 0;
        List<Employee> list = new ArrayList<>();

        while(i < str.size())
        {
            String[] arr = str.get(i).split(",");
            list.add(new Employee(arr[0], arr[1], Double.valueOf(arr[2])));
            i++;
        }

        return list;
    }
}
