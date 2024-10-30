package trash123.file.exc11;

import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test010v1 {
    @Test
    public void exc3() {
        String file = "src/test/resources/test.txt";

        StringBuilder sb = new StringBuilder();
        String strLine = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            while (strLine != null)
            {
                sb.append(strLine);
                sb.append(System.lineSeparator());
                strLine = br.readLine();
                System.out.println(strLine);
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }
    }
}