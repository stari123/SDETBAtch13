package com.syntax.Class31;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExcelFileReadingAndStoring {
    public static void main(String[] args) throws IOException {
        //We will use this code to read and write data.
        // we will use this when we create our framework.
        //we will use it in our work, copy and paste, no need to write it each time
        // very important to understand. maybe asked in interview.
        //with utils package we can use this code in our framework and job.
        //since we are going to use this again and again we create a function for that, see utils package.
        // we will see this utils package in company work too, it is standard.


        String path = "Files/SDETBatch13.xlsx";
        FileInputStream fileInputStream = new FileInputStream ( path );
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook ( fileInputStream );
        Sheet sheet = xssfWorkbook.getSheet ( "Sheet1" );

        //how many rows contain the data in a sheet
        int noOfRows = sheet.getPhysicalNumberOfRows ();

        // we will store the data of cells in the map and will store those maps in a list.
        //we create list of maps, each row will have a new map that will store data of that row.
        List<Map<String, String>> excelData = new ArrayList<> ();

        //this map will hold the data for rows
        HashMap<String, String> rowData;

        //Contains all the keys that we will use in a map
        Row headerRow = sheet.getRow ( 0 );  // this line will get header row,
        // and we will need a loop to go through all the cells.
        for (int i = 1; i < noOfRows; i++) {    //we start from i=1, because we already got header and now we are getting the data
            Row dataRow = sheet.getRow ( i );
            rowData = new HashMap<> ();   // new map for each row
            //how many cells contain the data in a dataRow
            int noOfCells = dataRow.getPhysicalNumberOfCells ();  // number of cells is 4, so we need a loop.

            // below loop prints all the data from cells in a single line
            for (int j = 0; j < noOfCells; j++) {
                //headerRow.getCell(j).toString() will us cell values from dataRow 0 one by one
                String key = headerRow.getCell ( j ).toString ();
                //dataRow.getCell(j).toString() getting the data from all cells one by one for each dataRow
                String value = dataRow.getCell ( j ).toString ();
                rowData.put ( key, value );
            }
            excelData.add ( rowData );
        }
        System.out.println ( excelData );
        fileInputStream.close ();
    }
}
