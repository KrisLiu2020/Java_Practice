package com.lph.linkedList;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {

    private static final String[] COLOURS = {"black", "yellow", "green", "blue", "violet", "silver"};
    private static final String[] MORE_COLOURS = {"gold", "white", "brown", "blue", "gray", "silver"};

    public ListDemo() {
        List<String> l1 = new LinkedList<>();
        List<String> l2 = new LinkedList<>();

        for (String color : COLOURS) {
            l1.add(color);
        }
        for (String color : MORE_COLOURS){
            l2.add(color);
        }

        l1.addAll(l2);
        printList(l1);
        convertToUppercaseStrings(l1);
        printList(l1);

        System.out.print("\nDeleting elements 4 to 6...");
        removeItems(l1, 4, 7);
        printList(l1);
        printReversedList(l1);
    }

    public void printList(final List<String> list){
        System.out.println("\nlist: ");

        for(String color: list) {
            System.out.printf("%s ", color);
        }

        System.out.println();
    }

    public void convertToUppercaseStrings(final List<String> list) {
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()){
           String color = iterator.next();
           iterator.set(color.toUpperCase());
        }
    }

    public void removeItems(final List<String> list, final int start, final int end) {
        list.subList(start, end).clear();
    }

    private void printReversedList(final List<String> list){
        ListIterator<String> iterator = list.listIterator(list.size());
        System.out.println("\nReversed List: ");
        while(iterator.hasPrevious()) {
            System.out.printf("%s ", iterator.previous());
        }
    }

    public static void main(final String[] args) {
        new ListDemo(){};
    }
}
