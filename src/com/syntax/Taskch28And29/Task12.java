package com.syntax.Taskch28And29;

import java.util.ArrayList;
import java.util.Iterator;

public class Task12 {
   /*Task1 from ch27 solution Gennady
   Create a class Insurance that will have an attribute as insuranceName and unimplemented
 behaviour as getQuote and cancelInsurance.
Create 3 subclasses Car, Pet, Health.
Car class has it's own attribute as carModel and Class Pet has petType attribute.
Create 3 objects of the sub classes and store them in ArrayList.
Using for loop/advanced for loop/ iterator access all methods of the class.*/

        public static void main(String[] args) {

            ArrayList<Insurance> arrList = new ArrayList<>();
            arrList.add(new Car());
            arrList.add(new Pet());
            arrList.add(new Health());

            System.out.println("<====== Advanced For Loop ======>");
            for (Insurance insurance : arrList) {
                insurance.getQuote();
                insurance.cancelInsurance();
            }

            System.out.println("<====== Loop ======>");
            for (int i = 0; i < arrList.size(); i++) {
                arrList.get(i).getQuote();
                arrList.get(i).cancelInsurance();
            }

            System.out.println("<====== Iterator ======>");
            Iterator<Insurance> iterator = arrList.iterator();

            while (iterator.hasNext()) {
                Insurance i = iterator.next();
                i.getQuote();
                i.cancelInsurance();
            }
        }
    }

    abstract class Insurance {

        String insuranceName;

        abstract void getQuote();

        abstract void cancelInsurance();
    }

    class Car extends Insurance {
        String carModel = "Hyundai";
        String insuranceName = "Car";

        @Override
        void getQuote() {

            System.out.println(insuranceName + " insurance (" + carModel + ") cost : 1771 $ per year");
        }

        @Override
        void cancelInsurance() {
            System.out.println(insuranceName + " insurance is canceled");
        }
    }

    class Pet extends Insurance {
        String petType = "Dog";
        String insuranceName = "Pet";

        @Override
        void getQuote() {
            System.out.println(insuranceName + " insurance (" + petType + ") cost : 360 $ per year");
        }

        @Override
        void cancelInsurance() {
            System.out.println(insuranceName + " insurance is canceled");
        }
    }

    class Health extends Insurance {

        String insuranceName = "Health";

        @Override
        void getQuote() {
            System.out.println(insuranceName + " insurance cost : 7739 $ per year");
        }

        @Override
        void cancelInsurance() {
            System.out.println(insuranceName + " insurance is canceled");
        }
    }

