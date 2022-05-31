package com.lamdasandstreams;

class Sample {
    Sample(){
        System.out.println("Sample Class Constructor execution & Object Creation");
    }
}

interface Interf{
    public Sample get();
}

public class ConstructorReferenceExample {
    public static void main(String[] args){
        Interf i = Sample :: new;
        Sample s = i.get();
    }
}