package com.syntax.Class32;

import com.syntax.utils.Constants;
import com.syntax.utils.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ExceptionDemo1 {
    public static void main(String[] args) {
        try {
            List<Map<String, String>> excelData = ExcelReader.read ( Constants.ExcelFilePath );
        /* Map<String ,String> firstRow=excelData.get(1);
        System.out.println(firstRow.get("LastName"));
        System.out.println(firstRow.get("Age"));  */
            for (Map<String, String> row : excelData
            ) {
                for (Map.Entry<String, String> entry : row.entrySet ()
                ) {
                    System.out.println ( entry.getKey () + " " + entry.getValue () );
                }
                System.out.println ( "***************" );
            }
        } catch (IOException io) {
            System.out.println ( "Please check the path of the file" );
        }
        System.out.println ( "import line of code" );
    }
}