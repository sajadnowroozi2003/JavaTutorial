package Day_20;

public class Person {
    String name;
    String lastName;
    int age;

    public Person(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }


    void freeTime(){
    System.out.println("Sleep and Watching TV");
}


    void speak(){
        System.out.println("Person class can speak");
    }

    void sleep(){
        System.out.println("Person class can Sleep");
    }
}
