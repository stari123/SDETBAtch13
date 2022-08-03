package Replit106To135;
public class q122 {
    /*Declare 3 instance variables to hold:
    name of the country,   capital,  population size.
    Create a method to display values of instance variables
    Create 2 Object, assign values to instance variables, execute method display;
    Expected Output:    The capital of USA is Washington DC and population is 330000000
                        The capital of Kazakhstan is Astana and population is 18500000              */

    String country;
    String capital;
    int populationSize;

    public static void main(String[] args) {
        q122 obj1=new q122();
        q122 obj2=new q122();
        obj1.country="USA";
        obj1.capital="Washington DC";
        obj1.populationSize=330000000;
        obj2.country="Kazakhstan";
        obj2.capital="Astana";
        obj2.populationSize=18500000;

        System.out.println ( "The capital of USA is " + obj1.capital+ " and population is " + obj1.populationSize);
        System.out.println ( "The capital of Kazakhstan is " + obj2.capital + " and population is " + obj2.populationSize );

    }
}



