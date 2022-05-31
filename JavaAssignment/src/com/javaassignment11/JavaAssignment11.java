package com.javaassignment11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaAssignment11 {

    public static void main(String[] args) {
//        System.out.println("hi");
        File file = new File(args[0]);// /home/ashukr/IdeaProjects/JavaAssignment/src/com/javaassignment11/input
//        System.out.println("hello" + args[0]);
        try{
            Scanner scanner = new Scanner(file);
            Map<Character,Integer> map = new HashMap<Character,Integer>();
            while(scanner.hasNext()) {
                for (char character : scanner.nextLine().toCharArray()) {
                    if(map.containsKey(character)) {
                        int value = map.get(character);
                        map.replace(character,value,value+1);
//                        System.out.println("hi");
                    }
                    else
                        map.put(character,1);
                }
            }
            PrintWriter writer = new PrintWriter("/home/ashukr/IdeaProjects/JavaAssignment/src/com/javaassignment11/output.txt");
            for (Character character:map.keySet())
                writer.println(character+":"+map.get(character));

            writer.close();
        }
        catch (FileNotFoundException e){
            System.out.println("File not found");
        }

    }
}
//
//What is Lorem Ipsum?
//        Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.