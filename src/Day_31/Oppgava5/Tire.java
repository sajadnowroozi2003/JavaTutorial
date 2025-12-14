package Day_31.Oppgava5;

public class Tire {
    private String type;
    private double tirePrecentage;

    public Tire(String type, double tirePrecentage) {
       this.setType(type);
        this.setTirePrecentage(tirePrecentage);

    }


    public void setType(String type) {
        if (type.equalsIgnoreCase("summer" ) || type.equalsIgnoreCase("winter")){
            this.type=type;
        }else {
            System.out.println("Invalid Type plz enter summer or winter type.");
        }
    }

    public void setTirePrecentage(double tirePrecentage) {
       if (tirePrecentage<0){
           System.out.println("Warning: your number is under 0. plz enter number between 0 to 99.");
       }
       else if (tirePrecentage>=100) {
           System.out.println("Warning: your number is more than 99. plz enter number between 0 to 99.");
       }else {
           this.tirePrecentage=tirePrecentage;
       }
    }



    public String getType() {
        return this.type;
    }

    public double getTirePrecentage() {
        return this.tirePrecentage;
    }
}

