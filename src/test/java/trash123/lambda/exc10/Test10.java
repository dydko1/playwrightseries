package trash123.lambda.exc10;

import org.testng.annotations.Test;

import java.util.function.BiFunction;
import java.util.function.LongUnaryOperator;

public class Test10 {
    @Test
    public void contec() {

        String template="%s %s";
        BiFunction<String,String,String> concatenate=(s1,s2)->String.format(template,s1,s2);

        System.out.println(concatenate.apply("aaaa","bbbb"));
    }
}