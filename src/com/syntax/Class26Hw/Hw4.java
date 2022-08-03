package com.syntax.Class26Hw;

import java.util.ArrayList;

public class Hw4 {
    //4.Create an arrayList of drinks. If any drink has letter “a” or “e”
    // replace it with water.

    public static void main(String[] args) {
        ArrayList<String> drinks = new ArrayList<> ();
        drinks.add ( "coke" );
        drinks.add ( "ayran" );
        drinks.add ( "soda" );
        drinks.add ( "Milk" );

        for (int i = 0; i < drinks.size (); i++) {
            if (drinks.get ( i ).contains ( "a" ) || drinks.get ( i ).contains ( "e" )) {
                drinks.remove ( i );
                drinks.add ( i, "water" );

                System.out.println ( drinks.get(i) +" ");  //problem here, where is milk?
            }
        }
        System.out.println ( drinks );

        //or use set
        for (int i = 0; i < drinks.size (); i++) {
            if (drinks.get ( i ).contains ( "a" ) || drinks.get ( i ).contains ( "e" )) {
                drinks.set ( i, "Water" ); //replaced
            }
        }
    }
}