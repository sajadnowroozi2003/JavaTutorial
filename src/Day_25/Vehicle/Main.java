package Day_25.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle myBike  = new Bike();
        Vehicle myCar = new Car();


        myCar.move();
        myCar.stop();


        myBike.move();
        myBike.stop();

    }
}
