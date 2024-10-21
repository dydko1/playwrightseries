package structuralpatterns.tarinings.javaedupl.bridged;

public interface Device {
    boolean isEnabled();
    void enable();
    void disable();
    int getVolume();
    void setVolume(int valume);
    int getChannel();
    void setChannel(int channel);
    void printDetails();
}