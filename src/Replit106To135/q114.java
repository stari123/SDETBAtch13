package Replit106To135;

public class q114 {
    /*Step1: Create three methods that will accept 2 in parameters on integer type
    Step2: Write the logic in methods to perform actions below:
    The first method for multiplication
    The second method for addition
    The third method for subtraction
    Step3: execute all methods
            for the addition method add two numbers to make 30
            for multiplication multiply two numbers to make 30
            for Subtraction subtract two numbers to equal 20
    Expected Output:
    Addition 30
    Multiplication 30
    Subtraction 20*/

    static void add(int x, int y){
        System.out.println (x+y);
    }
    static void mult(int x, int y){
        System.out.println (x*y);
    }
    static void sub(int x, int y){
        System.out.println (x-y);
    }

    public static void main(String[] args) {
        add(10, 20);
        mult(3, 10);
        sub(30, 10);
    }

}
