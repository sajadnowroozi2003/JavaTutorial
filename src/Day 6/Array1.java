import java.util.Scanner;
class Array1{
    public static void main(String args[]){
       

Scanner scanner = new Scanner(System.in);



       int [] numbers = {10,20,30,40,50,60,70,80,90,100};

    //    System.out.println(numbers[0]);
    //    System.out.println(numbers[1]);
    //    System.out.println(numbers[2]);
    //    System.out.println(numbers[3]);
    //    System.out.println(numbers[4]);
    //    System.out.println(numbers[5]);
    //    System.out.println(numbers[6]);
    //    System.out.println(numbers[7]);
    //    System.out.println(numbers[8]);
    //    System.out.println(numbers[9]);
    //    System.out.print(numbers[10]); // ArrayIndexOutOfBoundsException



// for (int i=0; i< numbers.length; i++){
//     System.out.println(numbers[i]);
// }







//  Example: Using break and continue with arrays
// int sum = 0;
//     for (int i =0 ;i < numbers.length ; i++){
//         if (numbers[i]== numbers[5]){
//             continue;
//         }
//         if (numbers[i] == 80){
//             break;
//         }

//         sum += numbers[i];

//     }

//     System.out.println("Sum is: " + sum);
    
      
       





    //    int [] scores ={85,90,78,92,88};

    //    int max = scores[0];

    //     for (int i=1 ; i < scores.length ; i++){

    //         if (scores[i] > max){
    //             max = scores[i];
    //         }

    //     }

    //     System.out.println("Highest score is: " + max);








// int [] numbers = new int[5];

// numbers[0]= 10;
// numbers[1]= 20;
// numbers[2]= 30;
// numbers[3]= 40;
// numbers[4]= 50;


// int [] numbers = {10,20,30,40,50};
 








    //    int [] scores ={85,90,78,92,88};

    //    int min = scores[0];

    //     for (int i=1 ; i < scores.length ; i++){

    //         if (scores[i] <  min){
    //             min = scores[i];
    //         }

    //     }

    //     System.out.println("Minst score is: " + min);


       







        int [] userInput = new int [5];

        System.out.println("Enter 5 numbers: ");

        for (int i=0; i< userInput.length; i++){
             userInput[i] = scanner.nextInt() ;
        }
         System.out.print("You entered: ");
         for (int i=0; i< userInput.length; i++){
             System.out.print(userInput[i] + " ");

         }


    
    }
}