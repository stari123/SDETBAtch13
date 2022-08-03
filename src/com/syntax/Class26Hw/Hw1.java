package com.syntax.Class26Hw;

import java.util.ArrayList;

public class Hw1 {
      /*1.	Create an ArrayList that will store 5 names into it.
	    Find out whether the given ArrayList is empty or not?
        Check whether the specific name is present in an ArrayList or not?
        Find the size of your arrayList and print all values from that    */

    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<> (5);
        names.add ( "Dady" );
        names.add ( "Momy" );
        names.add ( "Roze" );
        names.add ( "Evin" );
        names.add ( "Kuki" );
        System.out.println (names.isEmpty ());
        System.out.println (names.contains ( "Kuki" ));
        System.out.println (names.size());
        System.out.println (names);

    }
}
