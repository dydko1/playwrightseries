package trash345.javaio;

import java.io.File;
import java.util.Date;

public class Exercise1 {
     public static void main(String a[])
     {
        File file = new File("src/test/java/trash345");
        String[] fileList = file.list();
        for(String name:fileList){
            System.out.println(name);
        }
    }
}