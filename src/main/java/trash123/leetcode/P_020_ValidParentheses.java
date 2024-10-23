package trash123.leetcode;

import java.util.Stack;

public class P_020_ValidParentheses {

    public static void main(String[] args) {
        String s = "()[]";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(')
                stack.add(')');
            else if (ch == '[')
                stack.add(']');
            else if (ch == '{')
                stack.add('}');
            else if (stack.isEmpty() || stack.pop() != ch) {
                return false;
            }
        }
        return stack.isEmpty();
    }

//    public static boolean isValid(String s) {
//        while (true) {
//            if (s.contains("()"))
//                s.replace("{}", "");
//            else if (s.contains("[]"))
//                s.replace("[]", "");
//            else if (s.contains("{}"))
//                s.replace("{}", "");
//            else
//                return s.isEmpty();
//        }
//    }
}