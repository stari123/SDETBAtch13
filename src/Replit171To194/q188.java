package Replit171To194;

import java.util.Scanner;
import java.util.ArrayList;

public class q188 {

    /* Using Scanner class add 5 elements into ArrayList and then
    print all elements from that ArrayList all in 1 line
     Numbers in:
             4    62    8      5      4
     Expected Output:
             4 62 8 5 4      */
    public static void main(String[] args) {
        Scanner scan = new Scanner ( System.in );
        System.out.println ( "Enter a number" );

        ArrayList<Integer> numbers = new ArrayList<> ();

        for (int i = 0; i <= 4; i++) {
            numbers.add ( scan.nextInt () );
        }
        System.out.println ( numbers + " " );
        //System.out.println ( numbers.get ( i ) );
    }  //not solved yet
}


