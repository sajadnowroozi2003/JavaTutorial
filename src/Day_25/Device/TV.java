package Day_25.Device;

public class TV implements Device{
    @Override
    public void turnOff() {
        System.out.println("TV is turning Off...");
    }
    @Override
    public void turnOn(){
        System.out.println("TV is turning On...");
    }
}
