package in.cashify.collections;

import java.util.HashMap;

public class MapClass {

    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("name","Ananya");
        hashMap.put("age",25);
        hashMap.put(10,"hello");
        hashMap.put(null,null);

        System.out.println("Map size: "+hashMap.size());
        System.out.println(hashMap);
        hashMap.remove(10);
        System.out.println("Map after removing key 10");
        System.out.println(hashMap);
        System.out.println("Name is "+hashMap.get("name")+" and age is "+hashMap.get("age"));
    }
}
