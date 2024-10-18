package structuralpatterns.tarinings.javaedupl.bridge;

public class RemoteController implements Remote {
        private Device device;
       
        public RemoteController(Device device) {
                this.device = device;
        }
       
        @Override
        public void power() {
                if (device.isEnabled()) {
                        device.disable();
                } else {
                        device.enable();
                }
        }
 
        @Override
        public void volumeUp() {
                device.setVolume(device.getVolume() + 1);
        }
 
        @Override
        public void volumeDown() {
                device.setVolume(device.getVolume() - 1);
        }
       
        @Override
        public void channelUp() {
                device.setChannel(device.getChannel() + 1);
        }
 
        @Override
        public void channelDown() {
                device.setChannel(device.getChannel() - 1);
        }
       
        @Override
        public void printDetails() {
                device.printDetails();
        }
}