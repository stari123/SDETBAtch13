package com.syntax.Class22;

public class Hw1Degree {
    /*1.	Create a class 'Degree' having a method 'getPrerequisite' that
            prints ""To get a degree you need high school diploma"".
          •	Class 'Degree' has 2 subclasses namely 'Bachelors' and Masters’.
          In Masters class override method 'getPrerequisite'.
          •	Call the method by creating an object of each of the three classes.*/

    void getPrerequsite() {
        System.out.println ( "To get a degree you need high school diploma " );
    }
}
    class Bachelors extends Hw1Degree {

    }

    class Masters extends Hw1Degree {
        void getPrerequsite() {
            System.out.println ( "To geta Masters degree you need a Bachelors degree" );
        }


        public static void main(String[] args) {
            Hw1Degree D=new Hw1Degree();
            D.getPrerequsite ();
            Bachelors B = new Bachelors ();
            B.getPrerequsite ();
            Masters M=new Masters();
            M.getPrerequsite ();

        }
    }


