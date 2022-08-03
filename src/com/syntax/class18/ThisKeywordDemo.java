package com.syntax.class18;

public class ThisKeywordDemo {
    String name = "instance";

    void printName() {
        String name = "local";
        System.out.println ( name );        //prints local
        System.out.println ( this.name );   //prints instance
        // this does not work with static variables
    }

    public static void main(String[] args) {
        ThisKeywordDemo t = new ThisKeywordDemo ();
        t.printName ();

    }// this does not work with static variables
}