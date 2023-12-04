package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int numElements = 100000;
        int numInsertions = 1000;

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        System.out.println("Number of items in the list: " + numElements);
        System.out.println("Number of items insertions: " + numInsertions);

        System.out.println();

        fill(arrayList, numElements, "Array List");
        fill(linkedList, numElements, "Linked List");

        System.out.println();

        randomAccess(arrayList, "Array List");
        randomAccess(linkedList, "Linked List");

        System.out.println();

        sequentialAccess(arrayList, "Array List");
        sequentialAccess(linkedList, "Linked List");

        System.out.println();

        insertAtStart(arrayList, numInsertions, "Array List");
        insertAtStart(linkedList, numInsertions, "Linked List");

        System.out.println();

        insertAtEnd(arrayList, numInsertions, "Array List");
        insertAtEnd(linkedList, numInsertions, "Linked List");

        System.out.println();

        insertInMiddle(arrayList, numElements, numInsertions, "Array List");
        insertInMiddle(linkedList, numElements, numInsertions, "Linked List");
    }

    private static void fill(List<Integer> list, int count, String listType) {
        long startTime = System.currentTimeMillis();
        Random random = new Random();

        for (int i = 0; i < count; i++) {
            list.add(random.nextInt(count));
        }

        System.out.printf("Fill %s: %d ms%n", listType, System.currentTimeMillis() - startTime);
    }

    private static void randomAccess(List<Integer> list, String listType) {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < list.size(); i++) {
            int element = list.get(i);
        }

        System.out.printf("Random access in %s: %d ms%n", listType, System.currentTimeMillis() - startTime);
    }

    private static void sequentialAccess(List<Integer> list, String listType) {
        long startTime = System.currentTimeMillis();

        for (Integer element : list) {
            int value = element;
        }

        System.out.printf("Sequential access in %s: %d ms%n", listType, System.currentTimeMillis() - startTime);
    }

    private static void insertAtStart(List<Integer> list, int numInsertions, String listType) {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < numInsertions; i++) {
            list.add(0, i);
        }

        System.out.printf("Insert at the beginning of %s: %d ms%n", listType, System.currentTimeMillis() - startTime);
    }

    private static void insertAtEnd(List<Integer> list, int numInsertions, String listType) {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < numInsertions; i++) {
            list.add(i);
        }

        System.out.printf("Insert at the end of %s: %d ms%n", listType, System.currentTimeMillis() - startTime);
    }

    private static void insertInMiddle(List<Integer> list, int numElements, int numInsertions, String listType) {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < numInsertions; i++) {
            int index = numElements / 2;
            list.add(index, i);
        }

        System.out.printf("Insert in the middle of %s: %d ms%n", listType, System.currentTimeMillis() - startTime);
    }
}