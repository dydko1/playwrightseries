package structuralpatterns.bridge;

import structuralpatterns.bridge.devices.Device;
import structuralpatterns.bridge.devices.Radio;
import structuralpatterns.bridge.devices.Tv;
import structuralpatterns.bridge.remotes.AdvancedRemote;
import structuralpatterns.bridge.remotes.BasicRemote;

public class Demo {
    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}