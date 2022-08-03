package Replit152to170;

public class q164Parent {
        /*  Create a method hello() in parent class that will print "method in Parent class"
    then override that method is 3 Subclasses implementing
    login to print "method in Child1/Child2/Child3 class"
    In Main Class create 3 object of the child classes and
    store in into an array and call method hello():
    Expected Output:
    method in Child1 class
    method in Child2 class
    method in Child3 class */

    void hello() {
        System.out.println ( "method in Parent class" );
    }

    public static class child1 extends q164Parent {

        public void hello() {
            System.out.println ( "method in Child1 class" );

        }

      public static class child2 extends q164Parent{


        public void hello() {
            System.out.println ( "method in Child2 class" );
        }

        public static class child3 extends q164Parent{

        public void hello() {
            System.out.println ( "method in Child3 class" );
        }

        public static void main(String[] args) {
            child1 C1 = new child1 ();
            child2 C2= new child2 ();
            child3 C3 = new child3 ();
            C1.hello ();
            C2.hello ();
            C3.hello ();
        }
    }}}}
