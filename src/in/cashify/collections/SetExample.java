package in.cashify.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {

//HashSet allows null, does not allow duplicates
// order of entries??
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(10);
        hashSet.add(2);
        hashSet.add(13);
        hashSet.add(9);
        hashSet.add(9);
        hashSet.add(null);
        hashSet.add(null);
        System.out.println("HashSet --> "+hashSet);

//Linked HashSet maintains insertion order
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(10);
        linkedHashSet.add(2);
        linkedHashSet.add(13);
        linkedHashSet.add(9);
        linkedHashSet.add(9);
        linkedHashSet.add(null);
        linkedHashSet.add(null);
        System.out.println("Linked HashSet --> "+linkedHashSet);

//Doesn't take null values,entries are sorted in a specific order
        TreeSet<Integer> treeSet = new TreeSet();
        treeSet.add(10);
        treeSet.add(2);
        treeSet.add(13);
        treeSet.add(9);
        treeSet.add(9);
//treeSet.add(null);
        System.out.println("Tree Set --> "+treeSet);



    }



}


