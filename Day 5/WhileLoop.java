import java.util.Scanner;
class WhileLoop{
    public static void main(String[] args) {
      
// String password = "";

Scanner sc = new Scanner(System.in);


        // while(!password.equals("admin123")){

        //     System.out.println("Enter your password:");
        //     password = sc.nextLine();

        // }

        // System.out.println("Welcome admin!");

System.out.println("Enter your name:");
String name = sc.nextLine();


while(!name.equals("Ahmad")){

            System.out.println("Incorrect name. Please try again.");

    }
    System.out.println("Welcome back Ahmad!");





    }
}