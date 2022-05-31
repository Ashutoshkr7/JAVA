package com.javaassignment5.ashutosh.assignment.main;

import com.javaassignment5.ashutosh.assignment.data.Uninitialized;
import com.javaassignment5.ashutosh.assignment.singleton.Static;

public class Main {
    public static void main(String[] args) {
        Static singleton = Static.method("Ashutosh");
        singleton.printName();

        Uninitialized obj = new Uninitialized();
        obj.printLocalVariables();
        obj.printInstanceVariables();
    }
}