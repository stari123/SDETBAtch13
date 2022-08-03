package Replit171To194;

import java.util.ArrayList;
import java.util.List;

public class q185 {
    /*Create an arrayList of type Integer.
    add below values.
        111  111     111     999    999      999
    Print all the values of List 1 by 1:
    Expected Output:
            111
            111
            111
            999
            999
            999    */
    public static void main(String[] args) {
        List<Integer> number1 = new ArrayList<> ();
        number1.add ( 111 );
        number1.add ( 111 );
        number1.add ( 111 );
        number1.add ( 999 );
        number1.add ( 999 );
        number1.add ( 999 );
        System.out.println ( number1.get ( 0 ) );
        System.out.println ( number1.get ( 1 ) );
        System.out.println ( number1.get ( 2 ) );
        System.out.println ( number1.get ( 3 ) );
        System.out.println ( number1.get ( 4 ) );
        System.out.println ( number1.get ( 5 ) );
    }
}
