package review13;

import com.syntax.utils.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ExcelFileDemo2 {
    //this example is about to read data from an excel file, "SDETBatch13.xlsx"

    //see "SDETBatch13.xlsx" file in folder named "Files" on top of packages on the left Project.
    //see "ExcelReader" file in utils package.

    public static void main(String[] args) throws IOException {
        List<Map<String,String>> excelData= ExcelReader.read("Files/SDETBatch13.xlsx");
        System.out.println(excelData);
        System.out.println(excelData.get(0).get("Country"));

    }
}