package com.syntax.Taskch28And29;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Task2 {
    /*Create a Set collection in which you need to add names of the countries.
    In this set we want all objects to be sorted in alphabetical order.
        Using 2 different ways retrieve all elements from set.  */
    public static void main(String[] args) {

        Set<String> countries = new TreeSet<> ();
        countries.add ( "france" );
        countries.add ( "italy" );
        countries.add ( "germany" );
        countries.add ( "sweden" );
        countries.add ( "usa" );

        //first way
        System.out.println ( countries );

        //second way
        for (String country : countries) {
            System.out.println ( country + " " );
        }
        System.out.println ( "----------" );

        //third way
        Iterator<String> iterator = countries.iterator ();
        while (iterator.hasNext ()) {
            System.out.println ( iterator.next () + " " );
        }
    }
}


