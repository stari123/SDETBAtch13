package com.syntax.class15;

public class VariablesDemo2 {
    int num = 10;    //whenever you have to share some info in more than one method
                     //of a class use instance variables

    void method1() {
        int num2 = 20;
        System.out.println ( num );
    }

    void method2() {
        //System.out.println(num2);  we can not access num2 because it is a local variable.
        System.out.println ( num );
    }

        // i added main method to execute.
    public static void main(String[] args) {
        VariablesDemo2 VD2=new VariablesDemo2();
        VD2.method1 ();
        VD2.method2 ();
    }
}
