package Replit195To209;

import java.util.HashSet;

public class q197 {
    /*Create a set collection in which you do not want to preserve or sort the order and add below values to it.
    Red    Pink    Yellow    White    Black
    Print set collection
    And get total number of colors available in the set
    Expected Output:
    Original Hash Set: [Red, Pink, White, Yellow, Black]
    Size of the Hash Set: 5   */

    public static void main(String[] args) {

        HashSet<String> color = new HashSet<> ();
        color.add ( "Red" );
        color.add ( "Pink" );
        color.add ( "Yellow" );
        color.add ( "White" );
        color.add ( "Black" );
        System.out.println ( "Original Hash Set: " + color );
        System.out.println ( "Size of the Hash Set: "+color.size () );
    }
}
