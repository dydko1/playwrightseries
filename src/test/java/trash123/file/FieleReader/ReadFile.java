package trash123.file.FieleReader;

import lombok.SneakyThrows;
//import org.apache.commons.io.FileUtils;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadFile {

    private static final String PATH = "src/test/resources/test.txt";
    private static final String PATH1 = "src/test/resources/test1.txt";

//    @SneakyThrows
//    @Test
//    public void readFile() {
//        String textData = FileUtils.readFileToString(new File(PATH), StandardCharsets.UTF_8);
//        textData = "xxxxx" + textData;
//        FileUtils.writeStringToFile(new File(PATH1),
//                textData, StandardCharsets.UTF_8);
//
//    }

    @SneakyThrows
    @Test
    public void readFile2() {
        String s1 = Files.readString(Paths.get(PATH), StandardCharsets.UTF_8);
        System.out.println(s1);
        s1 = "dsfajdshfjksafhj" + s1;
        Files.writeString(Paths.get(PATH1), s1, StandardCharsets.UTF_8);
    }

    @Test
    public void readFile3() {
        System.out.println(System.getProperty("dddd"));
    }
}