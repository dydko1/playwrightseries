package creationalpatterns.training.javaedupl.anstractfac2.factory;

import creationalpatterns.training.javaedupl.anstractfac2.products.AntycznaKomoda2;
import creationalpatterns.training.javaedupl.anstractfac2.products.AntycznaSzafa2;
import creationalpatterns.training.javaedupl.anstractfac2.products.AntyczneLozko2;
import creationalpatterns.training.javaedupl.anstractfac2.interfaces.FabrykaMebli2;
import creationalpatterns.training.javaedupl.anstractfac2.interfaces.Komoda2;
import creationalpatterns.training.javaedupl.anstractfac2.interfaces.Lozko2;
import creationalpatterns.training.javaedupl.anstractfac2.interfaces.Szafa2;

public class AntyczneMebleFactory2 implements FabrykaMebli2 {
    @Override
    public Szafa2 stworzSzafe() {
        return new AntycznaSzafa2();
    }

    @Override
    public Komoda2 stworzKomode() {
        return new AntycznaKomoda2();
    }

    @Override
    public Lozko2 stworzLozkko() {
        return new AntyczneLozko2();
    }
}