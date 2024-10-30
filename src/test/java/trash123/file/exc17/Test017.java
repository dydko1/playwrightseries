package trash123.file.exc17;

import org.testng.annotations.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Test017 {
    @Test
    public void exc3() {
        String file = "src/test/resources/test1.txt";
        StringBuilder sb = new StringBuilder();
        String strLine = "";
        try (LineNumberReader reader = new LineNumberReader(new InputStreamReader(new FileInputStream(file)))) {
            while ((strLine = reader.readLine()) != null && reader.getLineNumber() < 2) {
                //System.out.println(strLine);
                sb.append(strLine);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(sb);
    }
}