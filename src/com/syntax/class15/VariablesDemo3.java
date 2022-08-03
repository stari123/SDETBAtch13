package com.syntax.class15;

public class VariablesDemo3 {
    static int num=5;   //static instance variable
    String name;        // instance variable

    public static void main(String[] args) {

        VariablesDemo3 v1=new VariablesDemo3();     // create object of name. we can create many objects.
        v1.name="Naveed";

        VariablesDemo3 v2=new VariablesDemo3();     // create object of name
        v2.name="jason";

        VariablesDemo3 v3=new VariablesDemo3();     // create object of name
        v3.name="Mumtaz";

        System.out.println(v1.name);   //print v1.name   Naveed

        System.out.println(v1.num);     //Print v1.num  5
        v1.num=8;                      //reassign v1

        //v1.name="Sameer";
        System.out.println(v2.name);   //print v2.name  Jason
        System.out.println(v1.num);     //print v1.num  10
}}
