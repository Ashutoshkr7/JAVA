package com.javaassignment4;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

public class JavaAssignment4 {


    public static void formDateRange(int numberOfTestCases, Scanner keyboard) throws ParseException {
        while(numberOfTestCases-- >0 ){
            System.out.println("Enter the signup date (dd-mm-yyyy):");
            String date1=keyboard.next();
            System.out.println("Enter the current date (dd-mm-yyyy):");
            String date2=keyboard.next();
            Date signupDate=new SimpleDateFormat("dd-MM-yyyy").parse(date1);
            Date currentDate=new SimpleDateFormat("dd-MM-yyyy").parse(date2);
            if(currentDate.compareTo(signupDate)>0) {
                Date start,end,cal;
                cal=signupDate;
                cal.setYear(currentDate.getYear());
                Calendar calendar=Calendar.getInstance();
                calendar.setTime(cal);
                calendar.add(Calendar.DATE, 30);
                end=calendar.getTime();
                calendar.add(Calendar.DATE,-60);
                start=calendar.getTime();
                if(end.compareTo(currentDate)>0) {
                    end = currentDate;
                }
                SimpleDateFormat print=new SimpleDateFormat("dd-MM-yyyy");
                System.out.println("The allowable date range for the form date is :");
                System.out.println(print.format(start)+"  "+print.format(end));

            }
            else
                System.out.println("No range");
        }
    }


    public static void main(String[] args) throws ParseException {
        Scanner keyboard = new Scanner(System.in);

        int numberOfTestCases;

        System.out.println("Enter No Of Test Case");
        numberOfTestCases = keyboard.nextInt();

        formDateRange(numberOfTestCases, keyboard);
    }
}