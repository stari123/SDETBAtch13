package Replit152to170;

public class q160 {
   /* Overload instance method display by having different types of parameters
    Inside each method write the logic to print value of the parameter
    Call all methods inside your main method
    Expected Output:    100
                        Syntax Technologies
                        100.09  */

    public int x(int x) {
        return (x);
    }
    public String str(String str) {
        return (str);
    }
    public double d(double d) {
        return ( d );
    }

    public static void main(String args[]) {
        q160 P = new q160 ();
        System.out.println ( P.x (100));
        System.out.println ( P.str ("Syntax Technologies"));
        System.out.println ( P.d (100.09));
    }
}
