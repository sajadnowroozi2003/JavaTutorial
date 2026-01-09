package Day_33.Plane.Modul7.Plane;

public class Seats {
    private String passengerName;
    private boolean taken;

    public Seats(String name){
        this.passengerName=name;
        taken = true;
    }

    public boolean getTaken(){return this.taken;
    }
}
