package Replit171To194;

public class q178EncapsulationDemo {

/*Create Class EncapsulationDemo. create two variable as shown below.
    private String empName;
    private int empAge;
    Create the getter/setter methods for each variable.
    In Main Class and main method.
    Using setter methods assign the values as "John" and "30"
    Using getter methods print the values as below outputs.
    Expected Output:
    Employee Name: John
    Employee Age: 30 */

    private String name;
    private int age;

    public void setName(String newName) {
        name=newName;
    }
    public void setAge(int newAge) {
        age=newAge;

    }

    public static void main(String[] args) {

        q178EncapsulationDemo n = new q178EncapsulationDemo ();
        q178EncapsulationDemo a = new q178EncapsulationDemo ();

        n.setName ( "John" );
        a.setAge ( 30 );
        System.out.println (n.name);
        System.out.println (a.age);
}}

