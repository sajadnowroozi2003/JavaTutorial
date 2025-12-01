package Day_23;

public class Main {
    public static void main(String[] args) {
        Cat myCat  = new Cat("Gazi","Black",30);

//        Animal myCat2 = new Cat();
//        myCat2.makeSound();


        Duck myDuck = new Duck("DocDoc","white",17);
        Dog myDog = new Dog("Foo","Balck & White",24);

//         Dynamic Dispatch
        Animal [] myOp= {myCat,myDuck,myDog};
// print all Methode
        for( Animal x : myOp){
             x.makeSound();
            System.out.println("=====================\n");
        }


        System.out.println("======= My Cat =======");
        myCat.makeSound();
        System.out.println(myCat.toString());


        System.out.println("======= My Duck =======");
        myDuck.makeSound();
        System.out.println(myDuck.toString());


        System.out.println("======= My Dog =======");
        myDog.makeSound();
        System.out.println(myDog.toString());






    }
}
