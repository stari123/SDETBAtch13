package Replit195To209;

public class q211 {
    /*Create a program that will handle exception to match below output:
    Expected Output:
    java.lang.ArrayIndexOutOfBoundsException: 4
    at Main.main(Main.java:5)   */

    public static void main(String[] args) {

        try {
            int[] arr = {2, 4, 7, 9};
            System.out.println ( arr[4] );
        }catch( ArrayIndexOutOfBoundsException e){
            //System.out.println (  aioe.getMessage () );
            e.printStackTrace ();
        }
    }
}
