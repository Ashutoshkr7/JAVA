import com.javaassignment1.JavaAssignment1;

import java.io.File;
import java.util.Scanner;
import java.util.regex.Pattern;
public class JavaAssignment1Copy {
    public void searchFile() {

        File allFilesInFolder = new File(System.getProperty("user.home"));
        Scanner sc = new Scanner(System.in);
        String choice;
        do{
            boolean fileFoundFlag = false;
            System.out.println("Enter the file name to be searched in the Home Directory:");
            String regexPattern = sc.nextLine();
            regexPattern = "(?i)(.*)"+regexPattern+"(.*)"; //(?i) - for case insensitive


            String[] allFilesList = allFilesInFolder.list();

            for (String fileName : allFilesList){
                boolean patternMatched = Pattern.matches(regexPattern, fileName);

                if(patternMatched){
                    fileFoundFlag = true;
                    System.out.println("regexPattern + "+ regexPattern);
                    System.out.println("File found at Path : "+ allFilesInFolder.getAbsolutePath() + "/"+fileName + " ");
                }
            }
            System.out.println();
            //if file not found
            if(fileFoundFlag == false)
                System.out.println("File not found.");

            System.out.println("Continue with file search?(Y/N)");
            choice = sc.nextLine();
        } while(choice.equals("Y") || choice.equals("y"));
    }

//    static void recursiveSearch1(File[] arr, int index, int level, String regexPattern){
//
//
//    }

    static void recursiveSearch(File[] arr, int index, int level, String regexPattern)
    {
        // terminate condition
        if (index == arr.length)
            return;

        boolean patternMatched = Pattern.matches(regexPattern, arr[index].getName());
//        boolean patternMatched = Pattern.matches(regexPattern, arr[index]);
        if(patternMatched){
//            fileFoundFlag = true;
//            System.out.println("patternMatched + "+ patternMatched);
//            System.out.println("regexPattern + "+ regexPattern);
//            System.out.println("arr[index].getName() +"+arr[index].getName());
//            System.out.println("File found at Path : "+ arr[index].getAbsolutePath() + "/"+arr[index].getName() + " ");
            System.out.println("File found at Path : "+ arr[index].getAbsolutePath());
//            System.out.println("File found at Path : "+ allFilesInFolder.getAbsolutePath());
        }

//         tabs for internal levels
//        for (int i = 0; i < level; i++)
//            System.out.print("\t");

//         for files
//        if (arr[index].isFile())
//            System.out.println(arr[index].getName());

            // for sub-directories
        if (arr[index].isDirectory()) {
//            System.out.println("[" + arr[index].getName()
//                    + "]");

            // recursion for sub-directories
            recursiveSearch(arr[index].listFiles(), 0,
                    level + 1, regexPattern);
        }

        // recursion for main directory
        recursiveSearch(arr, ++index, level, regexPattern);
    }

    public static void main(String[] args) {
        JavaAssignment1 obj = new JavaAssignment1();
        Scanner sc = new Scanner(System.in);
//        obj.searchFile();
//        File maindir = new File(System.getProperty("user.home"));
//        File maindir = new File("/home/ashukr/Documents");

        File maindir = new File("/home/ashukr/IdeaProjects/");
//        System.out.println(System.getProperty("user.dir"));
        String choice;
        do{
            boolean fileFoundFlag = false;
            System.out.println("Enter the file name to be searched in the Home Directory:");
            String regexPattern = sc.next();
            regexPattern = "(?i)(.*)"+regexPattern+"(.*)"; //(?i) - for case insensitive

            if (maindir.exists() && maindir.isDirectory()) {

                // array for files and sub-directories
                // of directory pointed by maindir
                File arr[] = maindir.listFiles();

                System.out.println(
                        "**********************************************");
                System.out.println(
                        "Files from main directory : " + maindir);
                System.out.println(
                        "**********************************************");

                // Calling recursive method
                recursiveSearch(arr, 0, 0, regexPattern);
            }

            if(fileFoundFlag == false)
                System.out.println("File not found.");

            System.out.println("Continue with file search?(Y/N)");
            choice = sc.nextLine();
        }
        while(choice.equals("Y") || choice.equals("y"));
//        File allFilesInFolder = new File(System.getProperty("user.home"));

//        System.out.println("Enter the file name to be searched in the Home Directory:");
//        String regexPattern = sc.next();
//        regexPattern = "(?i)(.*)"+regexPattern+"(.*)"; //(?i) - for case insensitive


//        String[] allFilesList = allFilesInFolder.list();
//        if (maindir.exists() && maindir.isDirectory()) {
//
//            // array for files and sub-directories
//            // of directory pointed by maindir
//            File arr[] = maindir.listFiles();
//
//            System.out.println(
//                    "**********************************************");
//            System.out.println(
//                    "Files from main directory : " + maindir);
//            System.out.println(
//                    "**********************************************");
//
//            // Calling recursive method
//            recursiveSearch(arr, 0, 0, regexPattern);
//        }


    }
}
//import java.io.File;
//import java.util.*;
//import java.lang.Object;
//public class JavaAssignment1Copy {
//    public static void main(String[] args) {
////        File root = new File("c:\\test");
//        File root = new File(System.getProperty("user.home"));
//        String fileName = "a.txt";
//        try {
//            boolean recursive = true;
//
//            Collection files = FileUtils.listFiles(root, null, recursive);
//
//            for (Iterator iterator = files.iterator(); iterator.hasNext();) {
//                File file = (File) iterator.next();
//                if (file.getName().equals(fileName))
//                    System.out.println(file.getAbsolutePath());
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}