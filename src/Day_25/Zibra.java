package Day_25;

public class Zibra implements Animal,Person{

    @Override
    public void eat(){
        System.out.println("Zibra can eat...");
    }

    @Override
    public void sleep(){
        System.out.println("Zibra can sleep 23 hours.");
    }

    @Override
    public void work(){
        System.out.println("Zibra can work with people.");
    }
    @Override
    public void drink(){
        System.out.println("Zibra need to drink just water.");
    }


}
