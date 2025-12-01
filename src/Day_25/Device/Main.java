package Day_25.Device;

public class Main {
    public static void main(String[] args) {
        Device myPhone = new Mobile();
        PC myPC = new PC();
        myPhone.turnOff();
        myPhone.turnOn();

        myPC.turnOff();
        myPC.turnOn();
    }
}
