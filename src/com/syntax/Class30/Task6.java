package com.syntax.Class30;

import java.util.LinkedHashSet;

public class Task6 {
    /* Create the collection that will store single unique Objects of a String type in which order is preserved.
        Write a logic to concatenate all string from the collection.   */

    //use LinkedHashSet because order is preserved
    public static void main(String[] args) {
        LinkedHashSet<String> collection= new LinkedHashSet<>();
        collection.add("Hello");
        collection.add("World");
        collection.add("Welcome");
        collection.add("to");
        collection.add("Syntax");

        // use StringBuilder to append the values
        StringBuilder allValues= new StringBuilder();
        for (String val:collection
        ) {
            allValues.append(val+" ");
        }
        System.out.println(allValues);
    }
}
