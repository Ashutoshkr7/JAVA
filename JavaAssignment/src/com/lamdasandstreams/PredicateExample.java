package com.lamdasandstreams;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {

        Predicate<Integer> predicate = integer -> integer%2 == 0 ;
        Predicate<Integer> predicate1 = integer -> integer%3 == 0;

        Predicate<Integer> predicate4 = predicate.negate();
        //to check if 9 is not divisible by 2 & 3
        System.out.println(predicate4.test(9));//it negates the result of former predicate used

        System.out.println(predicate.test(6)); //to check if 6 is divisible by 2 & 3

    }
}