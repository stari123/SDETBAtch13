package com.syntax.Class30;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class propertiesCreateFileDemo {
    public static void main(String[] args) throws IOException {
        //to create file with data

        //Path where we want to create the file
        String path="Files/Trump.properties";   //this file "Trump.properties" will be created in Files folder.

        //we need to go to that path to create this file
        //programmatically this is how we do that
        FileOutputStream fileOutputStream=new FileOutputStream(path);

        //create the object of properties class to store properties inside the file
        Properties properties=new Properties();

        //store key value pair inside the object
        properties.setProperty("Funny","true really");

        //store this data in the form of a file on our hard drive
        properties.store(fileOutputStream,"A new property has been added");

        // close that file
        fileOutputStream.close();
    }
}