package com.java.Collection.List.LinkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

    static void print(LinkedList<String> list){
        Iterator<String> iter= list.iterator();
        while(iter.hasNext()){
            System.out.print("\""+iter.next()+"\""+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {

        LinkedList<String> list=new LinkedList<>();
        list.add("Sourav");
        list.add("Rashmi");
        list.add("Jyoti");
        list.add("Jitesh");
        //printing
        print(list);

        list.addLast("Mitesh");
        list.addFirst("Sarmila");
        list.addLast("Sourav");

        print(list);

        int firstIndex=list.indexOf("Sourav");
        int lastIndex=list.lastIndexOf("Sourav");
        System.out.println("First Index : "+firstIndex+"\nLast Index : "+lastIndex);

        //converting linkedlist to arraylist
        List<String> list1=new ArrayList<String>(list);
    }
}
