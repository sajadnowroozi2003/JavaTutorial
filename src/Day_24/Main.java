package Day_24;

public class Main {
    public static void main(String[] args) {
//        give error
//        Animal myAnimal = new Animal();

        Animal myDog = new Dog("Zomba","Black",2,2300.50,true);
        Animal myCat = new Cat("Zimbo","white",5,1200.50,false);
        System.out.println(myDog.toString());
        myCat.setName("Bar");
        System.out.println(myCat.toString());
        myCat.setName("Foo");
        System.out.println(myCat.toString());

        myDog.eat();
        myCat.eat();
        myCat.sleep();

    }
}
