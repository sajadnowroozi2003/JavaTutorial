package Day_25;

public class Cat implements Animal{

    @Override
    public void eat(){
        System.out.println("Cat can eat...");
    }

    @Override
    public void sleep(){
        System.out.println("Cat can sleep 2 hours.");
    }
}
