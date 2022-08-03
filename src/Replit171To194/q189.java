package Replit171To194;

import java.util.LinkedList;
import java.util.List;

public class q189 {
   /* Create a Linked List that will store Integer Objects from 50-100.
    Once Linked List is created remove all numbers that are not divisible by 3.
    Print Linked List
    Expected Output
[51, 54, 57, 60, 63, 66, 69, 72, 75, 78, 81, 84, 87, 90, 93, 96, 99]  */

    public static void main(String[] args) {
        List<Integer> numbers = new LinkedList<> ();
        for (Integer i = 50; i <= 100; i++) {
            numbers.add ( i );
            if (i % 3 != 0) {
                numbers.remove ( i );
            }
        }
        System.out.println ( numbers );
    }
}



