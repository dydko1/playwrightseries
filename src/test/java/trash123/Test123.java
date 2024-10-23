package trash123;

import org.testng.annotations.Test;

public class Test123 {
    String text = "Java Exercisesa!";

    @Test
    public void findPosition1() {

        int pos = text.indexOf('v');
        System.out.println(pos);
    }

    @Test
    public void getUnicode3() {
        System.out.println(text.codePointAt(0));
    }

    @Test
    public void getBeforeSpec4() {
        Integer pos = text.indexOf('.');
        System.out.println((pos > 0) ? text.codePointBefore(pos - 1) : -1);

    }

    @Test
    public void getBeforeSpec44() {
        System.out.println(text.codePointCount(2, 6));

    }

    @Test
    public void compareTest5() {
        String s1 = "This is Exercise 3";
        String s2 = "This is Exercise 3";
        int res = s1.compareTo(s2);

        if (res > 0)
            System.out.println("wieksze");
        else if (res < 0)
            System.out.println("mniejsze");
        else
            System.out.println("rowen");
    }

    @Test
    public void compareToIgnore6() {
        String s1 = "This is Exercise 3";
        String s2 = "This is Exercise 3";
        int res = s1.compareToIgnoreCase(s2);
        //jw
    }

    @Test
    public void concatenate7() {
        String template = "%s%s";
        String s1 = "This is Exercise 3";
        String s2 = "This is Exercise 3";
        System.out.println(String.format(template, s1, s2));
    }

    @Test
    public void contains8() {
        String s1 = "This is Exercise 3";
        System.out.println(s1.contains("is"));
    }

    @Test
    public void buffer10() {
        String str1 = "example.com", str2 = "Example.com";

        // Create a StringBuffer object strbuf initialized with the value of str1.
        StringBuffer strbuf = new StringBuffer(str1);

        // Compare str1 and strbuf for content equality and print the result.
        System.out.println("Comparing " + str1 + " and " + strbuf + ": " + str1.contentEquals(strbuf));

        // Compare str2 and strbuf for content equality and print the result.
        System.out.println("Comparing " + str2 + " and " + strbuf + ": " + str2.contentEquals(strbuf));
    }

    @Test
    public void stringArray11() {
        String s = "The book contains 234 pages.";
        char[] characters = s.toCharArray();
//        for (int i = 0; i < characters.length; i++) {
//            System.out.println(characters[i]);
//        }

        String s2 = String.copyValueOf(characters, 1, 5);
        System.out.println(s2);
    }

    @Test
    public void endsAnotherString12() {
//        String end = "as";
        String end="a!";
        System.out.println(text.endsWith(end));
    }

    @Test
    public void stringObjectsContain13(){
        // Declare and initialize three string variables.
        String columnist1 = "Stephen Edwin King";
        String columnist2 = "Walter Winchell";
        String columnist3 = "Mike Royko";

        // Check if columnist1 is equal to columnist2.
        boolean equals1 = columnist1.equals(columnist2);

        // Check if columnist1 is equal to columnist3.
        boolean equals2 = columnist1.equals(columnist3);

        // Display the results of the equality checks.
        System.out.println("\"" + columnist1 + "\" equals \"" +
                columnist2 + "\"? " + equals1);
        System.out.println("\"" + columnist1 + "\" equals \"" +
                columnist3 + "\"? " + equals2);
    }
}