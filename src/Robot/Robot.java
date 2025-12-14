package Robot;

public class Robot {
    private String name;
    private double batteryLevel;
    private int distanceToPark;
    private String botType;

    public Robot(String name, double batteryLevel, int distanceToPark, String botType) {
        this.name = name;
        this.batteryLevel = batteryLevel;
        this.distanceToPark = distanceToPark;
        this.botType = botType;
    }

    public String reportStatus() {
        return "Robot Name is: " + name + "\nbattery level is: " + batteryLevel + "\nDistance To Park is: " + distanceToPark + "m." + "\nBot type is: " + botType;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Your name cant be empty or null.");
        }
    }

    public void setBatteryLevel(double batteryLevel) {
        if (batteryLevel >= 0 && batteryLevel <= 100) {
            this.batteryLevel = batteryLevel;
        } else {
            System.out.println("Your battery level should be between 0 to 100.");
        }
    }

    public void setDistanceToPark(int distanceToPark) {
        if (distanceToPark >= 0) {
            this.distanceToPark = distanceToPark;
        } else {
            System.out.println("your distance cant be under 0.");
        }
    }

    public void setBotType(String botType) {
        this.botType = botType;
    }


    public String getName() {
        return name;
    }

    public double getBatteryLevel() {
        return batteryLevel;
    }

    public int getDistanceToPark() {
        return distanceToPark;
    }

    public String getBotType() {
        return botType;
    }


    public boolean canWalkToPark(World world) {
        if (world.getIsRaining()) {
            System.out.println("The Weather is raining you cant go park.");
            return false;
        }

        if (!world.isSunday()) {
            System.out.println("Today is not sunday you can walk to park.");
            return true;
        }
        double requiredBattery = distanceToPark / 100.0;

        if (batteryLevel < requiredBattery) {
            System.out.println("your battery level is low you need to charge again.");
            return false;
        }

        System.out.println("Enjoy form strolling in park");
        return true;
    }


    public boolean canDanceAtClub(World world) {
        if (!botType.equals("B-Bot")) {
            System.out.println("You cant go to club.");
            return false;
        }
        if (batteryLevel < 50) {
            System.out.println("your battery is nuder 50 so you cant go at club.");
            return false;
        }


        if (world.getDay() % 7 == 0) {
            System.out.println("Now you can go to club.");
            return true;
        }
        System.out.println("You can go to club and enjoy from your time.");
        return true;


    }

}
