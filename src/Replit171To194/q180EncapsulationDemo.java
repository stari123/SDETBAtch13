package Replit171To194;

public class q180EncapsulationDemo {

    /*Create Class EncapsulationDemo
    create two variable as shown below.
    private String empName=John;
    private int empAge=30;
    Create only getters methods for each variable.
    Print the values of each variable as shown below.
    Expected Output:
    Employee Name: John
    Employee Age: 30*/

    private static String empName="John";
    private static int empAge=30;

    public void getName(String empName){ }

    public void getAge(int empAge) {}

    public static void main(String[] args) {

        q180EncapsulationDemo M = new q180EncapsulationDemo ();
        q180EncapsulationDemo A = new q180EncapsulationDemo ();

        M.getName ( empName );
        A.getAge ( empAge );
        System.out.println (M.empName);
        System.out.println (A.empAge);



    }}
