package creationalpatterns.training.javaedupl.anstractfac1;

public class AntyczneMebleFactory implements FabrykaMebli {
        public Szafa stworzSzafe() {
                return new AntycznaSzafa();
        }
        public Komoda stworzKomode() {
                return new AntycznaKomoda();
               
        }
        public Lozko stworzLozko() {
                return new AntyczneLozko();
        }
}