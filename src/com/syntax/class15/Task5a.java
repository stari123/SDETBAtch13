package com.syntax.class15;

public class Task5a {
    //              This is the second way of Task5a
    //  Create a method createEmail(). Based on values of users name,
    //  lastName and email type, your method should return complete email Address.
     // Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com

        String completeEmail() {
        String firstname = "ali";
        String lastname = "alican";
        String email = "@yahoo.com";
        return firstname + lastname + email;
    }

    public static void main(String[] args) {

        Task5a task = new Task5a();
        String  s = task.completeEmail ();
        System.out.println (  s );
    }
}


