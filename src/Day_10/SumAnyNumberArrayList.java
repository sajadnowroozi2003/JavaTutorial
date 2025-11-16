package Day_10;

import java.util.ArrayList;
import java.util.Scanner;

public class SumAnyNumberArrayList {








    public static void sumAnyNumbers(){
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> inputNumbers = new ArrayList<Integer>();
        System.out.println("Enter 0 to stop.");
        System.out.println("Enter Any Numbers :");


        while (true){
           System.out.print("New Number: ");
           int input = scan.nextInt();
           scan.nextLine();
           if (input == 0){
               break;
           }
           
           inputNumbers.add(input);
        }
        int sum =0;
        for(int i = 0 ; i <inputNumbers.size(); i++){
            sum+= inputNumbers.get(i);
        }

        System.out.println("Sum of these number is :"+sum);

    }










}
