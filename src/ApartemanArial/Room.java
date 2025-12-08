package ApartemanArial;

public class Room {
    double width;
    double length;

    public Room(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getArial(){
        return width*length;
    }
}
