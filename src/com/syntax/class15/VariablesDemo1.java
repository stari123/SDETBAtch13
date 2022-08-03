package com.syntax.class15;

public class VariablesDemo1 {
    String breed; //instance variable
    static int num=5; // static

    void printName(){           //printName method
        String name="Local";    // local variable
        System.out.println(name);
    }
    static void printName2(){
        String name="Local 3"; // local variable
        System.out.println(name);
    }
    public static void main(String[] args) {
        System.out.println(VariablesDemo1.num);  // since int is static instance variable we dont need to create object of it, just print.

        VariablesDemo1 v=new VariablesDemo1();   // since printName() method has void return type, we need to create an object.
        v.printName();                           //  local

        VariablesDemo1.printName2();            // since printName2 method has static void we don't need to create an object of it
}}
