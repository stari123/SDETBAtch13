package Replit171To194;

public class q179EncapsulationDemo {
   /* Create Class EncapsulationDemo that will have 2 variables empName and empAge; Create the getter/setter methods for each variable.
    In Main Class and main method
    Using setter methods assign the values as "Mario" and "32"
    Using getter methods print the values as below outputs.
    Expected Output:
    Employee Name: Mario
    Employee Age: 32  */

   private String empName;
   private  int empAge;

    public void setName(String newName) { empName=newName; }

    public void setAge(int newAge) {empAge=newAge;  }

    public static void main(String[] args) {

        q179EncapsulationDemo M = new q179EncapsulationDemo ();
        q179EncapsulationDemo A = new q179EncapsulationDemo ();

        M.setName ( "Mario" );
        A.setAge ( 32 );
        System.out.println (M.empName);
        System.out.println (A.empAge);



}}



