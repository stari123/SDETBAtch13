package com.syntax.Class26ArrayList;

import java.util.ArrayList;

public class Demo9 {
    public static void main(String[] args) {

        Integer number=10;

        System.out.println(Integer.MAX_VALUE); //this gives max number of integer we can have,214748647

        // if number is present in the form of String using this method we can convert to its original type
        int num=Integer.parseInt("20");
        System.out.println(num);

        System.out.println(Integer.MIN_VALUE); //this gives min number of integer we can have, -214748647

        int number1=15;
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(number1); // auto boxing
        System.out.println("numbers = " + numbers);

        int number3=numbers.get(0).intValue(); //  unboxing
        number3=numbers.get(0); // auto unboxing
        new Integer(15); //boxing

    }
}
