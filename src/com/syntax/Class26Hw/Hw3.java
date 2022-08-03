package com.syntax.Class26Hw;

import java.util.ArrayList;

public class Hw3 {
    //3	Create an arrayList of words. Remove every word that ends with “e”.

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<> ();
        words.add ( "hello" );
        words.add ( "welcome" );
        words.add ( "come" );
        words.add ( "Play" );

        for (int i = 0; i < words.size (); i++) {
            if (words.get ( i ).endsWith ( "e" )) {
                words.remove ( words.get ( i ) );
                i--;        // i don't understand this
            }
        }
        System.out.println ( "words=" + words );
        System.out.println ( "------------" );

        // Lamda Expression
        words.removeIf ( nat -> nat.endsWith ( "e" ) );   // i don't understand this
        System.out.println ( "words = " + words );
    }
}