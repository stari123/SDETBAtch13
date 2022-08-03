package com.syntax.Class31;

import com.syntax.utils.Constants;
import com.syntax.utils.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ExcelReaderDemo {
    //this is demo how to use ExcelReader (see utils) +constant(see utils)

    public static void main(String[] args) throws IOException {

        List<Map<String, String>> excelData = ExcelReader.read ( Constants.ExcelFilePath );

        //to read data one by one
            //Map<String, String> firstRow = excelData.get ( 1 );
            //System.out.println ( firstRow.get ( "LastName" ) );
            //System.out.println ( firstRow.get ( "Age" ) );

        System.out.println ( "----" );

        //to read all the data, we write a loop. Two nested loop.
        for (Map<String, String> row : excelData
        ) {
            for (Map.Entry<String, String> entry : row.entrySet ()
            ) {
                System.out.println ( entry.getKey () + " " + entry.getValue () );
            }
            System.out.println ( "***************" );
        }
    }
}
            //This is how abstraction works.
            // We abstracted everything and we created method
            // and with this method we can get data by calling ExcelReader.