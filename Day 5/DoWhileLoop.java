
import java.util.Scanner;
class DoWhileLoop{

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


// Example 1: Simple do-while loop

// int num =  20;

//         do{
//             System.out.println("Enter a Number");

//         }while(num<0);






// Example 2: Checking for positive number


// int number;

// do{
//     System.out.print("Enter a positive number: ");
//     number = scanner.nextInt();
// }while(number <= 0);

// System.out.println("You entered: " + number);



// Example 3: Menu-driven program

   int choice;

   do{
        System.out.println("======== Menu ========");
        System.out.println("1. To say Hello");
        System.out.println("2. To See list of names");
        System.out.println("3. To see list of phones");
        System.out.println("4. To say Goodbye");
        System.out.println("0. To Exit");

        System.out.print("Enter your choice: ");
        choice = scanner.nextInt();


        switch(choice){

            case 1:
                System.out.println("Hello! welcome to the program.");
                break;
            case 2:
                System.out.println("List of names: Alice, Bob, Charlie");
                break;
            case 3:
                System.out.println("List of phones: iPhone, Samsung, Pixel");
                break;
            case 4:
                System.out.println("Goodbye! Have a nice day.");
                break;
            case 0:
                System.out.println("Exiting the program.");
                break;

            default:
                System.out.println("Invalid choice. Please try again.");
            
        }
    

   }while(choice !=0 );
  System.out.println("Program Ended.");

        scanner.close();
       
    }
}