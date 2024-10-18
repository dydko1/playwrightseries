package creationalpatterns.training.javaedupl.anstractfac2.factory;

import creationalpatterns.training.javaedupl.anstractfac2.products.NowoczesnaKomoda2;
import creationalpatterns.training.javaedupl.anstractfac2.products.NowoczesnaSzafa2;
import creationalpatterns.training.javaedupl.anstractfac2.interfaces.FabrykaMebli2;
import creationalpatterns.training.javaedupl.anstractfac2.interfaces.Komoda2;
import creationalpatterns.training.javaedupl.anstractfac2.interfaces.Lozko2;
import creationalpatterns.training.javaedupl.anstractfac2.interfaces.Szafa2;

public class NowoczesneMebleFactory2 implements FabrykaMebli2 {
    @Override
    public Szafa2 stworzSzafe() {
        return new NowoczesnaSzafa2();
    }

    @Override
    public Komoda2 stworzKomode() {
        return new NowoczesnaKomoda2();
    }

    @Override
    public Lozko2 stworzLozkko() {
        return null;
    }
}