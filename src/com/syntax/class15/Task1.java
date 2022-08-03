package com.syntax.class15;

public class Task1 {
    //Create a method that will take 2 parameters as numbers and prints which number is larger.
    void printlarger(int num1, int num2) {

        int larger = 0; // its a local variable because it is present inside the method
        if (num1 > num2) {
            larger = num1;
        } else if (num2 > num1) {
            larger = num2;
        } else {
            larger = num1;
        }
        System.out.println(larger);
    }

    public static void main(String[] args) {
     
        Task1 task1 = new Task1();
        task1.printlarger(12, 24);
    }
}    // there is problem in this question

