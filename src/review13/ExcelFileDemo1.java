package review13;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelFileDemo1 {
    //this example is about to read data from an excel file, "SDETBatch13.xlsx"

    //see "SDETBatch13.xlsx" file in folder named "Files" on top of packages on the left Project.
    //see "ExcelReader" file in utils package.

    public static void main(String[] args) {
        String path="Files/SDETBatch13.xlsx";
        try {
            FileInputStream fileInputStream=new FileInputStream(path);
            XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
            Sheet sheet=  xssfWorkbook.getSheet("Persons");
            int noOfRows=sheet.getPhysicalNumberOfRows();
            for(int rowNo=0;rowNo<noOfRows;rowNo++){
                Row row=sheet.getRow(rowNo);
                int noOfCells=row.getPhysicalNumberOfCells();

                for (int cellNo = 0; cellNo < noOfCells; cellNo++) {
                    System.out.print(row.getCell(cellNo)+" ");
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
