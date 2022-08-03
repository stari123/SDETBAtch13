package review12;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class SetsDemo1 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(20);
        numbers.add(10);
        //new LinkedHashSet<>(numbers) => converting the ArrayList to a Set
        //new ArrayList<>( new LinkedHashSet<>(numbers))=> converting set back to ArrayList
        numbers=new ArrayList<>( new LinkedHashSet<>(numbers));
        System.out.println(numbers);
    }
}
