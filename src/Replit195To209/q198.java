package Replit195To209;

import java.util.TreeSet;

public class q198 {
    /*Create Set to store String Objects and you want them to be stored in ascending order
    Please add the below values and see the result
    "India"   "Australia"   "South Africa"    "India"   "America"    "America"
    Print the Set.
    Expected Output:
    [America, Australia, India, South Africa] */

    public static void main(String[] args) {

        TreeSet<String> country = new TreeSet<> ();
        country.add ("India");
        country.add ("Australia");
        country.add ("South Africa");
        country.add ("India");
        country.add ("America");
        country.add ("America");
        System.out.println ( country );
    }
}