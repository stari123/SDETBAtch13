package Replit106To135;

public class q125 {
   /* Declare a static variable number that will hold an integer value:
    Access number from the main method and assign value to it.
    Create an Object of the class, access number in a nonstatic way and assing value of 200.
    Print out number using class name and using instance
            Expected Output:
            200
            200   */
    static int x;

    public static void main(String[] args) {
       x=200;
       System.out.println (x);

       q125 num= new q125();
       num.x=200;
       System.out.println (x);
    }
}
