package trash123.reflection.reflection1;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main05 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        User1 user1 = new User1();
        user1.firstName = "Miro";
        user1.setLastName("Dydko");

        Class<? extends User1> userClass = user1.getClass();

        Method setLastName=userClass.getMethod("setLastName", String.class);
        Method setFirstName2=userClass.getMethod("setFirstName2", String.class);
        setLastName.invoke(user1, "Ddydko");
        setFirstName2.invoke(user1,"Miroooooooooooooooooooo");

        System.out.println(user1);
    }
}