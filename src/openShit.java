import java.io.*;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;
import java.time.LocalTime;

// Start
public class openShit {

    private final static String FILE_NAME = "resources//cites.txt";

    public static void main(String[] args) {
        int i = 1;
        do
            try {
            openShit printArgs = new openShit();
            printArgs.heyPrint("Executed: "+i+" Hostname: "+ InetAddress.getLocalHost().getHostName()+" Time: "+ LocalTime.now());
            printArgs.readFile();
            i++;
            Thread.sleep(2000); //sleep 2s
        } catch (Exception e) {
            e.printStackTrace();
        }
            while (i<150);

    }

    public void heyPrint(String a) throws Exception {
        System.out.println(a + ": " + a.length());
    }

    public void readFile() {
        try {
            BufferedReader reader = new BufferedReader( new InputStreamReader(
                new FileInputStream(FILE_NAME), StandardCharsets.UTF_8)); {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            }
        }  catch (FileNotFoundException e) {
            e.printStackTrace();
        }  catch (IOException e) {
            e.printStackTrace();
        }

    }

}
