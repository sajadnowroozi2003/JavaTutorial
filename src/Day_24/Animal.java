package Day_24;

public abstract class Animal {
    private String name;
    private String color;
    private int age;
    private double price;

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public double getPrice() {
        return price;
    }

    public boolean isSwim() {
        return swim;
    }

    public void setSwim(boolean swim) {
        this.swim = swim;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAge(int age) {

        if (age <= 0  || age >=130){
            this.age = 0;
            System.out.println("plz enter your age between 1 to 129.");
        }else {
            this.age = age;
        }
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    private boolean swim;

    public Animal(String name, String color, int age, double price, boolean swim) {
        setName(name);
       setColor(color);
       setAge(age);
       setPrice(price);
        setSwim(swim);
    }

    void sleep(){
        System.out.println("All Animal need to sleep.");
    }
    abstract void eat();

    @Override
    public String toString() {
        return
                "name='" + name + '\''+"\n" +
                ", color='" + color + '\'' +"\n" +
                ", age=" + age +"\n"+
        ", price=" + price +"\n"+
                ", swim=" + swim +"\n";
    }
}
