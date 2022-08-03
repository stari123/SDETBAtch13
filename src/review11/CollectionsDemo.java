package review11;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {
        List<Integer> arrayList= Arrays.asList(1,2,4,4,3,4,5,5,5,5);
        System.out.println(arrayList);
        System.out.println(Collections.frequency(arrayList,5));

    }
}