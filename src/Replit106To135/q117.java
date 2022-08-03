package Replit106To135;

import javax.imageio.stream.ImageInputStream;

public class q117 {

   /* Create a method with the following specs:
    Returns: an integer
    Name: sumEvenToX
    Parameters: an integer called "x"
    Purpose: calculate the sum of the EVEN integers from 1 to x (including x)
    Examples:
    sumEvenToX(5) ==> 6
    sumEvenToX(8) ==> 20  */




    public static int sumEvenToX(int x) {
        int sum = 0;
        for (int i = 0; i <= x; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }
        public static void main (String[] args){
            System.out.println ( sumEvenToX ( 5 ) );
            System.out.println ( sumEvenToX ( 8 ) );
            }
    }
