package com.syntax.Class27;

import java.util.ArrayList;

public class Task1 {
    /*Create a class Insurance that will have an attribute as insuranceName and unimplemented
     behaviour as getQuote and cancelInsurance.
    Create 3 subclasses Car, Pet, Health.
    Car class has it’s own attribute as carModel and Class Pet has petType attribute.
    Create 3 objects of the sub classes and store them in ArrayList.
    Using for loop/advanced for loop/ iterator access all methods of the class.*/

public interface insurance {

    String insuranceName = "State Farm";

    void getQuote();

    void cancelInsurance();


    class car implements Task1.insurance {
        public void carModel() {
            System.out.println ( "honda" );
        }

        @Override
        public void getQuote() {
            System.out.println ( "quote is ready" );

        }

        @Override
        public void cancelInsurance() {
            System.out.println ( "canceled" );

        }
    }


       /* public class pet extends insurance {
            String petType;
        }


        public class healt extends insurance {

        }*/


    public static void main(String[] args) {
        Task1.insurance.car c = new Task1.insurance.car ();
        c.carModel ();
        c.getQuote ();
        c.cancelInsurance ();
    }

    ArrayList<String> car = new ArrayList<> ();

}
}
