package Day_20;

public class Student extends Person{
    int id;
    Student(String name, String lastname, int age,int id){
        super(name,lastname,age);
        this.id=id;
    }

    @Override
    void speak() {
        super.speak();
    }

    @Override
    void freeTime() {
        System.out.println("He is Studying and watching java tutorial");
    }
}
