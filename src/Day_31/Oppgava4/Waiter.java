package Day_31.Oppgava4;

public class Waiter extends Employee{

      TipJar tipJar;

     public Waiter(String name,int age,double salary,TipJar tipJar){
         super(name,age,salary);
         this.tipJar=tipJar;
     }

     public void takeTips(double tip){
         this.tipJar.addTip(tip);
     }

    @Override
    public String toString() {
        return "Waiter{"+
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
