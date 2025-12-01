package Day_23;

public class Animal {
    private String name;
    private String color;
    private int age;


    Animal(String name , String color ,int age){
        setName(name);
        setColor(color);
       setAge(age);

    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        if (age < 5 || age>130){
            System.out.println("Plz enter age between 5 to 129");
           this.age = 1;
        }else {
            this.age = age;
        }

    }

    void makeSound(){
        System.out.println("All Animals has different sound");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }

}
