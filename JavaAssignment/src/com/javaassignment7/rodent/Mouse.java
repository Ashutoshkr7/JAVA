package com.javaassignment7.rodent;

public class Mouse extends Rodent{
    Mouse(){
        System.out.println("I am a Mouse class Object");
    }

    @Override
    public void eats(){
        System.out.println("Mice consume grains,fruits and seeds");
    }

    @Override
    public  void walks(){
        System.out.println("mice are capable of walking and running");
    }
}