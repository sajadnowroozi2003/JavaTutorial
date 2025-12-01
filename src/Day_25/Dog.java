package Day_25;

public class Dog implements Animal,Person{

    @Override
    public void eat(){
        System.out.println("Dog can eat...");
    }

    @Override
    public void sleep(){
        System.out.println("Dog can sleep 3 hours.");
    }

    @Override
    public void work(){
        System.out.println("Dog can work with Police.");
    }
    @Override
    public void drink(){
        System.out.println("Dog need to drink just water.");
    }

}
