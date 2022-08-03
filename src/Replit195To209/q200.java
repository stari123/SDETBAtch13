package Replit195To209;

import java.util.*;

public class q200 {
/*    Create A Map that will preserve an order of entry objects
     Add below pairs :
            "Street" = "Patrick ST"
            "Suite" = "265"
            "City" = "Vienna"
            "Zip" = "22180"
            "Country" = "United State"
    Print all values of from the map
    Expected Output:     Patrick ST     265    Vienna   22180    United State  */

    public static void main(String[] args) {

        LinkedHashMap<String, String> address = new LinkedHashMap<> ();

        address.put ( "Street", "Patrick ST" );
        address.put ( "Suit", "265" );
        address.put ( "City", "Vienna" );
        address.put ( "Zip", "22180" );
        address.put ( "Country", "United State" );

        System.out.println ( address );

        Collection<String> values = address.values ();
        for (String val : values) {
            System.out.print ( val+" " );
        }
        System.out.println ("----");

        // all the keys from a map in the form of Set
        //Set<String> keys=address.keySet();
        //for (String key : keys) {
            //System.out.println(key);
    }
}
