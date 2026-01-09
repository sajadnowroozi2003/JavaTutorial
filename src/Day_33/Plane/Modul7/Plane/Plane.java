package Day_33.Plane.Modul7.Plane;

public class Plane {
    private Seats [][] seatList;

    public Plane(int nrOfRows, int nrOfColum){
        seatList = new Seats[nrOfRows][nrOfColum];
    }



    public void setFreeSeatsToTaken(String name){
        for (int RowIndex = 0 ; RowIndex<seatList.length;RowIndex++ ){
            for (int ColumIndex = 0 ; ColumIndex < seatList[RowIndex].length ; ColumIndex++){
                Seats seats1  = seatList[RowIndex][ColumIndex];
                if (seats1== null){
                    System.out.println("\nThis seat name is: "+name);
                    System.out.println("Seat row is: "+RowIndex);
                    System.out.println("Seat colum is: "+ColumIndex);
                    seatList[RowIndex][ColumIndex] = new Seats(name);
                    return;
                }
            }
        }
        System.out.println("All Seats are booked");
    }


}
