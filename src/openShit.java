import java.io.*;
import java.nio.charset.StandardCharsets;


public class openShit {
    private final static String FILE_NAME = "resource//cites.txt";


    public static void main(String[] args) {
        try {
            openShit printArgs = new openShit();
            printArgs.heyPrint("Ttt TTT ddd");
            printArgs.readFile();

        } catch (Exception e) {
            e.printStackTrace();
        }

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
