package trash345.staticmember;

import lombok.Getter;

@Getter
public class ComplexInitializer {

    public static final Integer X;
    public static final Integer Y;
    public static final Integer Z;

    static {
        X = 10;
        Y = 20;
        Z = calculateZ(X, Y);
    }

    private static Integer calculateZ(Integer x, Integer y) {
        return x + y;
    }

}