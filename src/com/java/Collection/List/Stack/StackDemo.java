package com.java.Collection.List.Stack;

import java.util.List;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();

        //push method
        stack.push(20);
        stack.push(80);
        stack.push(50);
        stack.push(60);
        stack.push(30);
        stack.push(40);
        stack.push(10);

        System.out.println("After Pushing the elements: ");
        System.out.println(stack);

        System.out.println("After poping 2 elements");
        //pop method
        stack.pop();
        stack.pop();
        System.out.println(stack);
        //search in stack
        System.out.println(stack.search(20));

        stack.clear();
        System.out.println("After deleting all the elements");
        System.out.println(stack);
    }
}
