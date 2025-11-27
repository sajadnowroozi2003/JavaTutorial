package Day_20.Animal;

public class Dog extends Animal{
    public Dog(String color, String name, boolean wild) {
        super(color, name, wild);
    }


    @Override
    void sound() {
        System.out.println("Woow Woow Wooooow");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", wild=" + wild +
                '}';
    }

    @Override
    void eat(){
        System.out.println("Dog just eat meat.");
    }
}
