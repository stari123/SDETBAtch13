package Replit171To194;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class q191 {

    /*Create an ArrayList of type boolean called listA and add below values
            (true, false, false)
    Create another array list call listB and ad all values from List A into it
    Using iterator print all values from ListB 1 by 1
    Expected Output:
            true
            false
            false  */

    public static void main(String[] args) {
        List<Boolean> listA = new ArrayList<> ();
        listA.add ( true );
        listA.add ( false );
        listA.add ( false );

        List<List<Boolean>> listB = new ArrayList<> ();
        Boolean b = listB.add ( listA );
        //System.out.println (listB);

        Iterator<List<Boolean>> iterator = listB.iterator ();
        while (iterator.hasNext ()) {
            System.out.print ( iterator.next () );
        }
    }
}   // not solved yet
