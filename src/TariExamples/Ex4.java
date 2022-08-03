package TariExamples;

public class Ex4 {
    public static void main(String[] args) {

        //split the string into words.  (from mock interview question)
                
        String str=" java, selenium, testng, jenkins";

        String[] str1 = str.split ( "," );
        for (String s:str1
             ) {
            System.out.println ( s );

    }
}}
