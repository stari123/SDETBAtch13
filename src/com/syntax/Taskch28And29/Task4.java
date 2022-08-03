package com.syntax.Taskch28And29;

import java.util.HashMap;

public class Task4 {
    /*Create a Set collection that will hold Objects of Student Type.
     In this set we do not care about the insertion order.
    Each student object should have name and studentID.
    Display name of each student.   */

    public static void main(String[] args) {

        HashMap<String, Integer> student=new HashMap<> ();
        student.put ( "ali", 123 );
        student.put ( "veli", 345 );
        student.put ( "selami", 543 );
        student.put ( "ahmet", 321 );

        System.out.println ( student.keySet () );

        System.out.println ( "student = " + student );

        System.out.println ("-----------");

        for (String stu : student.keySet ()) {
            System.out.println ( "s = " + stu );
            
        }
    }
}
