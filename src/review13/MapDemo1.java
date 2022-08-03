package review13;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo1 {
    public static void main(String[] args) {
        // // see person class for this MapDemo1

        // we want to get key and values together

        Map<String,Person> personMap= new HashMap<>();
        personMap.put("1",new Person("1","Jason",25,"Programmer"));
        personMap.put("2",new Person("2","James",26,"SDET"));
        personMap.put("3",new Person("3","Mike",28,"PO"));
        personMap.put("4",new Person("4","Adam",22,"QA Manager"));
        personMap.put("5",new Person("5","Ali",21,"Architect"));
        //Getting a set of Entries
        Set<Entry<String,Person>> entries= personMap.entrySet();
        // Removing those entries which contain the key 4 or if age of person object is greater than 22
        entries.removeIf(entry-> entry.getKey().equals("4")||entry.getValue().getAge()>22);
        System.out.println(personMap);


    }
}