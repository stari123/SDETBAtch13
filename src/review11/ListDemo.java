package review11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>();
        names.add("Zameer");
        names.add("Kat");
        names.add("Urzalla");
        names.add("Selyman");
        for (String name : names) {
            System.out.println("name = " + name);
        }


        Collections.sort(names);
        System.out.println(names);

    }
}
