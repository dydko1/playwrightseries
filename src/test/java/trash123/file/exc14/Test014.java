package trash123.file.exc14;

import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test014 {
    @Test
    public void exc3() {
        String file = "src/test/resources/test.txt";
        StringBuilder sb = new StringBuilder();
        List<String> list = new ArrayList<String>();
        String strLine = "";
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            while (strLine != null) {
                strLine = br.readLine();
                sb.append(strLine).append("\n");
                strLine = br.readLine();
                if (strLine == null)
                    break;
                list.add(strLine);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(list);
    }
}