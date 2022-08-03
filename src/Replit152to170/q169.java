package Replit152to170;

public class q169 {
    /*Create final method avgElements that will average all the elements
     in an integer array (passed to the method as a parameter) and return the average.
     Expected Output:
            4.8   */

   final public static void main(String[] args) {
       double [] array = {2, 7, 3, 8, 4};
       double sum, avg;
       sum = 0;

       for (int i = 0; i < array.length; i++) {
           sum += array[i];
       }
       avg = sum / array.length;

       System.out.println ( avg );

   }}
