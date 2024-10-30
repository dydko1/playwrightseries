package trash123.file.exc15;

import org.testng.annotations.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Test015 {
    @Test
    public void exc3() throws IOException {
        String file = "src/test/resources/test1.txt";
        StringBuilder sb = new StringBuilder();
        List<String> list = new ArrayList<String>();
        String strLine = "";
        try (FileWriter fw = new FileWriter(file, false)) {
            fw.write("Python Exercises\nsdfkjds\ndkfj");


        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            while (strLine != null) {
                strLine = br.readLine();
                sb.append(strLine);
                sb.append(System.lineSeparator());
                strLine = br.readLine();
                if (strLine == null)
                    break;
                list.add(strLine);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(sb);
    }
}