package creationalpatterns.training.javaedupl.anstractfac1;

public class Factory {
        public static FabrykaMebli getTypMebli(String typMebli) {
                switch(typMebli) {
                        case "Antyczne":
                                return new AntyczneMebleFactory();
                        case "Nowoczesne":
                                return new NowoczesneMebleFactory();
                        default:
                                return null;
                }
        }
        public static void main(String[] args){
                FabrykaMebli antyczneMeble = getTypMebli("Antyczne");
                Komoda szafaAntyczna = antyczneMeble.stworzKomode();
                System.out.println("----------");
                System.out.println("Wymiar szafy antycznej:" + szafaAntyczna.getPolki());
        }
}