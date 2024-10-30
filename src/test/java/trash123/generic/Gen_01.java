package trash123.generic;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class Gen_01 {
    @Test
    public void exc3() {
        Integer[] iArr1 = {1, 2, 3, 4, 5};
        Integer[] iArr2 = {3, 2, 3, 4, 6, 7};
        System.out.println(compareArray(iArr1, iArr2));

        String[] sArr1 = {"aaa", "v", "g", "g"};
        String[] sArr2 = {"g","g","g","fdddddddddddddddddddd"};
        System.out.println(compareArray(sArr1, sArr2));
    }

    private <T> boolean compareArray(T[] arr1, T[] arr2) {
        System.out.println(arr1.length);
        System.out.println(arr2.length);
        return arr1.length == arr2.length;
    }
}