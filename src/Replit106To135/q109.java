package Replit106To135;
public class q109 {
    /* Create method name it as newLine
      Add print statement inside method body as "newLine method implementation"
        Call newLine method three times
            Expected Output:
            newLine method implementation
            newLine method implementation
            newLine method implementation   */

    void newLine() {
        System.out.println ("newLine method implementation");
    }

    public static void main(String[] args) {
        q109 NL=new q109();
        for(int i=0; i<3; i++) {
            NL.newLine ();
        }
    }
}
