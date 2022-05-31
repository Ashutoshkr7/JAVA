import java.util.*;
import java.io.*;

public class JavaAssignment3Copy1 {
    private static double pingTime(String hostAddress) throws IOException {
      try{
            List<String> commands = new ArrayList<String>();
            commands.add("ping");
            commands.add("-c");
            commands.add("3");
            commands.add(hostAddress);
            String s = null;
            String time = "";

            ProcessBuilder pb = new ProcessBuilder(commands);
            Process process = pb.start();

            BufferedReader stdInput = new BufferedReader(new InputStreamReader(process.getInputStream()));
            BufferedReader stdError = new BufferedReader(new InputStreamReader(process.getErrorStream()));

            // read the output from the command
            System.out.println("Here is the standard output of the command:\n");

            while ((s = stdInput.readLine()) != null)
                time = s;

            // read any errors from the attempted command
            System.out.println("Here is the standard error of the command (if any):\n");
            while ((s = stdError.readLine()) != null)
                System.out.println(s);

            System.out.println("time     " + time);

            String[] str1 = time.split("/");
           // System.out.println("str1" + str1[4]); //avg time of a ping
            Double d = Double.parseDouble(str1[4]);
              return d;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Exception Message is " + e.getMessage());
            return -1;
        }
    }
    public static double calculateMedian(List<Double> averagePingTimeList) {
        int n = averagePingTimeList.size();
        Collections.sort(averagePingTimeList);
        if(n % 2 == 1)
            return (averagePingTimeList.get(n/2)) ;
        else {
            int index1  = n/2;
            int index2 = n/2 -1;
            return (averagePingTimeList.get(index1) + averagePingTimeList.get(index2))/2 ;
        }
    }

    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        List<Double> averagePingTimeList = new ArrayList<>();

        System.out.println("enter no. of pings");
        long numberOfPings = sc.nextInt();
        while(numberOfPings > 0) {
            System.out.println("Enter ip address or URL of any website: ");
            String hostAddress = sc.next();
            averagePingTimeList.add(pingTime(hostAddress));
            numberOfPings--;
        }

        double medianPing = calculateMedian(averagePingTimeList);
        System.out.println("median:"+ medianPing );
    }
}

