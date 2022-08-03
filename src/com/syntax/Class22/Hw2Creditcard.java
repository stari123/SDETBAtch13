package com.syntax.Class22;

public class Hw2Creditcard {
    /*2.Create a class CreditCard and define variable balance and interest.
    Create an instance method that will calculate interest based on the given balance.
    Create 2 subclasses: Visa and AX. In AX class override method calculate interest
    Call the method by creating an object of each of the three classes.*/

    double balance;

    double interest;

    void calculateInterest(double balance, double interest) {
        this.balance = balance;
        this.interest = interest;
        System.out.println ( "The interest you owe is: " + balance + (interest / 100) );

    }

    static class Visa extends Hw2Creditcard {

    }

    static class AX extends Hw2Creditcard {
        @Override
        void calculateInterest(double balance, double interest) {
            this.balance = balance;
            this.interest = interest;
            System.out.println ( "The interest you oweto AX is: " + balance + (interest / 100) );
        }
    }

public static void main(String[] args) {
    Hw2Creditcard Hw2CC = new Hw2Creditcard ();
    Hw2CC.calculateInterest ( 4000, 2.5);

    Hw2Creditcard.Visa visa = new Hw2Creditcard.Visa ();
    visa.calculateInterest ( 500, 3 );

    Hw2Creditcard.AX ax = new Hw2Creditcard.AX ();
    ax.calculateInterest ( 600, 2 );
}
}


