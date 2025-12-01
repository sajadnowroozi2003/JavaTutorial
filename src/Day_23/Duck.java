package Day_23;

public class Duck extends Animal {

    Duck(String name , String color , int age){
        super(name,color,age);
    }
    @Override
    void makeSound() {
        System.out.println("Duck Duck!!!");
    }
}
