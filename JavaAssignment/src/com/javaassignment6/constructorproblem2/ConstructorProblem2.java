package com.javaassignment6.constructorproblem2;

public class ConstructorProblem2 {
    ConstructorProblem2(String stringVariable){
        System.out.println(stringVariable);
    }

    public static void main(String[] args) {
        ConstructorProblem2 objectsArray[] = new ConstructorProblem2[2];//If we run with the below three statements commented,
        // the initialization messages from the constructor calls would not be printed. This is because constructor has not been created in the memory yet (it would be created when we use new operator).
        objectsArray[0] = new ConstructorProblem2("1st Object");
        objectsArray[1] = new ConstructorProblem2("2nd Object");
    }
}
