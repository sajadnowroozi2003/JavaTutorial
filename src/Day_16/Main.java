package Day_16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age;
        System.out.println("Plz Enter your age");

        try {
            age = scan.nextInt();
            System.out.println("you are "+age+" years old.");

        }catch (Exception e){
            System.out.print("Plz enter number not char!!!");
            age = 0;
        }

    }
}
