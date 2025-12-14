package Day_31.Oppgava4;

public class Chef extends Employee{


    public Chef(String name , int age, double salary){
        super(name,age,salary);


    }

    @Override
    public String toString() {
        return "Chef{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

}
