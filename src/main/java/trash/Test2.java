package trash;

import java.util.ArrayList;
import java.util.List;

public class Test2 {

    //private static Test2 test1 = new Test2();
    private List<String> strings = new ArrayList<>();

    public Test2() {
        System.out.println("Constructor 123");
        loadEle();
    }

    public String getElement(int pos) {
        return strings.get(pos);
    }

    private void loadEle() {
        strings.add("ele1");
        strings.add("ele2");
        strings.add("ele3");
    }
}