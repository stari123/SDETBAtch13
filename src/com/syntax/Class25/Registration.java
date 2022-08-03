package com.syntax.Class25;

    public class Registration {

        /* HW4Registration:
         * Create Registration Class in which you would have variables as email,
         * userName and password that have an access scope only within its own class.
         * After creating an object of the class user should be able to call methods and
         * in each method separately pass values to set users email, username and password.
         * Requirements:
         * Valid email consider to be only yahoo
         * Valid userName and password cannot be empty and should be of length larger than 6 characters.
         * Also valid password cannot contain userName.
         */


        private String email;
        private String userName;
        private String password;


        public void setEmail(String email) {
            this.email = email;
            if (!email.contains("yahoo.com")) {
                System.out.println("Email has to be with yahoo domain ONLY!");
            }
        }

        public void setUserName(String userName) {
            this.userName = userName;
            if (userName.isEmpty()) {
                System.out.println("User name must not be empty");
            } else if (userName.length() < 6) {
                System.out.println("User name length must be larger then 6 characters");
            }
        }

        public void setPassword(String password) {
            this.password = password;
            if (password.equals(userName)) {
                System.out.println("Password cannot be same as user name!");
            } else if (password.isEmpty()) {
                System.out.println("Password must not be empty");
            } else if (password.length() < 6) {
                System.out.println("Password length must be larger then 6 characters");
            }
        }

        public String getEmail(){
            return email;
        }

        public String getUserName(){
            return userName;
        }
        public String getPassword(){
            return password;
        }


    }

