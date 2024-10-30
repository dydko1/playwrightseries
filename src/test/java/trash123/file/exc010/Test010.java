package trash123.file.exc010;

import org.testng.annotations.Test;

import java.io.*;

public class Test010 {
    @Test
    public void exc3() {
        File file = new File("src/test/resources/test.txt");
        try (InputStream inputStream = new FileInputStream(file)) {
            byte file_content[] = new byte[2 * 1024];
            int read_count = 0;
            while ((read_count = inputStream.read(file_content)) > 0) {
                System.out.println(new String(file_content, 0, read_count - 1));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}