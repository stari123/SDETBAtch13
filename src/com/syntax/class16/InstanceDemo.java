package com.syntax.class16;

public class InstanceDemo {
    String str = "instance";

    void changeInstanceValue() {
        str = "Captain Marvel";
    }

    void printIstanceValue() {
        System.out.println ( str );
    }

    public static void main(String[] args) {
        InstanceDemo insdemo = new InstanceDemo ();
        System.out.println ( insdemo.str ); // prints the value of str which is instance

        insdemo.printIstanceValue (); // method once simple prints the value of str which is still instance
        insdemo.changeInstanceValue (); // this method changes the instance variable value which will be not Captain Marvel
        insdemo.printIstanceValue (); // method once simple prints the value of str which is now instance Captain Marvel
    }
}
