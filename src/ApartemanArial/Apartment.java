package ApartemanArial;

import java.util.ArrayList;

public class Apartment {

    ArrayList<Room> roomList = new ArrayList<>();

    public void addRoom(Room room){
        roomList.add(room);
    }


    public double getTotalApartmentArial(){
        double totalArial = 0;

        for (Room rom : roomList){
            totalArial+= rom.getArial();
        }
        return totalArial;
    }
}
