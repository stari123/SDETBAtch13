package com.syntax.Taskch28And29;

import java.util.*;

public class Task7 {
    /*Create a map of Best Buy store. Place item id and item name into it.
    Example (7664847 = Printer, 7879885= TV etc )
    Retrieve all keys and values from a Best Buy map using EntrySet.*/
    public static void main(String[] args) {

       TreeMap<Integer, String> product=new TreeMap<> ();
        product.put ( 7664841, "Printer" );
        product.put ( 7664842, "Tv" );
        product.put ( 7664843, "Fridge" );
        product.put ( 7664844, "Phone" );
        product.put ( 7664845, "Laptop" );

        Set<Map.Entry<Integer, String>> set=product.entrySet (); //Entry set
        Iterator<Map.Entry<Integer, String>> iterator= set.iterator ();
         while(iterator.hasNext ()){
         Map.Entry<Integer, String> mapEntry=iterator.next();
         System.out.println (mapEntry.getKey ()+ " "+mapEntry.getValue ());
      }


    }
    }
// from gennady
    /*Set<Map.Entry<Integer,String>> entries = bestBuyStore.entrySet();
        System.out.println(entries);
                Iterator<Map.Entry<Integer,String>> iterator = entries.iterator();
        while(iterator.hasNext()){
        System.out.println(iterator.next());*/
