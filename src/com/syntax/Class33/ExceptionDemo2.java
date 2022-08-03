package com.syntax.Class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        String path="Files/Config.properties";
        try {
            FileInputStream fileInputStream=new FileInputStream(path);
        } catch (FileNotFoundException e) {
            System.out.println("The file path is not correct please double check it");
        }
    }
}
