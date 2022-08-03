package Replit171To194;
public abstract class q171Parent {
    /*Create a Parent Class that will have two overloaded abstract methods m1
    Make Main class as concrete subclass to Parent Class
    In main method call the methods.
    Expected Output:
    m1 without parameters
    m1 method with parameter */

   abstract void methodm1();
    abstract void methodm1(String Hi);

    }
class child extends q171Parent {

    void methodm1() {
        System.out.println ("m1 without parameters");
    }

    void methodm1(String Hi) {
        System.out.println ("m1 method with parameter");
    }
    public static void main(String[] args) {
        child c1=new child();
        c1.methodm1 ();
        child c2=new child();
        c1.methodm1 ("Hi");
    }
}




