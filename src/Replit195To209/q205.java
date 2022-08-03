package Replit195To209;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class q205 {
   /* Create a HashMap of String.
    Add below pair to it .
    "Street" = "Patrick ST"
        "Suite" = "265"
        "City" = "Vienna"
        "Zip" = "22180"
        "Country" = "United State"
    Print all the values in upper case using entrySet
    Expected Output:
            265   22180    PATRICK ST    UNITED STATE    VIENNA     */
   public static void main(String[] args) {
       LinkedHashMap<String, String> address = new LinkedHashMap<> ();
       address.put ( "Suit", "265" );
       address.put ( "Zip", "22180" );
       address.put ( "Street", "Patrick ST" );
       address.put ( "Country", "United State" );
       address.put ( "City", "Vienna" );


       //System.out.println ( address );

       Iterator<Map.Entry<String, String>> iterator = address.entrySet ().iterator ();
       while (iterator.hasNext ()) {
           Map.Entry<String, String> entry = iterator.next ();

           System.out.print ( entry.getValue ().toUpperCase ()+" " );

       }
   }
}
