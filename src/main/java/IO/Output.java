package IO;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

import static java.lang.System.lineSeparator;
import static java.lang.System.out;

/**
 * Created by zipcoder on 1/25/17.
 */
public abstract class Output {

    private static FileWriter toFile;

    static {
        try {
            toFile = new FileWriter("test.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void fileWrite(String output) throws IOException{
        String temp = output;
        toFile = new FileWriter("test.txt", true);
        toFile.write(temp + String.format("%n") + String.format("%n"));
        toFile.flush();
        toFile.close();
    }

    public static void fileWriteFinal(String output) throws IOException{
        String temp = output;
        toFile = new FileWriter("test.txt", true);
        toFile.write(temp);
        toFile.flush();
        toFile.close();
    }
}
