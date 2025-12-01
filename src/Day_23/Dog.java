package Day_23;

public class Dog extends Animal{

    Dog(String name , String color , int age){
        super(name,color,age);


    }
    @Override
    void makeSound() {
        System.out.println("Woow Wooow Wooow!!!");
    }
}
