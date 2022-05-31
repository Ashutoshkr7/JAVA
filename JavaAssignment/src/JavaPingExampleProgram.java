import java.io.*;
import java.util.*;

public class JavaPingExampleProgram
{

    public static void main(String args[])
            throws IOException
    {
        // create the ping command as a list of strings
        JavaPingExampleProgram ping = new JavaPingExampleProgram();
        List<String> commands = new ArrayList<String>();
        commands.add("ping");
        commands.add("-c");
        commands.add("3");
//        commands.add("74.125.236.73");
//        commands.add("142.251.42.100");
//        commands.add("www.google.com");
        commands.add("127.0.0.1");
//        commands.add("hostname");
//        ping.doCommand(commands);
    }

//    public void doCommand(List<String> command)
//            throws IOException
//    {
//        String s = null;
//        String time = "";
//
//        ProcessBuilder pb = new ProcessBuilder(command);
//        Process process = pb.start();
//
//        BufferedReader stdInput = new BufferedReader(new InputStreamReader(process.getInputStream()));
//        BufferedReader stdError = new BufferedReader(new InputStreamReader(process.getErrorStream()));
//
//        // read the output from the command
//        System.out.println("Here is the standard output of the command:\n");
//        int count = 0;
////        while ((s = stdInput.readLine()) != null)
////        {
////  29 to 34
////            System.out.println(s);
////            count++;
////        }
//        while ((s = stdInput.readLine()) != null)
//        {
////            System.out.println("count" + count);
////            if(count == 1)
////                System.out.println(s);
//            System.out.println(s);
//            time = s;
//            count++;
//        }
//
////        System.out.println(" stdInput.toString();"+ stdInput.toString());
//        System.out.println(" count "+ count);
//
//        // read any errors from the attempted command
//        System.out.println("Here is the standard error of the command (if any):\n");
//        while ((s = stdError.readLine()) != null)
//        {
//            System.out.println(s);
//        }
//        System.out.println( "time     " + time);
//        String str = time.substring(29,34);
//        System.out.println(" str " + str);
//        double d=Double.parseDouble(str);
//        System.out.println(" d " + d);
//    }

}

//www.google.com/142.251.42.100
// www.youtube.com/142.250.182.206