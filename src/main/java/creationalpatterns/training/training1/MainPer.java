package creationalpatterns.training.training1;

public class MainPer {
    public static void main(String[] args) {
        PersonFactory adultFac = new AdultFactory();
        Person adult = adultFac.getPerson();
        adult.display();

        PersonFactory kidFac = new KidFactory();
        Person kid = kidFac.getPerson();
        kid.display();
    }
}