package creationalpatterns.training.javaedupl.anstractfac2;

import creationalpatterns.training.javaedupl.anstractfac2.interfaces.FabrykaMebli2;
import creationalpatterns.training.javaedupl.anstractfac2.interfaces.Szafa2;

import static creationalpatterns.training.javaedupl.anstractfac2.FurnitureType.ANTYCZNE;

public class MainFac {
    public static void main(String[] args) {
        FabrykaMebli2 fabrykaMebli1 = new FabrykaMebli22().getTypMebli(ANTYCZNE);
        Szafa2 szafa2 = fabrykaMebli1.stworzSzafe();
        System.out.println(szafa2.getWymiar());
    }
}