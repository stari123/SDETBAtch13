package Replit106To135;

import java.util.Scanner;

public class q76 {

    public static void main(String[] args) {
        String[] array = new String[7];
        Scanner scan = new Scanner ( System.in );

        for (int i = 0; i <= array.length - 1; i++) {
            System.out.println ( "Please enter day " + (i + 1) + " of the week" );
            array[i] = scan.nextLine ();
        }
        for (int i = 0; i < array.length; i++) {System.out.println ( array[i]);
}}}