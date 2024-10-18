package creationalpatterns.training.javaedupl.anstractfac2;

import creationalpatterns.training.javaedupl.anstractfac2.factory.AntyczneMebleFactory2;
import creationalpatterns.training.javaedupl.anstractfac2.factory.NowoczesneMebleFactory2;
import creationalpatterns.training.javaedupl.anstractfac2.interfaces.FabrykaMebli2;

public class FabrykaMebli22 {

    public FabrykaMebli2 getTypMebli(FurnitureType furnitureType) {
        return switch (furnitureType){
            case ANTYCZNE -> new AntyczneMebleFactory2();
            case NOWOCZESNE -> new NowoczesneMebleFactory2();
            default -> null ; //poprawic
        };
    }
}