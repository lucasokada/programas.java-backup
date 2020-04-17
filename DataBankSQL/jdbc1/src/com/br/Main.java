package com.br;

import com.daoimpl.PersonDaoImpl;
import com.entities.Person;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /*  DATABASE CONNECTION

        Connection connection = null;

        try{
            connection = ConnectionConfiguration.getConnection();

            if(connection != null){
                System.out.println("connection established");
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            if(connection != null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }*/

        //  CREATE TABLE
       PersonDaoImpl pdi = new PersonDaoImpl();
        //pdi.createPersonTable();

        //  INSERT
       // Person person = new Person(1, "Lucas", 20);
        //pdi.insert(person);

        // SELECT ONE
        Person person1 = pdi.selectById(3);
        System.out.println(person1.getId() + "," + person1.getName() + "," + person1.getAge());

        // SELECT ALL
        /*------------------------------------
        List<Person> list = pdi.selectAll();

        for(Person x : list)
        {
            System.out.println(x.getId() + "," + x.getName() + "," + x.getAge());
        } --------------------------------------*/

        // DELETE

        //pdi.delete(1);

        // UPDATE
        Person person2 = new Person(2, "Cesar", 27);
        //pdi.insert(person2);
        pdi.update(person2, 2);
    }
}
