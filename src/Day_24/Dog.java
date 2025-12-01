package Day_24;

public class Dog extends Animal{

    Dog(String name, String color, int age,double price, boolean swim){
        super(name, color, age, price, swim);
    }
    @Override
    void eat() {
        System.out.println("Dog eat meats.");
    }
}
