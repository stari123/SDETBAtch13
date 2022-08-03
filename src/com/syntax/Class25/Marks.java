package com.syntax.Class25;

abstract public class Marks {

        /* Hw2 Marks:
         * We have to calculate the average of marks obtained in three subjects by student A and
         * in 4 subjects by student B.
         * Create class 'Marks' with an abstract method 'getAverage' that will be returning the average of marks.
         * Provide implementation of abstract method in classes 'A' and 'B'.
         * The constructor of student A takes the marks in three subjects as its parameters
         * and the marks in four subjects as its parameters for student B. Test your code
         */

        abstract void getAverage();
    }

    class A extends Marks{

        int Math, Art, Science;
        A(int Math, int Art, int Science){
           this.Math=Math;
           this.Art=Art;
           this.Science=Science;
        }

        @Override
        void getAverage() {
            int average=0;
            average=(Math+Art+Science)/3;
            System.out.println(average);
        }
    }
    class B extends Marks{

        int Math; int Art; int Science; int Biology;

        B(int Math, int Art, int Science, int Biology){
            this.Math=Math;
            this.Art=Art;
            this.Science=Science;
            this.Biology=Biology;
        }
        @Override
        void getAverage() {
            int average=0;
            average=(Math+Art+Science+Biology)/4;
            System.out.println(average);
        }

        public static void main(String[] args) {
            Marks[] marks={new A(20,60,80),new B(80,70,80,90)};
            for (Marks m:marks){
                m.getAverage();
            }
        }
    }


