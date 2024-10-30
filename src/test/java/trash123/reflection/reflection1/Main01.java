package trash123.reflection.reflection1;

import java.lang.reflect.Field;

public class Main01 {

    public static void main(String[] args) {

        User1 user = new User1();
        user.firstName = "Miro";
        user.setLastName("Dydko");

        Class<? extends User1> userCLass = user.getClass();

        Field[] fields = userCLass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
    }
}