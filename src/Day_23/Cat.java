package Day_23;

public class Cat extends Animal{

Cat(String name, String color , int age){
    super(name,color,age);
}

    @Override
    void makeSound(){
        System.out.println("Meow Meow!!!");
    }
}
