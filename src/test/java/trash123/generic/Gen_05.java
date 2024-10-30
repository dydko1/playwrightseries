package trash123.generic;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Gen_05 {
    @Test
    public void exc3() {
        List<String> list = new ArrayList<String>();
        list.add("First");
        list.add("Second");
        list.add("Third");

        System.out.println(reverseList(list));
    }

    private <T> List reverseList(List<T> list) {
        list.sort(Collections.reverseOrder());
        return list;
    }
}