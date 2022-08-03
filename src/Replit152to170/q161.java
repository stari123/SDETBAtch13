package Replit152to170;

public class q161 {
   /* Overload private instance method m1
    Call each method from the main method.
    Expected Output:
    private m1 method
    private m1 method with int parameter */

    private String m1(String m1) {
       return (m1);
    }
    private String str1() {
        String str1 = "private m1 method with int parameter";
        return str1;
    }
    public static void main(String args[]) {
        q161 P = new q161 ();
        System.out.println ( P.m1 ( "private m1 method" ) );
        System.out.println ( P.str1 ( ) );
    }
}
