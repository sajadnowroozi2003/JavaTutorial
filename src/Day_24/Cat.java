package Day_24;

public class Cat extends Animal{


    Cat(String name, String color, int age,double price, boolean swim){
        super(name, color, age, price, swim);
    }


    @Override
        void eat() {
        System.out.println("Cat can eat can fish");
    }
}
