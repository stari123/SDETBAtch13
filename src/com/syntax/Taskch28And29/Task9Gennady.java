package com.syntax.Taskch28And29;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Task9Gennady {
   /* from gennady
   Create a Map that will store Employee name and salary.
    Write a logic to retrieve an employee who gets the highest salary.
    Output should be in the below format
    John Smith=$100000  */
   public static void main(String[] args) {
       Map<String, Double> employee=new HashMap<> ();
       employee.put ( "Ali Alican", 50000.00 );
       employee.put ( "Veli Velican", 70000.00 );
       employee.put ( "Selo Selocan", 80000.00 );
       employee.put ( "Muho Muhocan", 45000.00 );
       //System.out.println ( "emp = " + emp );

       Double maxValue = 0.0;
       String keyMaxValue = "";
       Set<Map.Entry<String,Double>> entries = employee.entrySet();
       Iterator<Map.Entry<String,Double>> iterator = entries.iterator();
       while(iterator.hasNext()){
           Map.Entry<String, Double> it = iterator.next();
           if(it.getValue()>maxValue){
               maxValue= it.getValue();
               keyMaxValue= it.getKey();
           }
       }
       System.out.println(keyMaxValue+"=$"+maxValue);
   }
}   //question: can this logic be written using for or for each loop.
