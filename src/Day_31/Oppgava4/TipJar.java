package Day_31.Oppgava4;

public class TipJar {

    private double tips;

    public TipJar() {
        this.tips = 0;
    }

    public void addTip(double tip) {
        this.tips += tip;
    }


    public double divideTips(int numberOfWaiter) {
        double temp = this.tips;
        this.tips=0;
        return temp / numberOfWaiter;
    }
}
