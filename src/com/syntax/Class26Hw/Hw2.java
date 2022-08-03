package com.syntax.Class26Hw;

import java.util.ArrayList;
import java.util.Iterator;

public class Hw2 {
    //2.Create an arraylist of cars and retrieve all the values
    // using 3 different ways.

    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<> ();
        cars.add ( "toyota" );
        cars.add ( "honda" );
        cars.add ( "mazda" );


      //1 st way of retrieving all the values is enhanced for loop (for each loop)
        for (String c : cars) {
            System.out.print ( c + " " );  //Best way to print things
        }
        System.out.println("--------------");

        //2 st way of retrieving all the values is
        for (int i = 0; i < cars.size (); i++) {
            System.out.print ( cars.get ( i )+ " " );
        }
        System.out.println("--------------");

        System.out.println ( cars );

        System.out.println("--------------");

        Iterator<String> iter = cars.iterator ();
        while (iter.hasNext ()) {
            System.out.print ( iter.next ()+ " " );
        }
    }
}