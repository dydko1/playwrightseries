package trash123.file.exc03;

import org.testng.annotations.Test;

import java.io.File;
import java.io.FilenameFilter;

public class Test03 {
    @Test
    public void exc3() {
        File file = new File("./");

        if (file.exists()) {
            System.out.println("The directory or file exists.\n");
        } else {
            System.out.println("The directory or file does not exist.\n");
        }
    }
}