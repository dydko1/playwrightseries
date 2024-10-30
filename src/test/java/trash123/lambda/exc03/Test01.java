package trash123.lambda.exc03;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test01 {
    @Test
    public void conUpper() {
        List<String> stringList = Arrays.asList("Red", "Green", "Blue", "PINK");

        stringList.replaceAll(s->s.toUpperCase());
        System.out.println(stringList);
    }
}