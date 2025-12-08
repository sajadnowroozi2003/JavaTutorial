package Oppgava4.Simple;

public class Chef {
    String name;
    int age;
    double salary;

    public Chef(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void makeDish(){
        System.out.println("Omlit is ready to serve. ");
    }

    public void makeDish(String dish){
        System.out.println(dish+" is ready to serve. ");
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
