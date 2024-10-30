package trash123.regularexpression.exc02;

import org.testng.annotations.Test;

public class Test02 {
    @Test
    public void pre() {
        System.out.println(validate("p"));
        System.out.println(validate("pq"));
        System.out.println(validate("pqq"));
        System.out.println(validate("pqr"));
        System.out.println(validate("prr"));
    }

    private String validate(String s1) {
        if (s1.matches("pq[+{1}]?"))
            return "Found a match!";
        else
            return "Not matched!";
    }
}