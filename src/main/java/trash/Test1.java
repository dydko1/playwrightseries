package trash;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

    private static Test1 test1 = new Test1();
    private List<String> strings = new ArrayList<>();

    private Test1() {
        System.out.println("Constructor");
        loadEle();
    }

    public static String getElement(int pos) {
        return test1
                .strings
                .get(pos);
    }

    private void loadEle() {
        strings.add("ele1");
        strings.add("ele2");
        strings.add("ele3");
    }
}