package com.javaassignment5.ashutosh.assignment.singleton;

public class Static {
    String name;
    public static Static method(String str){

        Static obj = new Static();
        obj.name = str;
        return obj;
    }
    public void printName(){
        System.out.println("Name : "+name);
    }
}