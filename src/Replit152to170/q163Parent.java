package Replit152to170;

public class q163Parent {
   /* In Parent Class create a method with name method() that will print "Parent method"
    Override method() in Child class that will print "Child method"
    In Main Class create objects of child and parent class and call its method.
    Expected Output:  Parent method     Child method  */

    void Method() {
        System.out.println ( "Parent Method" );
    }
}

class Child extends q163Parent {

    void Method() {
        System.out.println ( "Child Method" );
    }

    public static void main(String[] args) {
        q163Parent Par = new q163Parent ();
        Par.Method ();

        Child kid = new Child ();
        kid.Method ();
    }
}


