package Replit136to151;

public class q136 {
/*  Please create methods with different access modifiers (one for each access modifier) and
    call them properly in main method one by one. In each method write the logic accordingly like
    for private method write the logic in the println Statement as "This is Private Method" accordingly
    for rest of the methods that have different access modifiers should be a total of 4 outputs,
    please make sure they are in the same order that is printed below.
    Expected Output:
    This is Private Method
    This is Default Method
    This is Protected Method
    This is Public Method    */

    private String myPrivateMethod = "This is Private Method";

    String myDefaultMethod="This is Default Method";

    protected String myProtectedMethod() {
        return "This is Protected Method";
    }
    public void myPublicMethod() {
        System.out.println ( "This is Public Method" );
    }

    public static void main(String[] args) {
        q136 mPM = new q136 ();
        System.out.println (mPM.myPrivateMethod );

        q136 myDefaultMethod= new q136();
        System.out.println (myDefaultMethod.myDefaultMethod);

        q136 myProtectedMethod= new q136();
        System.out.println (myProtectedMethod.myProtectedMethod ());

        q136 obj1 = new q136 (); //create an object of q136
        obj1.myPublicMethod (); //call the public method

    }

}
