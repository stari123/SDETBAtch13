package Replit171To194;

import java.util.ArrayList;
import java.util.List;

public class q184 {
    /* Create an array list that will hold Integer Objects:
   Add below elements to it.
       111  222   333   444   555    666
   Print first, third and fifth element from your array
   Expected Output:
           111
           333
           555    */
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<> ();
        number.add ( 111 );
        number.add ( 222 );
        number.add ( 333 );
        number.add ( 444 );
        number.add ( 555 );
        number.add ( 666 );
        System.out.println ( number.get ( 0 ) );
        System.out.println ( number.get ( 2 ) );
        System.out.println ( number.get ( 4 ) );
    }
}
