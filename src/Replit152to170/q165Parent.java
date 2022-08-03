package Replit152to170;

public class q165Parent {
    /* Parent class create 4 methods with different level of access modifiers.
    In each method print "I am parent public/protected/default/private method".
    Override methods in child class
    In Main Class create object of the child class and see which methods are available
    Expected Output:
    I am a child public method
    I am a child protected method
    I am a child default method */

        public static void method1() {
            System.out.println ( "I am parent public method" );
        }
        protected static void method2() {
            System.out.println ( "I am protected method" );
        }
        static void method3() {
            System.out.println ("I am default method");
        }
        private static void method4() {
            System.out.println ( "I am private method" );
            }
        static class Child extends q165Parent {
                public static void method1() {
                    System.out.println ( "I am a child public method" );
                }

                protected static void method2() {
                    System.out.println ( "I am a child protected method" );
                }

                static void method3() {
                    System.out.println ( "I am a child default method" );
                }

                private void method4() {
                    System.out.println ( "I am a child private method" );
                }

                public static void main(String[] args) {
                    Child kid1=new Child();
                    kid1.method1();
                    Child kid2=new Child();
                    kid2.method2();
                    Child kid3=new Child();
                    kid3.method3();
                    Child kid4=new Child();
                    kid4.method4();
                }
            }
        }

