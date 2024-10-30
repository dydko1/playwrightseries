package trash123.lambda.exc13;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class Test13 {
    @Test
    public void minMax() {
        String text = "Java lambda expression.";
        WordCounter wordCounter = s -> s.split("\\s+").length;
        System.out.println(wordCounter.countWord(text));
    }
}