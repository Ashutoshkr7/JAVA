package com.lamdasandstreams;

//implementing functional interface with lambda expressions
@FunctionalInterface
interface Demo{
    public void demoMethod();
}
interface DemoTwo{
    public void demoTwoMethod(int a,int b);
}
public class functionalInterfaceWithLambdaExpressions {
    public static void main(String[] args) {

        //Lambda expression for Demo interface
        //functional interface provides reference to the lambda expression
        Demo demoInstance = ()-> System.out.println("Hello Person1...");
        demoInstance.demoMethod();

        //We can redefine the function with a different reference and functionality
        Demo demoInstanceTwo = ()-> System.out.println("Hello Person2...");
        demoInstanceTwo.demoMethod();

        DemoTwo demoTwoInstance = (a,b)-> System.out.println("The sum is :"+(a+b));
        demoTwoInstance.demoTwoMethod(4,7);
    }
}
