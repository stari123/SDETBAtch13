/*
package Replit171To190;

public abstract class q172Parent {
    */
/*Create a Parent Class in which you will have 1 implemented method m2 and 1 unimplemented method m1
    Make Main class to be a derived class from Parent.
    In main method execute both methods
    Expected Output:
    Child class providing implementation
    Parent class providing implementation*//*


    void methodM2() {
        System.out.println ("Child class providing implementation");
    }
    abstract void methodm1();

    abstract void methodM1();
}
class child1 extends q172Parent {

    @Override
    void methodM1() {
        //System.out.println ( "Parent class providing implementation" );

        }
    public static void main(String[] args) {
        q172Parent P=new q172Parent () {
            @Override
            void methodM2() {
                System.out.println ( "Parent class providing implementation" );
                child1 C1 = new child1 ();
                C1.methodM1 ();
            }
        }

      */// not solved
