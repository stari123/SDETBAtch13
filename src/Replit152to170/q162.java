package Replit152to170;

public class q162 {
    /*Overload static method and then execute both overloaded methods.
    Expected Output:
    static method without parameter
    static method with int parameter  */

     public static String str3(String str3) {
       return (str3);
    }
   public static String str4() {
        String str4 ="static method with int parameter";
        return (str4);
    }

    public static void main(String args[]) {
        q162 P = new q162 ();
        System.out.println ( str3 ( "static method without parameter" ) );
        System.out.println ( str4 () );
    }
}
