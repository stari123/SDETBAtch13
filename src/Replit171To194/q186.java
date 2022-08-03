package Replit171To194;

import java.util.ArrayList;
import java.util.List;

public class q186 {
    /*Create an Arraylist of type Integer.
    Add below elements to it.
        111     222    333   444   555   666
    Print the ArrayList.
    remove all the elements.
    Print the Arraylist.
    Expected Output:
            [111, 222, 333, 444, 555, 666]
            []     */
    public static void main(String[] args) {
        List<Integer> number2 = new ArrayList<> ();
        number2.add ( 111 );
        number2.add ( 222 );
        number2.add ( 333 );
        number2.add ( 444 );
        number2.add ( 555 );
        number2.add ( 666 );
        System.out.println ( number2 );
        number2.clear ();
        System.out.println ( number2 );
    }
}
