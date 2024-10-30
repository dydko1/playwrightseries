package trash123.reflection.reflection1;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main06 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {

        Class
<? extends User1> userClass = User1.class;
        Constructor<? extends User1> constructor11 = userClass.getConstructor();// kontruktor bezargumentowy
        Constructor<? extends User1> constructor12 = userClass.getConstructor(String.class, String.class);// konstruktor przyjmujący imię i nazwisko

        User1 user11 = constructor11.newInstance();
        System.out.println(user11);
        User1 user12 = constructor12.newInstance("Miro", "Dydko");
        System.out.println(user12);


    }
}