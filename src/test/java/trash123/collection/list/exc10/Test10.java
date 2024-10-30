package trash123.collection.list.exc10;

import org.testng.annotations.Test;

import java.util.*;
import java.util.stream.Collectors;

public class Test10 {
    @Test
    public void exc3() {
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");
        Collections.shuffle(list_Strings);
        System.out.println(list_Strings);

    }
}