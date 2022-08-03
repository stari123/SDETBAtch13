package com.syntax.Class32;

public class ExceptionDemo4 {

    public static void main(String[] args) {
        System.out.println ( "1" );         // printed
        try {
            System.out.println ( "2" );     // printed
            System.out.println ( 10 / 0 );  // not printed

            System.out.println ( "3" );     // not printed
        } catch (Exception e) {
            System.out.println ( "4" );     // printed because exception is handled.
            System.out.println ( 10 / 0 );   // not printed
            System.out.println ( "5" );      // not printed
        } finally {
            System.out.println ( "it will always be executed" );   // printed
        }
        System.out.println ( "6" );  // can not print after finally
    }
}