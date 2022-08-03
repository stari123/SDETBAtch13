package Replit195To209;

public class q210 {
    /*Complete the code, handle possible exception
    Expected Output:
            / by zero         */

    public static void main(String[] args) {

        int a = 10, b = 0;
        try {
            int result = a / b;
            System.out.println ( result );

        } catch (ArithmeticException ae) {
            System.out.println ( ae.getMessage () ); // prints "/ by zero"
            System.out.println ( ae );  //prints "java.lang.ArithmeticException: / by zero"
            ae.printStackTrace ();        // java.lang.ArithmeticException: / by zero
                                          //    at Replit195To209.q210.main(q210.java:12)
        }
    }
}
