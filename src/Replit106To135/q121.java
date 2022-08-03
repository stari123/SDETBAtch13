package Replit106To135;
public class q121 {
    /*declare 3 instance variables to hold an integer, double and char values.
    Create 2 instances of the class and assign values to variables and the print them
    Expected Output: 10   10.23   a      100     100.23     s        */

    int x, x1;
    double d, d1;
    char c, c1;

    public static void main(String[] args) {
       q121 myObj1 = new q121 (); // Create an object of class Main (This will call the constructor)
       q121 myObj2 = new q121 ();
       myObj1.x=10;
       myObj1.d=10.23;
       myObj1.c='a';
       myObj2.x1=100;
       myObj2.d1=100.23;
       myObj2.c1='s';

        System.out.println ( myObj1.x );
        System.out.println ( myObj1.d );
        System.out.println ( myObj1.c );
        System.out.println ( myObj2.x1 );
        System.out.println ( myObj2.d1 );
        System.out.println ( myObj2.c1 );


    }
}