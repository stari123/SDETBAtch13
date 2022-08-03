package com.syntax.Taskch28And29;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Task8 {
    /*  sol from gennady
    Create a Person class with following private fields: name, lastName, age, salary.
    Variables should be initialized through constructor.
    Inside the class also create a method to print user details.
    In Test Class create a Map that will store key in ascending order.
    In that map store personId and a Person Object. Print each object details.*/

    public static void main(String[] args) {

        Person person = new Person("Gennadiy","Babayev",36,4000.0);
        Person person1 = new Person("Johnny","Depp",59,2000000.0);
        Person person2 = new Person("Cate","Blanchett",53,1000000.0);
        Person person3 = new Person("Natalie","Portman",41,300000.0);

        TreeMap<Integer,Person> mapPerson = new TreeMap<>();
        mapPerson.put(214356,person);
        mapPerson.put(1425,person1);
        mapPerson.put(6458,person2);
        mapPerson.put(8795,person3);

        Set<Map.Entry<Integer,Person>> entries = mapPerson.entrySet();

        Iterator<Map.Entry<Integer,Person>> iterator = entries.iterator();
        while(iterator.hasNext()){
            Map.Entry<Integer,Person> it = iterator.next();
            System.out.print("ID = "+it.getKey()+" ");
            it.getValue().print();
        }
    }
}

class Person {
    private String name;
    private String lastName;
    private Integer age;
    private Double salary;

    public Person(String name, String lastName, Integer age, Double salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }
    public void print(){
        System.out.println("Name = "+name+". LastName = "+lastName+". Age = "+age+". Salary = "+salary+".");
    }


}


