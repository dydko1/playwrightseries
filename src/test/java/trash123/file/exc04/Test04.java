package trash123.file.exc04;

import org.testng.annotations.Test;

import java.io.File;

public class Test04 {
    @Test
    public void exc3() {
        File my_file_dir = new File("./");

        System.out.println("--------------");
        System.out.println(my_file_dir.isFile());
        System.out.println(my_file_dir.isDirectory());
        System.out.println("--------------");

        if (my_file_dir.canWrite()) {
            System.out.println(my_file_dir.getAbsolutePath() + " can write.\n");
        } else {
            System.out.println(my_file_dir.getAbsolutePath() + " cannot write.\n");
        }
        if (my_file_dir.canRead()) {
            System.out.println(my_file_dir.getAbsolutePath() + " can read.\n");
        } else {
            System.out.println(my_file_dir.getAbsolutePath() + " cannot read.\n");
        }
    }
}