package Day_20.Animal;

public class Animal {
    String color;
    String name;
    boolean wild;

    public Animal(String color, String name, boolean wild) {
        this.color = color;
        this.name = name;
        this.wild = wild;
    }

    void eat(){
        System.out.println("All Animals Eat.");
    }

    void drink(){
        System.out.println("Animals just drink water.");
    }

    void sound(){
        System.out.println("all Animals has different sound");
    }

}
