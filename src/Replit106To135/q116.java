package Replit106To135;

public class q116 {
     /* Create a method that will accept 2 numbers as parameters and return true if both numbers
      are even otherwise returned false
            ( Return false if one or both given numbers are not even)
    Examples:
    bothEven(4,6) ==> true
    bothEven(3,4) ==> false
    bothEven(-1,1) ==> false
    Expected Output:
            false*/

    static void compare1(int x, int y){
        if (x%2==0 && y%2==0){
            System.out.println ("true");
        }
        else if (x%2==1 && y%2==0){
            System.out.println (false);
        }
        else if(x%2==1 && y%2==1){
            System.out.println (false);
        }
    }
        public static void main(String[] args){
        compare1(4,6);
        compare1(3,4);
        compare1(-1,1);
        }
    }
