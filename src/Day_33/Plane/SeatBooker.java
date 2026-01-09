package Day_33.Plane;

public class SeatBooker {

    public static boolean bookSeatInPlane(Plane plane){
for (int i=0 ; i<plane.getNrOfSeats() ; i++){
    if (plane.setSeatToTaken(i)){
        return true;
    }
}
return false;
    }

}
