package com.syntax.Class26Hw;

import java.util.ArrayList;
import java.util.Iterator;

public class Hw5 {
    // 5. Create an arrayList of even numbers from 1 to 50.
    // Remove any number that is divisible by 5 from that arrayList.

    public static void main(String[] args) {
        ArrayList<Integer> evenNumbers = new ArrayList<> ();
        for (int i = 0; i <= 50; i += 2) {
            evenNumbers.add ( i );
        }
        System.out.println ( evenNumbers );

        for (int a = 0; a < evenNumbers.size (); a++) {
            if (evenNumbers.get ( a ) % 5 == 0) evenNumbers.remove ( a );
        }
        System.out.println ( evenNumbers );

        //or use iterator

        Iterator<Integer> iterator = evenNumbers.iterator ();
        while (iterator.hasNext ()) {
            if (iterator.next () % 5 == 0) {
                iterator.remove ();
            }
        }
        System.out.println ( evenNumbers );

        // use lamda Expression

        evenNumbers.removeIf ( num -> num % 5 == 0 );
        System.out.println ( evenNumbers );
    }
}