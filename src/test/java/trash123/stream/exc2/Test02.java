package trash123.stream.exc2;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test02 {
    @Test
    public void average() {
        List<String> colors = Arrays.asList("RED", "grEEn", "white", "Orange", "pink");
        List<String> list2=new ArrayList<>();
        colors
                .stream()
                .map(String::toUpperCase)
                .forEach(s->list2.add(s));
        System.out.println(list2);
    }
}