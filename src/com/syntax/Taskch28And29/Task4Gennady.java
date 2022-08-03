package com.syntax.Taskch28And29;

import java.util.HashSet;

public class Task4Gennady {
    public static void main(String[] args) {


        HashSet<Student> students = new HashSet<> ();

        students.add ( new Student ( "Jane", 2346 ) );
        students.add ( new Student ( "John", 43566 ) );
        students.add ( new Student ( "Joseph", 6857 ) );

        for (Student student : students) {
            System.out.println ( student.getName () );
        }
    }
}

class Student {

    private String name;
    private int studentId;

    Student(String name, int studentId) {

        this.studentId = studentId;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    Student() {

    }
}

