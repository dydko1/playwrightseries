package structuralpatterns.tarinings.javaedupl.bridge;

public class RemoteControllerTest {
        public static void main(String[] arg) {
                System.out.println("Radio Test:");
                Remote rc = new RemoteController(new Radio());
                rc.power();
                rc.channelUp();
                rc.channelUp();
                rc.channelUp();
                rc.volumeUp();
                rc.volumeUp();
                rc.printDetails();
                System.out.println("TV Test:");
                Remote rc1 = new RemoteController(new TV());
                rc1.power();
                rc1.channelUp();
                rc1.volumeDown();
                rc1.volumeDown();
                rc1.printDetails();
        }
}