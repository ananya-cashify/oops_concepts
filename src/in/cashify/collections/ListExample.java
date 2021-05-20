package in.cashify.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListExample {
    public static void main(String[] args) {

/**
 Allows duplicates and null values
 Manipulation is slow and uses an array internally
 ArrayList is better for storing and accessing data.
 */
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(10);
        arrayList.add(2);
        arrayList.add(13);
        arrayList.add(9);
        arrayList.add(9);
        arrayList.add(null);
        arrayList.add(null);

        System.out.println("Array List --> "+arrayList);

/**
 Manipulation is faster as it uses a doubly linked list
 LinkedList is better for manipulating data.
 */
        LinkedList<Integer> linkedList = new LinkedList();
        linkedList.add(10);
        linkedList.add(2);
        linkedList.add(13);
        linkedList.add(9);
        linkedList.add(9);
        linkedList.add(null);
        linkedList.add(null);
        System.out.println("Linked List --> "+linkedList);
        System.out.println("First of linkedlist :"+linkedList.getFirst());
        System.out.println("Last of linkedlist :"+linkedList.getLast());
    }
}

