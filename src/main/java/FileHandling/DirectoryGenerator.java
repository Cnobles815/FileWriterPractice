package FileHandling; /**
 * Created by zipcoder on 1/26/17.
 */
import java.io.File;
public class DirectoryGenerator {

    public static void createDirectory(String input) {
        String dirname = input;
        File newDirectory = new File(dirname);

        // Create directory now.
        newDirectory.mkdirs();
    }

    public static void createFile(String input){

    }

}
