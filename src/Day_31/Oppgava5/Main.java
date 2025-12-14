package Day_31.Oppgava5;

public class Main {
    public static void main(String[] args) {
        Tire summerTire = new Tire("Summer",0);
        Car BMW  = new Car(34.314559980, 62.191032194,summerTire);


double [] newP={34.316521688162204, 62.193503385562934};
double [] newP2={34.316521688162234, 62.193503385562904};
        BMW.move(newP);
        BMW.move(newP2);
        BMW.getPosition();


        BMW.getTirePrecentage();
    }
}
