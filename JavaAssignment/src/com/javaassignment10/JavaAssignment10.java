package com.javaassignment10;

public class JavaAssignment10 {
    public static void main(String[] args) {
            SList<Integer> list = new SList<Integer>();
            SListIterator<Integer> iterator = list.iterator();
            iterator.add(1);
            iterator.add(2);
            System.out.println(iterator.length);
            System.out.println(iterator.toString());
    }
}
