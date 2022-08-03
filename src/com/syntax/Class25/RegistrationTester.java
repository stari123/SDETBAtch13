package com.syntax.Class25;

//import com.syntax.hometasks.Registration;

    public class RegistrationTester {
        public static void main(String[] args) {
            Registration reg = new Registration();
            reg.setEmail("123adgt@yahoo.com");
            System.out.println("Email: "+reg.getEmail());
            reg.setUserName("Maksig007");
            System.out.println("User name: "+reg.getUserName());
            reg.setPassword("12336548");
            System.out.println("Password:"+reg.getPassword());
        }
    }

