package Replit195To209;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class q203 {
 /*   Create HashMap, add values as below
    map.put("mango", 10);
    map.put("apple", 30);
    map.put("orange", 20);
    map.put("mango", 40);
    map.put("mango", 40);
    Using iterator retrieve all keys and values in the format below:
    Expected Output:
    Key = orange and value = 20
    Key = apple and value = 30
    Key = mango and value = 40  */

    public static void main(String[] args) {

        HashMap<String, Integer> fruit1 = new HashMap<> ();
        fruit1.put ( "mango", 10 );
        fruit1.put ( "apple", 30 );
        fruit1.put ( "orange", 20 );
        fruit1.put ( "mango", 40 );
        fruit1.put ( "mango", 40 );
        //System.out.println ( fruit1 );

        Iterator<Map.Entry<String, Integer>> iterator = fruit1.entrySet ().iterator ();
        while (iterator.hasNext ()) {
            Map.Entry<String, Integer> entry = iterator.next ();
            System.out.println ( "Key= " + entry.getKey () + " and value= " + entry.getValue () );
        }
    }
}


