package Day_24;

public class Duck extends Animal{

    Duck(String name, String color, int age,double price, boolean swim){
        super(name, color, age, price, swim);
    }
    @Override
    void eat() {
        System.out.println("Duck just eat fish");
    }

}
