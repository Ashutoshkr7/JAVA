package com.javaassignment9;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaAssignment9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence : ");
        String sentence = scanner.nextLine();
        StartsCapitalEndsPeriod(sentence);
    }

    private static void StartsCapitalEndsPeriod(String sentence) {
//        Pattern pattern = Pattern.compile("[A-Z].+[.]");
        Pattern pattern = Pattern.compile("[A-Z]"+"(.*)"+"[.]");
        Matcher matcher = pattern.matcher(sentence);
        if(matcher.find()&& matcher.group().equals(sentence))
            System.out.println("The sentence starts with a capital letter and ends with a period(.)");
        else
            System.out.println("The sentence either doesn't starts with a capital letter or doesn't ends with a period(.)");
    }
}
