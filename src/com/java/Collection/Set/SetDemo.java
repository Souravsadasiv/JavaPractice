package com.java.Collection.Set;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> hashedSet=new HashSet<String>();
            hashedSet.add("Sourav");
            hashedSet.add("Sourav");
            hashedSet.add("Sourav");
            hashedSet.add("Rashmi");
            hashedSet.add("Jyoti");
            hashedSet.add("Jitesh");
            hashedSet.add("Mitesh");
//            hashedSet.toArray();
            boolean isempty=hashedSet.isEmpty();
        System.out.println(isempty);
        System.out.println(hashedSet);

        hashedSet.clear();
        System.out.println("after clearing the set: ");
        System.out.println(hashedSet);
    }
}
