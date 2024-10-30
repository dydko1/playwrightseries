package trash123.file.exc02;

import org.testng.annotations.Test;

import java.io.File;
import java.io.FilenameFilter;

public class Test02 {
    @Test
    public void exc3() {
        File file = new File("./");
        String[] fileList = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if(name.toLowerCase().endsWith(".xml"))
                    return true;
                else
                    return false;
            }
        });

        for(String name:fileList){
            System.out.println(name);
        }
    }
}