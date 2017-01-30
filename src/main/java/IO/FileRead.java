package IO;

/**
 * Created by zipcoder on 1/30/17.
 */
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public abstract class FileRead {
    static String fileText;


    public static String readTxt() {

        InputStream inputStream = null;
        BufferedReader br = null;

        try {
            // read this file into InputStream
            inputStream = new FileInputStream("test.txt");

            br = new BufferedReader(new InputStreamReader(inputStream));

            StringBuilder sb = new StringBuilder();

            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }

            fileText = sb.toString();
            System.out.println("\nDone!");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return fileText;
    }
}
