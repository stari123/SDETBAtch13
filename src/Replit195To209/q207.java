package Replit195To209;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class q207 {
    /*   Create Hash Map.
       add the follow values
   map.put("ONE","AAA");
   map.put("TWO","BBB");
   map.put("THREE","CCC");
   map.put("FOUR","DDD");
   map.put("FIVE","EEE");
       Using EntrySet print the key and values pairs using iterator only
       replace with below key THREE--> ASEL and key FIVE-->SUMAIR
       Using EntrySet print the key and values pairs using iterator only
               OUTPUT
       HashMap Before Replace :
       FIVE : EEE
       ONE : AAA
       FOUR : DDD
       TWO : BBB
       THREE : CCC
   ------------------
       HashMap After Replace :
       FIVE : SUMAIR
       ONE : AAA
       FOUR : DDD
       TWO : BBB
       THREE : ASEL  */
    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<> ();
        map.put ( "ONE", "AAA" );
        map.put ( "TWO", "BBB" );
        map.put ( "THREE", "CCC" );
        map.put ( "FOUR", "DDD" );
        map.put ( "FIVE", "EEE" );

        //System.out.println (  map );
        System.out.println ( "HashMap Before Replace :" );
        Set<Map.Entry<String, String>> entries = map.entrySet ();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println ( entry.getKey () + ":" + entry.getValue () );
        }
        System.out.println ("---------- ");
        System.out.println ( "HashMap After Replace :" );
        map.replace ( "FIVE", "SUMAIR" );
        map.replace ( "THREE", "ASEL" );
        //System.out.println (map);
        Set<Map.Entry<String, String>> entries1 = map.entrySet ();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println ( entry.getKey () + ":" + entry.getValue () );
        }
    }
}