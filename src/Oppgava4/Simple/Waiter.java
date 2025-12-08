package Oppgava4.Simple;

public class Waiter {
    String name;
    int age;
    double salary;

    public Waiter(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }


    private static double  totalTips = 0;

    public void takeTips(double amount){
        totalTips +=amount;
    }

    @Override
    public String toString() {
        return "Waiter{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
