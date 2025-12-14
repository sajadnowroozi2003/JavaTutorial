package Robot;

public class World {
    private boolean isRaining;
    private int day;


    public World(boolean isRaining, int day) {
        this.isRaining = isRaining;
        this.day = day;
    }


    public boolean isSunday() {
        return day % 7 == 0;
    }

    public boolean getIsRaining() {
        return this.isRaining;
    }

    public int getDay(){
        return this.day;
    }
}
