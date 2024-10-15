package compositionvsinheritance.aggregationcomposition.composition;

import java.util.Arrays;
import java.util.List;

public class House {

    private List<Room> rooms;

    public House() {
        this.rooms = Arrays.asList(
                new Room("Living Room"),
                new Room("Bedroom"),
                new Room("Kitchen")
        );
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }
}