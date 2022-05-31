package com.javaassignment6.constructor;

public class Constructor {
    String name;
    int rollNo;
    Constructor(String name){
        this.name = name;
    }
    Constructor(String name,int rollNo){
        this(name);
        this.rollNo = rollNo;
    }
}