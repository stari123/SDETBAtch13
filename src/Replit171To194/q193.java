package Replit171To194;

import java.util.ArrayList;
import java.util.List;

public class q193 {
   /* Create Linked List that will store Integer Objects
    Add the values below:
            111    222   333    444    555    666
    Create a logic to calculate sum of the all the values in list.
    Print the result of sum.
    Expected Output:
    Result of sum is 2331  */

    public static void main(String[] args) {
        List<Integer> num = new ArrayList<> ();
        num.add ( 111 );
        num.add ( 222 );
        num.add ( 333 );
        num.add ( 444 );
        num.add ( 555 );
        num.add ( 666 );
        //System.out.println ( num );

        Integer sum = 0;
        for (Integer i:num )
            sum+=i;
        System.out.println ( "Result of sum is " +sum );
        }
    }

