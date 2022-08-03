package Replit171To194;

import java.util.LinkedList;

public class q192 {
    /*Create a Linked List that will store all prime numbers from 1 to 100.
    Step 1. Create a method that will identify whether number is prime or not
    Step 2. Add all prime numbers into Linked List
    Print Linked List:
    Expected Output:
            [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97]  */

    public static void main(String[] args) {
        System.out.println (findPrimes ( 2,20 ));
    }

    public static LinkedList<Integer> findPrimes(int start, int end) {
        LinkedList<Integer> primes = new LinkedList<> ();

        for (int n = start; n < end; n++) {
            boolean isPrime = true;
            int i = 2;
            while (i <= n / 2) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
                i++;
            }
            if (isPrime) {
                primes.add ( n );
            }
        }
        return primes;
    }
}   // Alex lee solution

