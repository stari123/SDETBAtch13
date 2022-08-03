package com.syntax.Taskch28And29;

import java.util.*;

public class Task6 {
    /*Create a map of countries with its capital that will store countries in alphabetical order.
    Print all keys and values from a country map using for each loop and iterator.
    Print all values from a country map using for each loop and iterator.*/

    public static void main(String[] args) {

        TreeMap<String, String> country = new TreeMap<> ();
        country.put ( "Enland", "London" );
        country.put ( "Usa", "Washington" );
        country.put ( "Germany", "Berlin" );
        country.put ( "France", "Paris" );
        country.put ( "Italy", "Rome" );

        //System.out.println(capitol);


        Iterator<Map.Entry<String, String>> iterator = country.entrySet ().iterator ();
        Map.Entry<String, String> keyValue = null;
        while (iterator.hasNext ()) {
            keyValue = iterator.next ();
            System.out.println ( keyValue.getKey () + " " + keyValue.getValue () );
        }
        System.out.println ("------");

        Iterator<Map.Entry<String, String>> iterator1 = country.entrySet ().iterator ();
        Map.Entry<String, String> value = null;
        while (iterator1.hasNext ()) {
            value = iterator1.next ();
            System.out.println ( value.getValue () );

        }  // for each loop not done yet
    }
}