package com.syntax.Class24;

public class StudentTester {
    public static void main(String[] args) {
        Student[] students={new SyntaxStudent(),
                new Student(),new CollegeStudent()};
        for(Student st:students){
            st.study();
            st.practice();
            st.doHomeWork();
        }

        for(int i=0; i<students.length;i++){
            students[i].study();
            students[i].practice();
            students[i].doHomeWork();
        }

        // Break till 11:40
    }
}
