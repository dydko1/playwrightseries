package trash123.reflection.reflection1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Main07 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {

        User1 user = new User1();
        user.firstName = "Miro";
        user.setLastName("Dydko");

        Class<? extends User1> userCLass = user.getClass();

        printObject(user);
    }

    private static void printObject(Object object) throws IllegalAccessException {
        Class<?> clazz = object.getClass();

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(clazz.getSimpleName());
        stringBuilder.append("{");
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            declaredField.setAccessible(true);
            stringBuilder.append(declaredField.getName());
            stringBuilder.append("='");
            stringBuilder.append(declaredField.get(object));
            stringBuilder.append("', ");
        }
        String substring = stringBuilder.substring(0, stringBuilder.length() - 2);
        System.out.println(substring + "}");
    }
}