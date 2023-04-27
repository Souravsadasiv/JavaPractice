package com.java.Collection.List.Vector;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class VectorDemo {
    static void print(List<String> vec){
        Iterator<String> iter= vec.iterator();
        while(iter.hasNext()){
            System.out.print("\""+iter.next()+"\""+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Vector<String> vec=new Vector<String>();
        vec.addElement("Apple");
        vec.addElement("Grapes");
        vec.addElement("Fig");
        vec.addElement("Mango");
        vec.addElement("Orange");

        System.out.println(vec.size());

        vec.addElement("Banana");
        vec.addElement("Guava");
        System.out.println(vec.size());
        print(vec);

        System.out.println(vec.contains("Banana"));
        System.out.println(vec.elementAt(5));
        System.out.println(vec.firstElement());
        System.out.println(vec.lastElement());
        vec.removeElement("Banana");
        print(vec);
//        vec.removeAll(vec);
//        print(vec);
    //Basics
        //sublist
        List subList=vec.subList(2,5);
        print(subList);
    }
}
