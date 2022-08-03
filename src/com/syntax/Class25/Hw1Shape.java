package com.syntax.Class25;

public interface Hw1Shape {
    /*Create an Interface 'Shape' with undefined methods as calculateArea and calculatePerimiter.
     Create 2 classes Circle & Square that implements functionality defined in the Shape Interface.
     Test your code.      */

    void calculateArea();    //abstract method.  methods in interface are abstract by default

    void calculatePerimeter();   // abstract method.


    class Circle implements Hw1Shape {

        @Override
        public void calculateArea() {
            int radius = 3;
            double area = 0;
            area = (3.14159) * (radius * radius);
            System.out.println ( "Area of Circle is " + area );
        }

        @Override
        public void calculatePerimeter() {
            int radius = 3;
            double perimeter = 0;
            perimeter = 2 * (3.14159) * radius;
            System.out.println ( "Perimeter of Circle is " + perimeter );
        }
    }

    class Square implements Hw1Shape {

        @Override
        public void calculateArea() {
            int a = 4;
            double area = 0;
            area = a * 2;
            System.out.println ( "Area of Square is " + area );
        }

        @Override
        public void calculatePerimeter() {
            int a = 4;
            double perimeter = 0;
            perimeter = a * 4;
            System.out.println ( "Perimeter os Square is " + perimeter );

        }

        public static void main(String[] args) {
            Hw1Shape[] shape = {new Circle (), new Square ()};
            for (Hw1Shape s : shape) {
                s.calculateArea ();
                s.calculatePerimeter ();

            }
        }
    }
}


