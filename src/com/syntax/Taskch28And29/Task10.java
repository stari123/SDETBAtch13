package com.syntax.Taskch28And29;

import java.util.Iterator;
import java.util.TreeSet;

public class Task10 {
    /* from gennady
    Create the collection that will store single uniques
    Objects of a String type in which order is preserved.
    Write a logic to concatenate all string from the collection.*/

    public static void main(String[] args) {


        TreeSet<String> collect = new TreeSet<>();
        collect.add("Create");
        collect.add("the");
        collect.add("collection");
        collect.add("that");
        collect.add("will");
        collect.add("store");
        collect.add("single");
        collect.add("uniques");
        collect.add("Objects");
        collect.add("of");
        collect.add("a");
        collect.add("String");
        collect.add("type");
        collect.add("in");
        collect.add("which");
        collect.add("order");
        collect.add("is");
        collect.add("preserved");
        collect.add("Write");
        collect.add("a");
        collect.add("logic");
        collect.add("to");
        collect.add("concatenate");
        collect.add("all");
        collect.add("string");
        collect.add("from");
        collect.add("the");
        collect.add("collection");

        String concat = "";

        Iterator<String> iterator = collect.iterator();
        while (iterator.hasNext()) {
            String it = iterator.next();
            concat += (it + " ");
        }

        System.out.println(concat);

    }
}

