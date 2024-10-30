package trash123.collection.list.exc16;

import org.testng.annotations.Test;

import java.util.ArrayList;

public class Test16 {
    @Test
    public void rev10() {
        ArrayList<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");
        ArrayList<String> list2=(ArrayList<String>)list_Strings.clone();
        System.out.println(list_Strings);
    }
}