package trash123.generic;

import org.testng.annotations.Test;

import java.util.*;

public class Gen_04 {
    @Test
    public void exc3() {
        List<String> list = new ArrayList<String>();
        list.add("First");
        list.add("Second");
        list.add("Third");

        reverseList(list);
    }

    private <T> List reverseList(List<T> list) {

        List<T> rev = new ArrayList<>();
        ListIterator<T> it = list.listIterator(list.size());
        while (it.hasPrevious()) {
            rev.add(it.previous());
        }
        return rev;
    }
}