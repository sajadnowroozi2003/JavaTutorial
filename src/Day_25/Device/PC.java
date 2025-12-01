package Day_25.Device;

public class PC implements Device{

    @Override
    public void turnOff() {
        System.out.println("PC is turning Off...");
    }
    @Override
    public void turnOn(){
        System.out.println("PC is turning On...");
    }
}
