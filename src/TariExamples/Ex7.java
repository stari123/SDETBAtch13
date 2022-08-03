package TariExamples;

import java.util.Arrays;

public class Ex7 {

    public static void main(String[] args) {

        int[] arr = {5, 3, 9, -2, 7};
        System.out.println ( arr );

        char[] arr1 = {'a', 'b', 'c', 'd'};
        System.out.println ( arr1 );

        for (int i = 0; i < arr.length; i++) {
            System.out.print ( arr[i] + " " );
        }
        System.out.println (" ");
       // int[] num = {5, 3, 9, -2, 7};
        Arrays.sort ( arr );
        for (int i = 0; i < arr.length; i++) {
            System.out.print ( arr[i]+" " );
        }
    }
}
