package trash123.reflection.reflection1;

import java.lang.reflect.Field;

public class Main03 {
    public static void main(String[] args) throws IllegalAccessException {
        User1 user1 = new User1();
        user1.firstName = "Miro";
        user1.setLastName("Dydko");

        Class<? extends User1> userClass = user1.getClass();

        Field[] fields = userClass.getDeclaredFields();

        for (Field field : fields) {
            System.out.println(field.getName() + "\t"+field.get(user1));
        }
    }
}