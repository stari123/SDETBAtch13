package com.syntax.Taskch28And29;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Task1 {
    //How can you remove all duplicates from ArrayList?
    public static void main(String[] args) {

        List<String> aList = new ArrayList<> ();
        aList.add ( "John" );
        aList.add ( "Jane" );
        aList.add ( "James" );
        aList.add ( "Jasmine" );
        aList.add ( "Jane" );
        aList.add ( "James" );
        System.out.println ( aList );

        // convert Arraylist to Hashlist, because HashSet does not allow dublicates.
        List<String> alist= new ArrayList<>(new HashSet<> (aList));
        System.out.println(alist);


        //aList.remove (  "James");
        //aList.remove ( "Jane" );
        //System.out.println (  aList );
    }
}