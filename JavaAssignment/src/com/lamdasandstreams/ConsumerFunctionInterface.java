package com.lamdasandstreams;

import java.util.function.Consumer;
public class ConsumerFunctionInterface {
    public void print(){
        System.out.println("This is instance method");
    }
    public static void hello(String name){
        System.out.println("Hello "+name);
    }

    public static void main(String[] args) {
        Consumer<String> consumer = s -> System.out.println("Inside consumer function");
//        consumer.accept("Student1");
        Consumer<String > consumer1 = ConsumerFunctionInterface::hello;
//        consumer1.accept("Student1");
        consumer.andThen(consumer1).accept("Student1");


    }
}