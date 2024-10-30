package trash123.collection.list.exc04;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Test04 {
    @Test
    public void exc3() {
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");
        list_Strings.set(2,"55878");
//list_Strings.remove(0);


//        list_Strings.add(1,"xxxxxx");
//        list_Strings.add(4,"lddlkd");

        System.out.println(list_Strings);
    }
}