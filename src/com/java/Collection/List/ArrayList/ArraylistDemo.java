package com.java.Collection.List.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        //Adding values to the Arraylist
        for(int i=0;i<10;i++){
            double p=Math.random();
            int num=(int)(p*100);
            list.add(num);
        }
        System.out.println(list);

        //Adding at particular Index
        list.add(2,10);
        System.out.println(list);

        //get element Of a particular index
        System.out.println(list.get(10));

        //cloning a list
        Object list1=list.clone();
        System.out.println(list1);

        //addAll,another list created
        ArrayList<Integer>anotherList=new ArrayList<>();
        anotherList.add(1);
        anotherList.add(2);
        anotherList.add(3);
        anotherList.add(4);
        anotherList.add(5);
        anotherList.add(6);
        list.addAll(anotherList);
        System.out.println(list);

        //clear a list
//        anotherList.clear();
//        System.out.println(anotherList);

        //contains an element
        System.out.println(list.contains(5));

        //ensure capacity
        list.ensureCapacity(100);

        //contains
        System.out.println(list.contains(10));

        //remove atIndex
        System.out.println(list.remove(5));

        //remove all
        System.out.println(anotherList.removeAll(anotherList));
        System.out.println(anotherList);

        //equals
        System.out.println(list.equals(list1));

        //iterator
        for(Integer i:list){
            System.out.print(i+" ");
        }

        System.out.println("Iterator");
        Iterator iter = list.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next()+"->");
        }

    }
}
