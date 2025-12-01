package Day_25.Device;

public class Mobile implements Device{
    @Override
    public void turnOff() {
        System.out.println("Mobile is turning Off...");
    }
    @Override
    public void turnOn(){
        System.out.println("Mobile is turning On...");
    }
}
