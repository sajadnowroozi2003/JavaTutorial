import java.util.Scanner;
class ScannerExample{


    public static void main(String []args ){

        Scanner input = new Scanner(System.in);


            String name;
            int age;


        System.out.print("Enter your name: ");
        name = input.nextLine();


        System.out .print("Enter your age: ");
        age = input.nextInt();


        System.out.println("Hello "+name+" you are "+age+" years old.");



    }
}