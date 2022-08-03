package com.syntax.Taskch28And29;

import java.util.LinkedHashMap;

public class Task5 {
    /* Create a map of a building. Store floor number and it is associated company name.
    (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
     Check how many entries you have?
     Update company on a 4th floor
     Remove company on the 7th floor
     Print your map*/
    public static void main(String[] args) {

        LinkedHashMap<Integer, String> building = new LinkedHashMap<> ();
        building.put ( 1, "Google" );
        building.put ( 2, "Syntax" );
        building.put ( 3, "Apple" );
        building.put ( 4, "Microsoft" );
        building.put ( 5, "Samsung" );
        building.put ( 6, "Facebook" );
        building.put ( 7, "Chrome" );

        System.out.println (building);

        System.out.println (building.size ());

        building.replace ( 4,"Microsoft", "Tweet" );
        System.out.println ( building );

        System.out.println ("-----------");

        building.remove ( 7, "Chrome" );
        System.out.println ( building );

        //System.out.println (building.remove ( 7, "Chrome" )); // giving false why?
    }
}