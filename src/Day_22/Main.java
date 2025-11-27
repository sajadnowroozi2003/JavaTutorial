package Day_22;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
Person p1  = new Person("Nasir","Mohammadi",27,80);
Employee e1 = new Employee("Omar","Ahmadi",34,90,19000);


        System.out.println("===========Person=========");
        System.out.println( p1.toString());
        System.out.println("===========Employee=========");
        System.out.println(e1.toString());


     p1.setBirthday(2004);
        System.out.println(p1.getBirthday());
        p1.printInfo();

//
//        p1.setName("Ahmad");
//        System.out.println(p1.getName());
//
//        p1.setLastName("Mohammadi");
//        System.out.println(p1.getLastName());


    }
}
