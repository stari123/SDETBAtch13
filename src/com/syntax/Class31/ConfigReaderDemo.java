package com.syntax.Class31;


import com.syntax.utils.ConfigReader;
import com.syntax.utils.Constants;

import java.io.IOException;
import java.util.Properties;

public class ConfigReaderDemo {
    //"ConfigReader" class is created in utils package
    //this code uses the path in "Constants" class and "ConfigReader" class from utils package to read data
    // from "Config.properties" file in Files package.
    //we dont want to rewrite the code "ConfigReader" each time, hence it is stored in utils package as "Constants"
    //same is true for ExcelReader.
    //we can use ConfigReader and ExcelReader in the future just using the path, ne need to rewrite the code again.

    public static void main(String[] args) throws IOException {
        Properties properties= ConfigReader.read(Constants.ConfigReaderPath);
        System.out.println(properties.getProperty("user"));
        System.out.println(properties.getProperty("password"));
    }
}
