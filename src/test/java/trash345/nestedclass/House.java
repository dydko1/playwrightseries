package trash345.nestedclass;

public class House {

    public void calculateArea() {

        final double length = 5.0;
        final double width = 6.0;

        class Room {
            public double getArea() {
                return length * width;
            }
        }

        Room room = new Room();
        System.out.println("Room area: " + room.getArea());
    }
}
