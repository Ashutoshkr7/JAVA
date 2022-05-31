package com.javaassignment7.innerclass;

public class OuterClass2 extends OuterClass1{
    class InnerClassOuterClass2 extends OuterClass1.InnerClassOuterClass1{

        InnerClassOuterClass2(String name) {
            super(name);
        }
    }
}
