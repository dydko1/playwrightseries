package structuralpatterns.tarinings.javaedupl.bridge;

public class TV implements Device {
    private boolean enabled = false;
    private int volume = 5;
    private int channel = 1;
 
    @Override
    public boolean isEnabled() {
        return enabled;
    }
 
    @Override
    public void enable() {
        enabled = true;
    }
 
    @Override
    public void disable() {
        enabled = false;
    }
 
    @Override
    public int getVolume() {
        return volume;
    }
 
    @Override
    public void setVolume(int volume) {
        if (volume > 10) {
            this.volume = 10;
        } else if (volume < 0) {
            this.volume = 0;
        } else {
            this.volume = volume;
        }
    }
 
    @Override
    public int getChannel() {
        return channel;
    }
       
    @Override
    public void setChannel(int channel) {
        if (channel > 100) {
            this.volume = 100;
        } else if (volume < 0) {
            this.channel = 0;
        } else {
            this.channel = channel;
        }
    }
 
    @Override
    public void printDetails() {
       System.out.println("It's TV");
       System.out.println("TV is " + (enabled ? "enabled" : "disabled"));
       System.out.println("TV volume is " + volume + "%");
       System.out.println("TV channel is " + channel);
    }
}