package Day_33.Plane;

public class Plane {

   private boolean  [] seatsTake;

    public Plane(int nrOfSeats) {
      seatsTake  = new boolean[nrOfSeats];
    }


    public boolean setSeatToTaken(int seatIndex){
        if (!seatsTake[seatIndex]){
            seatsTake[seatIndex]  = true;
            return true;
        }else {
            return false;
        }
    }


    public int getNrOfSeats(){
        return seatsTake.length;
    }

}
