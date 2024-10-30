package trash123.file.exc01;

import org.testng.annotations.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test03 {
    @Test
    public void exc3() {
        File file = new File("./");
        String[] fileList = file.list();
        for(String name:fileList){
            System.out.println(name);
        }
    }
}