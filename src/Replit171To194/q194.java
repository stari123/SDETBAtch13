package Replit171To194;


import java.util.LinkedList;
import java.util.List;

public class q194 {
    /* Create a method that will remove an element based on the specified
    condition from given List and return new List;
    Expected Output:
            [USA, Kazakhstan, Pakistan, Russia]  */

    public static void main(String[] args) {

        List<String> countries = new LinkedList<> ();
        countries.add ( "Armenia" );
        countries.add ( "USA" );
        countries.add ( "Kazakhstan" );
        countries.add ( "Australia" );
        countries.add ( "Pakistan" );
        countries.add ( "Russia" );
        countries.add ( "Azerbaijan" );
            System.out.println (countries);
        countries.remove ("Armenia");
        countries.remove ("Australia");
        countries.remove ("Azerbaijan");
            System.out.println (countries);
        }
    }  //check solution later. i did not create a logic.


