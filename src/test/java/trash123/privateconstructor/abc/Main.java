package trash123.privateconstructor.abc;

final class ImmutableClass {
    private ImmutableClass() {
        System.out.println("This class cannot be subclassed");
    }

    public static ImmutableClass createInstance() {
        return new ImmutableClass();
    }
}

// Uncommenting this will cause a compile-time error
// class SubClass extends ImmutableClass {}

public class Main {
    public static void main(String[] args) {
        ImmutableClass obj = ImmutableClass.createInstance();
    }
}