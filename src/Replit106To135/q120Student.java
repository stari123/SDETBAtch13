package Replit106To135;

public class q120Student {
/*  Declare 3 instance variables to hold:
    year, school name and batch #
    Access variables from the main method and assign specific values to them
    Print values of your variables in the following format:
    Expected Outpt:
    I am a student of batch 9 studying at Syntax in the year of 2021*/

    public static int year;
    public static String schoolName;
    public static int batchNumber;

    public static void main(String[] args) {
        q120Student q120student=new q120Student();
        year = 2021;
        schoolName = "Syntax";
        batchNumber = 9;

        System.out.println ( "I am a student of batch " + batchNumber + " studying at " + schoolName + " in the year of " + year );
    }
}

