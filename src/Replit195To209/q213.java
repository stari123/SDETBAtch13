package Replit195To209;

import java.util.Scanner;

public class q213 {
   /* Create a method that will do temperature check.
   Anytime user passes temperature that is below 32 method should throw an Exception
   saying "It is freezing"
    In Main method call the method and handle an Exception
    Expected Output:
    java.lang.RuntimeException: It is freezing     */

    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in );
        System.out.println ( "enter temperature" );
        int temp = input.nextInt ();

        if (temp < 32) {
            System.out.println ( "it is freezing" );
        } else {
            System.out.println ( "ok" );
        }

    }
}