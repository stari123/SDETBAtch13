package com.syntax.Class26ArrayList;

import java.util.ArrayList;

public class Demo8 {
    public static void main(String[] args) {
        ArrayList<String> subjectsSeen=new ArrayList<>();
        subjectsSeen.add("SDLC");
        subjectsSeen.add("Manual Testing");
        subjectsSeen.add("Java");
        subjectsSeen.add("Git");
        subjectsSeen.add("Selenium");
        //System.out.println ( "subjectsSeen = " + subjectsSeen );

        ArrayList<String> futureSubjects=new ArrayList<>();
        futureSubjects.add("TestNG");
        futureSubjects.add("Cucumber");
        futureSubjects.add("SQL");
        futureSubjects.add("API");
        futureSubjects.add("Jenkins");
        futureSubjects.add("AWS");
        futureSubjects.add("Docker");
        futureSubjects.add("APIUM");
        //System.out.println ( "futureSubjects = " + futureSubjects );

        ArrayList<String> allSubjects=new ArrayList<>();
        allSubjects.addAll(subjectsSeen);
        allSubjects.addAll(futureSubjects);
            System.out.println("allSubjects = " + allSubjects);

        ArrayList<String> allSubjects2=new ArrayList<>();
        allSubjects2.addAll(subjectsSeen);
            // insert the data starting form the index 1 and will push the existing data towards the end
        allSubjects2.addAll(1,futureSubjects);
        System.out.println ( "allSubjects2 = " + allSubjects2 );


    }
}
