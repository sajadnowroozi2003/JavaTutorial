package Robot;

public class Main {
    public static void main(String[] args) {
        Robot r1 = new Robot("Dancatron 4000", 80, 1500, "B-Bot");
        Robot r2 = new Robot("Spark-E", 40, 500, "Toaster");


        System.out.println(r1.reportStatus());
        System.out.println("=====================\n");
        System.out.println(r2.reportStatus());
        System.out.println("===========End==========\n");

        World world1 = new World(false,6);
        World world2 = new World(true,7);
        r1.canWalkToPark(world2);
        r1.canWalkToPark(world1);


        r2.canDanceAtClub(world1);
        r1.canDanceAtClub(world1);
    }
}
