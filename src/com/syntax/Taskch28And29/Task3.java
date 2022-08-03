package com.syntax.Taskch28And29;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Task3 {
    /*Create a Set of cities in which you want to make sure that insertion order
    is maintained.
    Then remove any city that starts with “A”;  */

    public static void main(String[] args) {

        LinkedHashSet<String> cities = new LinkedHashSet<> ();
        cities.add ( "Houston" );
        cities.add ( "Chicago" );
        cities.add ( "New york" );
        cities.add ( "Atlanta" );
        cities.add ( "San diego" );

        //System.out.println ( cities );

        //using iterator
        Iterator<String> iterator = cities.iterator ();
        while (iterator.hasNext ()) {
            if (iterator.next ().toLowerCase ().startsWith ( "a" )) {
                iterator.remove ();
            }
        }
        System.out.println ( cities );

        //using lambda expression
        cities.removeIf ( s -> s.toLowerCase ().startsWith ( "a" ) );
        System.out.println ( cities );
    }
}