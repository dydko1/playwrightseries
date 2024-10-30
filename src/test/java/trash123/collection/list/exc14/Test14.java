package trash123.collection.list.exc14;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test14 {
    @Test
    public void rev10() {
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");
        Collections.swap(list_Strings,2,0);
        System.out.println(list_Strings);
    }
}