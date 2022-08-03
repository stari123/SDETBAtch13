package com.syntax.Class28;

import java.util.ArrayList;

public class Task3Ch26Hw {
    public static void main(String[] args) {
        ArrayList<String> words=new ArrayList<>();
        words.add("Hope");
        words.add("Play");
        words.add("Come");
        words.add("Frame");
        words.add("game");

        words.removeIf( nat -> nat.endsWith("e"));
        System.out.println ( "words = " + words );
    }
}

