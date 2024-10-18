package creationalpatterns.training.javaedupl.anstractfac1;

public class NowoczesneMebleFactory implements FabrykaMebli {
        public Szafa stworzSzafe() {
                return new NowoczesnaSzafa();
        }
        public Komoda stworzKomode() {
                return new NowoczesnaKomoda();
               
        }
        public Lozko stworzLozko() {
                return new NowoczesnaLozko();
        }
}