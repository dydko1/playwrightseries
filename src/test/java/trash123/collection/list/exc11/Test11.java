package trash123.collection.list.exc11;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test11 {
    @Test
    public void rev10() {
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");
        System.out.println("------------------");
        System.out.println(list_Strings);
        List<String> list2 = new ArrayList<>(list_Strings);
        Collections.reverse(list_Strings);
        System.out.println(list_Strings);
        System.out.println("------------------ddddddddddddddddddddddddd");
        String s2 = String.format("%s%n%s", list2, list_Strings);
        System.out.println(s2);
    }
}