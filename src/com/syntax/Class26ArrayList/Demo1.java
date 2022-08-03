package com.syntax.Class26ArrayList;

import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {
        String name = "Aladin";
        String name2 = "Reza";
        String name3 = "Ahmed";
       /* int size=10;
        String [] arr=new String[size];*/

        String[] names = {"Aladin", "Reza", "Ahmed"};
        System.out.println ( names.length );
        names = new String[4];
        names[0] = "Aladin";
        names[1] = "Reza";
        names[2] = "Ahmed";
        names[3] = "Zameer";
        System.out.println ( names.length );

        System.out.println ( "---" );

        ArrayList<String> syntaxStudents = new ArrayList<> ();
        System.out.println ( syntaxStudents.size () );
        syntaxStudents.add ( "Riaz" );
        System.out.println ( syntaxStudents.size () );
        syntaxStudents.add ( "karla james bond" );
        syntaxStudents.add ( "Ivan 007" );
        System.out.println ( syntaxStudents.size () );
        System.out.println ( syntaxStudents );

        System.out.println ( "---" );

        //print even numbers between 1 and 10 using arraylist
        ArrayList<Integer> number = new ArrayList<> ();
        for (int i = 0; i < 10; i = i + 2) {
            number.add ( i );
        }
        System.out.println ( number );

        //print even numbers between 1 and 10 using arraylist
        ArrayList<Integer> number1 = new ArrayList<> ();
        for (int j = 1; j < 10; j = j + 2) {
            number1.add ( j );
        }
        System.out.println ( number1 );
    }
}

