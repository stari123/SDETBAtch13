package com.syntax.Taskch28And29;

import java.util.ArrayList;

public class Task11 {
    /*Create a collection of integers in which you can keep duplicates.
    Write a logic to find sum of all integers*/
    public static void main(String[] args) {

        ArrayList<Integer> sum = new ArrayList<>();
        sum.add(12);
        sum.add(455);
        sum.add(5546);
        sum.add(43543);
        sum.add(4325);
        sum.add(9595);
        sum.add(4395);
        Integer sumArray=0;
        for(Integer i : sum){
            sumArray+=i;
        }
        System.out.println(sumArray);
    }

}
