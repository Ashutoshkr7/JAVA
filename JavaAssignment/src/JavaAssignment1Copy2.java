import java.io.File;
import java.util.Scanner;
import java.util.regex.Pattern;


public class JavaAssignment1Copy2 {
    static int count = 0;
    static void recursiveSearch(File[] arr, int index, int level, String regexPattern, Boolean fileFoundFlag)
    {
        // terminate condition
        if (index == arr.length)
            return;
        fileFoundFlag = false;
        boolean patternMatched = Pattern.matches(regexPattern, arr[index].getName());

        if(patternMatched){
            System.out.println("File found at Path : "+ arr[index].getAbsolutePath());
            fileFoundFlag = true;
            count++;
        }

        if (arr[index].isDirectory())
            recursiveSearch(arr[index].listFiles(), 0, level + 1, regexPattern, fileFoundFlag);

        // recursion for main directory
        recursiveSearch(arr, ++index, level, regexPattern, fileFoundFlag);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        File maindir = new File("/home/ashukr/IdeaProjects/");
        String choice;
        do {
            boolean fileFoundFlag = false;
            System.out.println("Enter the file name to be searched in the Home Directory:");
            String regexPattern = sc.next();
            regexPattern = "(?i)(.*)"+regexPattern+"(.*)"; //(?i) - for case insensitive
            if (maindir.exists() && maindir.isDirectory()) {
//                 fileFoundFlag = true;
                // array for files and sub-directories
                // of directory pointed by maindir
                File[] arr = maindir.listFiles();
                System.out.println(
                        "**********************************************");
                System.out.println(
                        "Files from main directory : " + maindir);
                System.out.println(
                        "**********************************************");
                // Calling recursive method
                recursiveSearch(arr, 0, 0, regexPattern, fileFoundFlag);
            }

//            if(fileFoundFlag == false)
                if(count == 0)
                System.out.println("File not found.");

            System.out.println("Continue with file search?(Y/N)");
            choice = sc.next();
        }
        while(choice.equals("Y") || choice.equals("y"));
    }
}
