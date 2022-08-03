package review13;

import com.syntax.utils.ConfigReader;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigFiles {
    public static void main(String[] args) {
       //this example is about to read data from a file, "Config.properties"

        //see "Config.properties" file in folder named "Files" on top of packages on the left Project.
       //see "ConfigReader" file in utils package.

        //location of the file in project
        // use Relative path  (Path from content root)
        String path="Files/Config.properties";
        FileInputStream fileInputStream=null;
        try {
            //Create a link between your java program and this file
            fileInputStream=new FileInputStream(path);
            //special class that we can use to rad  Properties
            Properties properties=new Properties();
            //Loading the data from the file inside the properties object
            properties.load(fileInputStream);
            System.out.println(properties.getProperty("password"));
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            ConfigReader.closeFile(fileInputStream);
        }
    }
}