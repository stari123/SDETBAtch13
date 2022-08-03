package Replit152to170;

public class q170 {
    /* Overload 2 final instance methods:
    Call them in main method
    Expected Output:
    Final method with boolean parameter
    Final method with String parameter  */

    // Overloaded sum(). This sum takes two int parameters
    final void boo() {
        System.out.println ( "Final method with boolean parameter" );
    }
    final void str() {
        System.out.println ( "Final method with String parameter" );
    }

    public static void main(String args[]) {
        q170 b = new q170 ();
        b.boo ();

        q170 s = new q170 ();
        s.str ();
    }
}
