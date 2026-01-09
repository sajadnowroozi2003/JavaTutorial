package Day_33.Plane.Modul7.Plane2;

public class PlaneV4 {

    private Seat [][] seats;



    public PlaneV4(int nrOfRows, int nrOfSeatsPerRow){
        this.seats=new Seat[nrOfRows][nrOfSeatsPerRow];
    }


    public void setFreeSeatToTaken(String name){
        for (int i=0; i< seats.length ; i++){
            for (int j =0 ; j<seats[i].length ; j++){
              Seat seat = seats[i][j];
              if (seat  == null){
                  seats[i][j]  = new Seat(name);
                  System.out.println("This seat name is: "+name);
                  System.out.println("This seat row is: "+i);
                  System.out.println("This seat colum is: "+j);
                  return;
              }
            }
        }

        System.out.println("Beklager, flyet er fullt");
    }
}
