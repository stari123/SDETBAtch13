package Replit171To194;
public class q181Account {
    /*Create Class Account
    Create the below variables:
    acc_no;      name;      email;     double amount;
    Create the getter/setter methods for each variable.
    In Main Class and the main method.
    Using setter methods assign the values as:
    acc_no = 7560504000,     name = Sumair
    email = sumair@syntax.com,    amount = 50000.0
    Using getter methods print the values as below output.
    Expected Output:   7560504000 Sumair sumair@syntax.com 50000.0 */

    private long accNo;
    String name;
    String email;
    private double amount;

    private void setAccNo(long newaccNo) {accNo=newaccNo;  }
    public void setName(String newname){name=newname;  }
    public void setEmail(String newemail){email=newemail; }
    private void setAmount(double newamount){amount=newamount; }

    public static void main(String[] args) {
        q181Account Acc=new q181Account();
        q181Account Name=new q181Account();
        q181Account Email=new q181Account();
        q181Account Amount=new q181Account();

        Acc.setAccNo ( 7560504000l );
        Name.setName ("Sumair" );
        Email.setEmail ("sumair@syntax.com" );
        Amount.setAmount ( 50000.0 );
        System.out.println (Acc.accNo+" " + Name.name+" "+ Email.email +" "+ Amount.amount);
       // System.out.println (Name.name );
        //System.out.println (Email.email );
       // System.out.println (Amount.amount );

    }
    }




