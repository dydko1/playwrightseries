package compositionvsinheritance.aggregationcomposition.composition;

public class MainCompos {
    public static void main(String[] args) {
        House house = new House();
        System.out.println(house.getRooms().get(0).getName());

    }
}