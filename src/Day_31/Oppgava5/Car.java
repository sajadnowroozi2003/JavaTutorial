package Day_31.Oppgava5;

public class Car implements Movable{
    private double [] position;
    private Tire tire;

    public Car(double x , double y, Tire tire) {
        this.position  = new double[2];
        this.position[0] = x;
        this.position[1] = y;
        this.tire = tire;
    }



public void getPosition(){
    System.out.println("Your position is X: "+position[0]+" Y: "+position[1]);
}

public void getTireType(){
    System.out.println(this.tire.getType());
}
public void getTirePrecentage(){
    System.out.println(this.tire.getTirePrecentage());
}





@Override
public  void move(double[] positon){
        if (this.tire.getTirePrecentage() < 100){
            if (this.position[0] !=positon[0] || this.position[1] != positon[1]){
                double tirewear = this.tire.getTirePrecentage();
                tirewear += 10;
                this.tire.setTirePrecentage(tirewear);

                this.position[0] = positon[0];
                this.position[1] = positon[1];

            }else {
                System.out.println("Warning: you should be in new position.");
            }
        }
}


public  void changeTire (String type, double tirePrecentage){
        this.tire= new Tire(type,tirePrecentage);

}

}
