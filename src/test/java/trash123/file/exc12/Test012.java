package trash123.file.exc12;

import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test012 {
    @Test
    public void exc3() {
        String file = "src/test/resources/test.txt";
        StringBuilder sb = new StringBuilder();
        String strLine = "";

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            while (strLine != null) {
                sb.append(strLine);
                sb.append(System.lineSeparator());
                strLine = br.readLine();
                System.out.println(strLine);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}