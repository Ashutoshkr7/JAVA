package com.javaassignment7.interfaceassignment;

public class ExtendImplement extends ConcreteClass implements NewInterface{
    public void inputMethodInterface1(Interface1 interface1){
        System.out.println("Takes InterfaceOne as argument");
    }

    public void inputMethodInterface2(Interface2 interface2){
        System.out.println("Takes InterfaceTwo as argument");
    }

    public void inputMethodInterface3(Interface3 interface3){
        System.out.println("Takes InterfaceThree as argument");
    }

    public void inputMethodNewInterface(NewInterface interfaceTwo){
        System.out.println("Takes NewInterface as argument");
    }

    @Override
    public void method1Interface1() {
        System.out.println("method 1 Interface 1");
    }

    @Override
    public void method2Interface1() {
        System.out.println("method 2 Interface 1");
    }

    @Override
    public void method1Interface2() {
        System.out.println("method 1 Interface 2");
    }

    @Override
    public void method2Interface2() {
        System.out.println("method 2 Interface 2");
    }

    @Override
    public void method1Interface3() {
        System.out.println("method 1 Interface 3");
    }

    @Override
    public void method2Interface3() {
        System.out.println("method 2 Interface 3");
    }

    @Override
    public void methodNewInterface() {
        System.out.println("method of new Interface");
    }

    public static void main(String[] args) {
        ExtendImplement extendImplement = new ExtendImplement();
        extendImplement.inputMethodInterface1(extendImplement);
        extendImplement.inputMethodInterface2(extendImplement);
        extendImplement.inputMethodInterface3(extendImplement);
        extendImplement.inputMethodNewInterface(extendImplement);
    }
}
