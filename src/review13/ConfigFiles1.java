package review13;

import com.syntax.utils.ConfigReader;

import java.io.IOException;
import java.util.Properties;

public class ConfigFiles1 {
    //this example is about to read data from a file, "Config.properties"

    //see "Config.properties" file in folder named "Files" on top of packages on the left Project.
    //see "ConfigReader" file in utils package.

    public static void main(String[] args) throws IOException {

        Properties properties= ConfigReader.read("Files/Config.properties");
        System.out.println(properties.getProperty("user"));
        System.out.println(properties.getProperty("password"));
        System.out.println(properties.getProperty("URL"));


    }
}