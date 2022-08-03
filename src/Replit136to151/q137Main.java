package Replit136to151;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class q137Main {
  /*  In main class please declare the variables using different access modifiers that will hold value for:
    name
    city
    name of the school
    batch number
    Create a method to display details in following format:
    My name is ___ and I live in ___. I study at ___ in batch ___
    Assign values to the variables and execute method display
    Expected Output:
    My name is John and I live in Miami. I study at Syntax in batch 9   */

    public static String name;
    public static String city;
    static String School;
    public static int batchno;

    public static void main(String[] args) {
        name="John";
        city="Miami";
        School="Syntax";
        batchno=9;

        System.out.println ("My name is " + name + " and I live in " + city+ ". I study at Syntax in batch "+batchno);

    }

}
