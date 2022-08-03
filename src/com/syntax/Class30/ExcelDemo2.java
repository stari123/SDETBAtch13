package com.syntax.Class30;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelDemo2 {
        //How to create Excel files using apache poi and java.
    //when we run this code DemoFile.xlsx is created in Files folder (in Files Package)
    // in automation, we create excel files and use java to manipulate it

    public static void main(String[] args) throws IOException {
        //path of the file
        String path="Files/DemoFile.xlsx";
        //special class that knows how to handle Excel files
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook();
        Sheet sheet=xssfWorkbook.createSheet("Oleg");
        Row row=sheet.createRow(0);
        Cell cell=row.createCell(0);
        cell.setCellValue("Ali");

        FileOutputStream fileOutputStream=new FileOutputStream(path);
        xssfWorkbook.write(fileOutputStream);
        fileOutputStream.close();
    }
}