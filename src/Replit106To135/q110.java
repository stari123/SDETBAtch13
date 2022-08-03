package Replit106To135;
public class q110 {
    /*Create a method name as newLine that should have print statement inside the method body as "newLine method implementation"
    Create a method name as displayLine that should have print statement inside the method body as "displayLine method implementation"
    Call both methods
    Expected Output:
    newLine method implementation
    displayLine method implementation  */

    void newLine() {
        System.out.println ("newLine method implementation");
    }
    void displayLine() {
        System.out.println ( "displayLine method implementation" );
    }
        public static void main(String[] args) {
            q110 NL = new q110 ();
            NL.newLine ();

            q110 DL = new q110 ();
            DL.displayLine ();

            }
        }