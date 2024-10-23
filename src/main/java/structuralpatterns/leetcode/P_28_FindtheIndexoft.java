package structuralpatterns.leetcode;

import java.util.HashMap;

public class P_28_FindtheIndexoft {

    public static void main(String[] arg) {
        String key = "ala";
        String text = "aaala ma ala ala";
        solution(text, key);

    }

    private static int solution(String text, String key) {
        if (text.length() < key.length())
            return -1;

        text.indexOf(key,0);
        return 0;
    }
}