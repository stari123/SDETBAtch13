package Replit106To135;
public class q124 {
   /* Declare static variable in class level as below and assign its value:
    String ss="Welcome To Syntax Technologies"
    Access variable in the main method and print it using three ways you learned so far
    Hint:
    first way: By calling directly
    Second way: By using the className
    Third way: By creating the object of the class
    Expected Output:
    Welcome To Syntax Technologies
    Welcome To Syntax Technologies
    Welcome To Syntax Technologies    */

    static String ss="Welcome To Syntax Technologies";

    public static void main(String[] args) {
        System.out.println (ss);   //first way, calling directly

        System.out.println (q124.ss); // second way, using class name

        q124 Obj=new q124();           //3rd way creating object?
        System.out.println (Obj.ss);
    }

       }


