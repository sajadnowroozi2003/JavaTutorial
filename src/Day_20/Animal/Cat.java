package Day_20.Animal;

public class Cat extends Animal{

    public Cat(String color, String name, boolean wild) {
        super(color, name, wild);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", wild=" + wild +
                '}';
    }

    @Override
    void sound() {
        System.out.println("Meeew Meew Meooooow");
    }
}
