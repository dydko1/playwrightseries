package creationalpatterns.training.tutorialspoint.factorypattern;

import java.lang.reflect.Method;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("I'm in " + getClass().getSimpleName());
        for (Method declaredMethod : getClass().getDeclaredMethods()) {
            System.out.println("------------------");
            System.out.println(declaredMethod.getName());
        }
    }

    private String method2(){
        return "test1";
    }

    private String method3(){
        return "test1";
    }

    private String method4(){
        return "test1";
    }
}