package com.syntax.Taskch28And29;

import java.util.*;

public class Task6$1 {

    /* from gennady
    Create a map of countries with its capital that will store countries in alphabetical order.
    Print all keys and values from a country map using for each loop and iterator.
    Print all values from a country map using for each loop and iterator.*/

    public static void main(String[] args) {
        TreeMap<String, String> countriesCapitals = new TreeMap<>();
        countriesCapitals.put("Maldives", "Male");
        countriesCapitals.put("Mexico","Mexico City");
        countriesCapitals.put("France","Paris");
        countriesCapitals.put("Ukraine", "Kyiv");
        countriesCapitals.put("Ethiopia", "Addis Ababa");
        countriesCapitals.put("Netherlands","Amsterdam");


        Set<Map.Entry<String, String>> entries = countriesCapitals.entrySet();
        Iterator<Map.Entry<String, String>> iterator =entries.iterator();
        System.out.println("============ Iterator Keys & Values =============");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("========== For Each Loop Keys & Values ==========");
        for(Map.Entry<String, String> entry : entries){
            System.out.println(entry);
        }
        System.out.println("============ Iterator Values =============");
        Collection<String> valuesCountries =  countriesCapitals.values();

        Iterator<String> iterator1 = valuesCountries.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
        System.out.println("========== For Each Loop Values ==========");
        for(String str : valuesCountries){
            System.out.println(str);
        }
    }
}
