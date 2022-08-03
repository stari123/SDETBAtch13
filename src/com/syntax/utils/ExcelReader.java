package com.syntax.utils;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class ExcelReader {
    public static List<Map<String, String>> read(String path) throws IOException {
        FileInputStream fileInputStream = new FileInputStream ( path );
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook ( fileInputStream );
        Sheet sheet = xssfWorkbook.getSheet ( "Sheet1" );  // change sheet number if u r reading a different sheet.
        //how many rows contain the data in a sheet
        int noOfRows = sheet.getPhysicalNumberOfRows ();
        //we will store the data of cells in the map and will store those maps in a list
        List<Map<String, String>> excelData = new ArrayList<> ();
        //this map will hold the data for rows
        LinkedHashMap<String, String> rowData;
        //Contains all the keys that we will use in a map
        Row headerRow = sheet.getRow ( 0 );
        for (int i = 1; i < noOfRows; i++) {
            Row dataRow = sheet.getRow ( i );
            rowData = new LinkedHashMap<> ();
            //how many cells contain the data in a dataRow
            int noOfCells = dataRow.getPhysicalNumberOfCells ();

            //below loop prints all the data from cells in a single line

            for (int j = 0; j < noOfCells; j++) {

                //headerRow.getCell(j).toString() will give us cell values from dataRow 0 one by one
                String key = headerRow.getCell ( j ).toString ();
                //dataRow.getCell(j).toString() getting the data from all cells one by one for each dataRow
                String value = dataRow.getCell ( j ).toString ();
                rowData.put ( key, value );
            }
            excelData.add ( rowData );
        }
        fileInputStream.close ();
        return excelData;
    }
}
            // first we used Hashmap which does not hold order,
            // then we changed to linkedHashmap to keep the order.
            // line 22 and 27, HashMap changed to LinkedHashMap
