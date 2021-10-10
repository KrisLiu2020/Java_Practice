package com.lph.first;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Kris");
        names.add("Tom");
        names.add("Heather");
        names.add("Sally");

        for(String studentName: names) {
            System.out.println(studentName);//studentName is a temp name that will be destroyed outside the block
        }

        String name = "Susan";
        String anotherName = name.toLowerCase();// assign the toLowerCase delivered value to a new var
        System.out.println(name);// the original
        System.out.println(anotherName);
        System.out.println(name.toUpperCase());// anonymous var which isn't stored and re-accessible
    }
}

// for loop is indefinite
// for each loop is definite, you can stop it as the condition set
