package Replit171To194;

import java.util.ArrayList;
import java.util.List;

public class q187 {
    /*  Create an array list to type String.
      Add these values below to your arraylist
              hi
               yo
              sup
               yolo
              boop
      Remove 1, 3, 5 element from an array
      print remained values one by one in one line
      Expected Output:
      yo yolo   */
    public static void main(String[] args) {
        List<String> words = new ArrayList<> ();
        words.add ( "hi" );
        words.add ( "yo" );
        words.add ( "sup" );
        words.add ( "yolo" );
        words.add ( "boop" );
        //System.out.println ( words );
        words.remove ( "hi" );
        words.remove ( "sup" );
        words.remove ( "boop" );

        System.out.print ( words.get(0)+ " " );
        System.out.println ( words.get(1) );
    }
}
