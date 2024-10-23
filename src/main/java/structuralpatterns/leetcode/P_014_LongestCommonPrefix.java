package structuralpatterns.leetcode;

public class P_014_LongestCommonPrefix {
    public static void main(String[] args) {
        String[] str = {"flowe1", "flower", "flowe2", "floweioight"};
        System.out.println(longestPrefix(str));
    }

    private static String longestPrefix(String[] str) {
        int minLength = getLength(str, 0);
        int index = 0;

        for (int i = 1; i < str.length; i++) {
            int nextPos = str[i].length();
            if (minLength > nextPos) {
                minLength = nextPos;
            }
        }

        for (int i = 0; i < minLength; i++) {
            for (int j = 1; j < str.length; j++) {
                if (str[0].charAt(i) != str[j].charAt(i)) {
                    return str[0].substring(0, i);
                }
            }
            index = i + 1;
        }
        return str[0].substring(0, index);
    }

    private static int getLength(String[] s, int pos) {
        return s[pos].length();
    }
}