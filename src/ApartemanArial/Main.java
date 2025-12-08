package ApartemanArial;

public class Main {
    public static void main(String[] args) {
        Room r1 = new Room(3.8, 5.0);
        Room r2 = new Room(1.6, 2.2);
        Room r3 = new Room(3.8, 1.6);
        Room r4 = new Room(3.3, 3.9);
        Room r5 = new Room(3.3, 2.4);

        Apartment aparteman = new Apartment();

        aparteman.addRoom(r1);
        aparteman.addRoom(r2);
        aparteman.addRoom(r3);
        aparteman.addRoom(r4);
        aparteman.addRoom(r5);


        System.out.println("Total Apartment Arial is: " + aparteman.getTotalApartmentArial());




//        Example of ForEach

//        String [ ] names  = {"Ali","Sajad","Mohammad","Hussain","Iman","Ehsan"};
//
//        for (String temp : names){
//            System.out.println(temp);
//        }
    }

}


