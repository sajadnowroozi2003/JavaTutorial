package Day_20.Animal;

public class Main {
    public static void main(String[] args) {


    Dog d1 = new Dog("Black","Nazi",true);

    d1.sound();
    d1.eat();
    d1.drink();

    Cat c1 = new Cat("Brown","Peshe",false);
    c1.sound();
    System.out.println(c1.name);
    c1.drink();
    d1.eat();

        System.out.println("=================");


        System.out.println(c1.toString());

    }
}
