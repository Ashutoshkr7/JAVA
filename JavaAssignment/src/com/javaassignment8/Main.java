package com.javaassignment8;

public class Main {
    public void demoMethod(String typeOfException) throws Exception1, Exception2, Exception3 {
        if(typeOfException.equals("1"))
            throw new Exception1("Throw Exception 1");
        else if(typeOfException.equals("2"))
            throw new Exception2("Throw Exception 2");
        else if(typeOfException.equals("3"))
            throw new Exception3("Throw Exception 3");
        else
            return;
    }

    public static void main(String[] args) {

        try {
            Main object = new Main();
//            Main nullObject = null;
//            nullObject.toString();
            object.demoMethod("1");

        }
        catch (Exception exception){
            exception.printStackTrace();
        }
        finally {
            System.out.println("Executing the finally block");
        }

    }

}
