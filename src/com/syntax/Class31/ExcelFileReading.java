package com.syntax.Class31;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelFileReading {
    public static void main(String[] args) throws IOException {
        String path = "Files/SDETBatch13.xlsx";
        FileInputStream fileInputStream = new FileInputStream ( path );
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook ( fileInputStream );
        Sheet sheet = xssfWorkbook.getSheet ( "Sheet1" );
        //how many rows contain the data in a sheet
        int noOfRows = sheet.getPhysicalNumberOfRows ();
        for (int i = 0; i < noOfRows; i++) {
            Row row = sheet.getRow ( i );
            //how many cells contain the data in a row

            int noOfCells = row.getPhysicalNumberOfCells ();
            //below loop prints all the data from cells in a single line
            for (int j = 0; j < noOfCells; j++) {
                System.out.print ( row.getCell ( j ) + " " );
            }
            System.out.println ();
        }
        fileInputStream.close ();
    }
}       //This file is the same with file ExcelDemo1 in class30