package com.syntax.Class25;

    public abstract class Vehicle {
        /* HW3Vehicle:
        Create a Class Vehicle that would have the following fields: vehiclePrice and method calculateSalePrice()
         * which should be returning a price of the Vehicle.
         * Create 2 subclasses: Sedan and Truck.
         * The Truck class has field as weight and has its own implementation
         * of  calculateSalePrice() method in which returned price calculated as following:
         * if weight>2000 then returned price car should include 10% discount, otherwise 20% discount.
         * The Sedan class has field as length and also does its own implementation of calculateSalePrice():
         * if length of sedan is >20 feet then returned car price should include 5% discount, otherwise 10% discount
         */

        double vehiclePrice=35000.00;
        abstract String calculateSalePrice();

    }

    class Sedan extends Vehicle{

        double length;
        Sedan(double length){
            this.length=length;
        }

        /**
         * @return
         */
        @Override
        String calculateSalePrice() {
            if(length>20){
                return "You received a discount of 5% "+(vehiclePrice/100)*5;
            }else{
                return "You received a discount of 10% "+(vehiclePrice/100)*10;
            }
        }
    }
    class Truck extends Vehicle {

        double weight;
        Truck(double weight){
            this.weight=weight;
        }

        /**
         * @return
         */
        @Override
        String calculateSalePrice() {
            if (weight > 2000) {
                return "You received a discount of 10% "+(vehiclePrice / 100) * 10;
            } else {
                return "You received a discount of 20% "+(vehiclePrice / 100) * 20;
            }
        }

        public static void main(String[] args) {
            Vehicle[] vehicles = {new Sedan(15), new Truck(1800)};
            for (Vehicle v : vehicles) {
                System.out.println(v.calculateSalePrice());
            }
        }
    }

