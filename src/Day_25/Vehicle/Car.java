package Day_25.Vehicle;

public class Car implements Vehicle{
    @Override
    public void stop(){
        System.out.println("Car is stopped.");
    }
    @Override
        public void move(){
        System.out.println("Car is moving fast...");
    }
}
