package com.syntax.Class26ArrayList;

import java.util.Arrays;

public class Demo6 {
    public static void main(String[] args) {
        int num1=10;
        int num2=20;
        int num3=30;
        int num4=40;
        int num5=50;
            System.out.println(num1+num2+num3+num4+num5);
       //or
        int sum=num1+num2+num3+num4+num5;
            System.out.println (sum);

        // whenever we have to store more than three values of same type which are
        // also logically connected we should create an array for them
        String name="AbdulSamad";
        String name2="Kat";
        String nam3="Adam";
        String nam4="Bilal";

        String [] names={"AbdulSamad","Kat","Adam","Bilal"};
        System.out.println ( names );   // this does not print, it is junk.
        System.out.println ( Arrays.toString ( names ) );  //  i (tari) did this


        // not a good fit for an array because data is not same logically
        String name5="James";
        String address="New york";
        String movieName="Thor";

        String[] arr={"James","New york","Thor"};

        Object []array={10,51.2,"Asghar"}; // very bad idea to use this object array to store all teh elements



    }
}
