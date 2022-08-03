package Replit171To194;

public interface q174MyInterface {
    /*Create an Interface with name as MyInterface
    Create two undefined methods method1 and method2
    Inherit the MyInterface to Main Class. Execute both methods
    Expected Output:
    implementation of method1
    implementation of method2   */

    void method1();

    void method2();

    class Main1 implements q174MyInterface {
        @Override
        public void method1() {
            System.out.println ( "implementation of method1" );

        }

        @Override
        public void method2() {
            System.out.println ( "implementation of method2" );

        }

        public static void main(String[] args) {
            Main1 m = new Main1 ();
            m.method1 ();
            m.method2 ();
        }
    }
}