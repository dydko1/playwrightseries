package trash123.collection.list.exc07;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test07 {
    @Test
    public void exc3() {
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");


        List<String> list_Strings2 = new ArrayList<String>();
        list_Strings2.add("Orange");
        list_Strings2.add("Green");
        list_Strings2.add("Red");

        list_Strings = list_Strings.stream().map(String::toUpperCase).collect(Collectors.toList());
        list_Strings2 = list_Strings2.stream().map(String::toUpperCase).collect(Collectors.toList());

        System.out.println(list_Strings.containsAll(list_Strings2));


//        list_Strings.add(1,"xxxxxx");
//        list_Strings.add(4,"lddlkd");



        //System.out.println(list_Strings);
        //list_Strings.addAll(list_Strings2);
        list_Strings.sort(Comparator.naturalOrder());
        list_Strings2.sort(Comparator.naturalOrder());
        System.out.println(list_Strings + "\n" +list_Strings2);
    }
}