package trash123.records;

import java.math.BigDecimal;

public class Course1Test {
    public static void main(String[] args) {
        Course1 course1 = new Course1(1L, "Janko Muzykant", "O Janku!!!", BigDecimal.valueOf(50));
        System.out.println(course1);
    }
}