package com.syntax.Class30;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Task2 {
    /* Create a map of countries with its capital that will store countries in alphabetical order.
        Print all keys and values from a country map using for each loop and iterator.
        Print all values from a country map using for each loop and iterator.      */

     //use TreeMap because order is sorted alphabetically.
    public static void main(String[] args) {
        TreeMap<String,String> countryCapitalMap=new TreeMap<>();
        countryCapitalMap.put("France","Paris");
        countryCapitalMap.put("Azerbaijan","Baku");
        countryCapitalMap.put("Pakistan","Islamabad");
        countryCapitalMap.put("Kazakhstan","Astana");

        //use entrySet to get both key and value at the same time

        //countryCapitalMap.entrySet() => a set of Entry objects
        //Entry object has a method get key to get the key and another method to get the value

        //for each loop
        for(Map.Entry<String,String> entry: countryCapitalMap.entrySet()){
           System.out.println("entry key = " + entry.getKey()+" entry value = " +entry.getValue());
            //System.out.println(entry);
        }

        //countryCapitalMap.entrySet()=>a set of Entry objects
        //entrySet().iterator() once we have the set we can get an iterator on that set
        System.out.println("***************");

        //iterator
        Iterator<Map.Entry<String,String>> iterator=countryCapitalMap.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,String> entry=iterator.next();
            //System.out.println("entry.getKey()= " + entry.getKey()+" value ="+ entry.getValue());
            System.out.println(entry);
        }
        System.out.println("***************");

        // use collection to get only the set of values. see notes
        //for each loop
        Collection<String> values=countryCapitalMap.values();
        for (String country:values
        ) {
            System.out.println("country = " + country);
        }

        System.out.println("***************");
        //iterator to get values
        Iterator<String> iter= countryCapitalMap.values().iterator();
        while (iter.hasNext()){
            System.out.println("Capitals = " + iter.next());
        }

    }
}