package Replit195To209;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class q202 {
    /* Create Map in which we want to store keys in Ascending order
     Add the below values
 1 item = apple
 2 item = banana
 3 item = pear
 4 item = tomato
 5 item = mango
 6 item: kiwi
     Extract all keys and its values and print them in the format below:
     Expected Output:
     Key is 1 item and values is apple
     Key is 2 item and values is banana
     Key is 3 item and values is pear
     Key is 4 item and values is tomato
     Key is 5 item and values is mango
     Key is 6 item and values is kiwi*/
    public static void main(String[] args) {

        TreeMap<String, String> fruits = new TreeMap<> ();
        fruits.put ( "1 item", "apple" );
        fruits.put ( "2 item", "banana" );
        fruits.put ( "3 item", "pear" );
        fruits.put ( "4 item", "tomato" );
        fruits.put ( "5 item", "mango" );
        fruits.put ( "6 item", "kiwi" );

        System.out.println ( fruits );

        Set<Map.Entry<String, String>> entries = fruits.entrySet ();
        for (Map.Entry<String, String> entry : entries) {

            System.out.println ( "Key is "+entry.getKey () +" and " +"Value is "+ entry.getValue () );
        }
    }
}


       



