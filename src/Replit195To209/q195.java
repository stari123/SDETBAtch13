package Replit195To209;

import java.util.HashSet;
import java.util.Iterator;

public class q195 {
    /*Create the HashSet with list of Integers add the below numbers for the list
        111        111        111        999        999        999
    Print elements one by one.
            Expected Output
            999        111    */
    public static void main(String[] args) {

        HashSet<Integer> numbers = new HashSet<> ();
        numbers.add ( 111 );
        numbers.add ( 111 );
        numbers.add ( 111 );
        numbers.add ( 999 );
        numbers.add ( 999 );
        numbers.add ( 999 );
        //System.out.println (numbers);

        Iterator<Integer> it = numbers.iterator();
        while(it.hasNext()) {
            System.out.println ( it.next () );

        }
    }
}