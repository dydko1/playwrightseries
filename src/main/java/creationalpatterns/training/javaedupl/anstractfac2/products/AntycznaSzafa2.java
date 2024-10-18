package creationalpatterns.training.javaedupl.anstractfac2.products;

import creationalpatterns.training.javaedupl.anstractfac2.interfaces.Szafa2;

public class AntycznaSzafa2 implements Szafa2 {
    @Override
    public String getWymiar() {
        return "Szafa Antyczna2: 80x60x200";
    }
}